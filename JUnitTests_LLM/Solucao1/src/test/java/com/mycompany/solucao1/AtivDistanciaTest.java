package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtivDistanciaTest {

    // Classe de implementação concreta de AtivDistancia para realizar os testes
    private class AtivDistanciaConcreta extends AtivDistancia {
        public AtivDistanciaConcreta() {
            super();
        }

        public AtivDistanciaConcreta(LocalDateTime realizacao, LocalTime tempo, int freqCardiaca, double distancia) {
            super(realizacao, tempo, freqCardiaca, distancia);
        }

        public AtivDistanciaConcreta(AtivDistancia umaAtivDistancia) {
            super(umaAtivDistancia);
        }

        @Override
        public double consumoCalorias(Utilizador utilizador) {
            return 200.0 * getFatorVelocidade(5.0, 0.3); 
        }

        @Override
        public Atividade geraAtividade(Utilizador utilizador, double consumoCalorias) {
            return new AtivDistanciaConcreta();
        }

        @Override
        public Object clone() {
            return new AtivDistanciaConcreta(this);
        }
    }

    @Test
    public void testGetVelocidade() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);

        double expectedVelocidade = distancia / tempo.toSecondOfDay();
        assertEquals(expectedVelocidade, atividade.getVelocidade(), 0.0001);
    }

    @Test
    public void testGetFatorVelocidade() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);

        double valorNulo = 2.0;  // Exemplo de velocidade mínima
        double valorIncremento = 0.5; // Valor de incremento

        double velocidade = atividade.getVelocidade();
        double expectedFator = (velocidade - valorNulo) * valorIncremento;

        assertEquals(expectedFator, atividade.getFatorVelocidade(valorNulo, valorIncremento), 0.0001);
    }

    @Test
    public void testConsumoCalorias() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);

        double fatorVelocidade = atividade.getFatorVelocidade(5.0, 0.3); // cálculo do fator
        double expectedCalorias = 200.0 * fatorVelocidade;

        assertEquals(expectedCalorias, atividade.consumoCalorias(new UtilizadorAmador()), 0.0001);
    }

    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);

        double consumoCalorias = 200.0;
        Atividade novaAtividade = atividade.geraAtividade(utilizador, consumoCalorias);

        assertNotNull(novaAtividade);
        assertTrue(novaAtividade instanceof AtivDistanciaConcreta);
    }

    @Test
    public void testClone() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);
        AtivDistanciaConcreta clone = (AtivDistanciaConcreta) atividade.clone();

        // Verificar se o clone não é o mesmo objeto (referência diferente)
        assertNotSame(atividade, clone);

        assertEquals(atividade.getCodAtividade(), clone.getCodAtividade());
        assertEquals(atividade.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(atividade.getTempo(), clone.getTempo());
        assertEquals(atividade.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(atividade.getDistancia(), clone.getDistancia(), 0.0001);
    }

    @Test
    public void testToString() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0);
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km

        AtivDistanciaConcreta atividade = new AtivDistanciaConcreta(dataRealizacao, tempo, freqCardiaca, distancia);
        String resultado = atividade.toString();


        assertTrue(resultado.contains("Atividade"));
        assertTrue(resultado.contains("Id: " + atividade.getCodAtividade()));
        assertTrue(resultado.contains("Data e hora: "));
        assertTrue(resultado.contains("Duraçao: " + tempo));
        assertTrue(resultado.contains("Frequencia Cardiaca: " + freqCardiaca + " bpm"));
        assertTrue(resultado.contains("Distancia: " + distancia + " metros"));
    }
}
