package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtivRepeticoesTest {

    // Classe de implementação concreta de AtivRepeticoes para realizar os testes
    private class AtivRepeticoesConcreta extends AtivRepeticoes {
        public AtivRepeticoesConcreta() {
            super();
        }

        public AtivRepeticoesConcreta(LocalDateTime realizacao, LocalTime tempo, int freqCardiaca, int repeticoes) {
            super(realizacao, tempo, freqCardiaca, repeticoes);
        }

        public AtivRepeticoesConcreta(AtivRepeticoes umaAtivRepeticoes) {
            super(umaAtivRepeticoes);
        }

        @Override
        public double consumoCalorias(Utilizador utilizador) {
            return 100.0 * getFatorRepeticoes(1.0, 0.2); 
        }

        @Override
        public Atividade geraAtividade(Utilizador utilizador, double consumoCalorias) {
            return new AtivRepeticoesConcreta();
        }

        @Override
        public Object clone() {
            return new AtivRepeticoesConcreta(this);
        }
    }

    @Test
    public void testGetRepeticoes() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0);
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);

        assertEquals(repeticoes, atividade.getRepeticoes());
    }

    @Test
    public void testGetFatorRepeticoes() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);

        double valorNulo = 2.0;  // repetições mínimas por segundo
        double valorIncremento = 0.2; // valor de incremento

        double repeticoesPorSegundo = atividade.getRepeticoes() / tempo.toSecondOfDay();
        double expectedFator = (repeticoesPorSegundo - valorNulo) * valorIncremento;

        assertEquals(expectedFator, atividade.getFatorRepeticoes(valorNulo, valorIncremento), 0.0001);
    }

    @Test
    public void testConsumoCalorias() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);

        double fatorRepeticoes = atividade.getFatorRepeticoes(1.0, 0.2); // cálculo do fator
        double expectedCalorias = 100.0 * fatorRepeticoes;

        assertEquals(expectedCalorias, atividade.consumoCalorias(new UtilizadorAmador()), 0.0001);
    }

    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0);
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);

        double consumoCalorias = 100.0;
        Atividade novaAtividade = atividade.geraAtividade(utilizador, consumoCalorias);

        assertNotNull(novaAtividade);
        assertTrue(novaAtividade instanceof AtivRepeticoesConcreta);
    }

    @Test
    public void testClone() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);
        AtivRepeticoesConcreta clone = (AtivRepeticoesConcreta) atividade.clone();

        // verificar se o clone não é o mesmo objeto (referência diferente)
        assertNotSame(atividade, clone);

  
        assertEquals(atividade.getCodAtividade(), clone.getCodAtividade());
        assertEquals(atividade.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(atividade.getTempo(), clone.getTempo());
        assertEquals(atividade.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(atividade.getRepeticoes(), clone.getRepeticoes());
    }

    @Test
    public void testToString() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        int repeticoes = 200;

        AtivRepeticoesConcreta atividade = new AtivRepeticoesConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes);
        String resultado = atividade.toString();

        assertTrue(resultado.contains("Atividade"));
        assertTrue(resultado.contains("Id: " + atividade.getCodAtividade()));
        assertTrue(resultado.contains("Data e hora: "));
        assertTrue(resultado.contains("Duraçao: " + tempo));
        assertTrue(resultado.contains("Frequencia Cardiaca: " + freqCardiaca + " bpm"));
        assertTrue(resultado.contains("Repetiçoes: " + repeticoes));
    }
}
