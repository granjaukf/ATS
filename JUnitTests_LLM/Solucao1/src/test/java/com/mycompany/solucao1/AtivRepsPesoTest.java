package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtivRepsPesoTest {

    // Classe de implementação concreta de AtivRepsPeso para realizar os testes
    private class AtivRepsPesoConcreta extends AtivRepsPeso {
        public AtivRepsPesoConcreta() {
            super();
        }

        public AtivRepsPesoConcreta(LocalDateTime realizacao, LocalTime tempo, int freqCardiaca, int repeticoes, double peso) {
            super(realizacao, tempo, freqCardiaca, repeticoes, peso);
        }

        public AtivRepsPesoConcreta(AtivRepsPeso umaAtivRepsPeso) {
            super(umaAtivRepsPeso);
        }

        @Override
        public double consumoCalorias(Utilizador utilizador) {
            return 150.0 * getFatorPeso(utilizador, 1.0, 0.5); // Fator de peso de exemplo
        }

        @Override
        public Atividade geraAtividade(Utilizador utilizador, double consumoCalorias) {
            return new AtivRepsPesoConcreta();
        }

        @Override
        public Object clone() {
            return new AtivRepsPesoConcreta(this);
        }
    }

    @Test
    public void testGetPeso() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);

        assertEquals(peso, atividade.getPeso(), 0.0001);
    }

    @Test
    public void testGetFatorPeso() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        utilizador.setPeso(70); // Exemplo de peso do utilizador (70 kg)

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);

        double valorNulo = 1.0;  // Exemplo de razão de peso mínima
        double valorIncremento = 0.5; // Valor de incremento

        double razaoPeso = peso / utilizador.getPeso();
        double expectedFator = (razaoPeso - valorNulo) * valorIncremento;

        assertEquals(expectedFator, atividade.getFatorPeso(utilizador, valorNulo, valorIncremento), 0.0001);
    }

    @Test
    public void testConsumoCalorias() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        utilizador.setPeso(70); // Exemplo de peso do utilizador (70 kg)

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);

        double fatorPeso = atividade.getFatorPeso(utilizador, 1.0, 0.5); // Exemplo de cálculo do fator
        double expectedCalorias = 150.0 * fatorPeso;

        assertEquals(expectedCalorias, atividade.consumoCalorias(utilizador), 0.0001);
    }

    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);

        double consumoCalorias = 150.0;
        Atividade novaAtividade = atividade.geraAtividade(utilizador, consumoCalorias);

        assertNotNull(novaAtividade);
        assertTrue(novaAtividade instanceof AtivRepsPesoConcreta);
    }

    @Test
    public void testClone() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);
        AtivRepsPesoConcreta clone = (AtivRepsPesoConcreta) atividade.clone();

        // Verificar se o clone não é o mesmo objeto (referência diferente)
        assertNotSame(atividade, clone);

        // Verificar se os atributos são iguais
        assertEquals(atividade.getCodAtividade(), clone.getCodAtividade());
        assertEquals(atividade.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(atividade.getTempo(), clone.getTempo());
        assertEquals(atividade.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(atividade.getRepeticoes(), clone.getRepeticoes());
        assertEquals(atividade.getPeso(), clone.getPeso(), 0.0001);
    }

    @Test
    public void testToString() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        int repeticoes = 200;
        double peso = 25.0;  // 25 kg

        AtivRepsPesoConcreta atividade = new AtivRepsPesoConcreta(dataRealizacao, tempo, freqCardiaca, repeticoes, peso);
        String resultado = atividade.toString();

        // Verificar se o resultado contém informações importantes
        assertTrue(resultado.contains("Atividade"));
        assertTrue(resultado.contains("Id: " + atividade.getCodAtividade()));
        assertTrue(resultado.contains("Data e hora: "));
        assertTrue(resultado.contains("Duraçao: " + tempo));
        assertTrue(resultado.contains("Frequencia Cardiaca: " + freqCardiaca + " bpm"));
        assertTrue(resultado.contains("Repetiçoes: " + repeticoes));
        assertTrue(resultado.contains("Peso: " + peso + " kilos"));
    }
}
