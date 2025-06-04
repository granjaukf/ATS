package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtivDistAltimetriaTest {

    // Classe de implementação concreta de AtivDistAltimetria para realizar os testes
    private class AtivDistAltimetriaConcreta extends AtivDistAltimetria {
        public AtivDistAltimetriaConcreta() {
            super();
        }

        public AtivDistAltimetriaConcreta(LocalDateTime realizacao, LocalTime tempo, int freqCardiaca, double distancia, double altimetria) {
            super(realizacao, tempo, freqCardiaca, distancia, altimetria);
        }

        public AtivDistAltimetriaConcreta(AtivDistAltimetria umaAtivDistAltimetria) {
            super(umaAtivDistAltimetria);
        }

        @Override
        public double consumoCalorias(Utilizador utilizador) {
            return 200.0 * getFatorAltimetria(); // Fator de altimetria de exemplo
        }

        @Override
        public Atividade geraAtividade(Utilizador utilizador, double consumoCalorias) {
            return new AtivDistAltimetriaConcreta();
        }

        @Override
        public Object clone() {
            return new AtivDistAltimetriaConcreta(this);
        }
    }

    @Test
    public void testGetAltimetria() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 metros de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);

        assertEquals(altimetria, atividade.getAltimetria(), 0.0001);
    }

    @Test
    public void testGetFatorAltimetria() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 metros de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);

        double expectedFator = altimetria * 0.0005; // fator calculado pela altimetria
        assertEquals(expectedFator, atividade.getFatorAltimetria(), 0.0001);
    }

    @Test
    public void testConsumoCalorias() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 m de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);

        double fatorAltimetria = atividade.getFatorAltimetria(); // cálculo do fator de altimetria
        double expectedCalorias = 200.0 * fatorAltimetria;

        assertEquals(expectedCalorias, atividade.consumoCalorias(new UtilizadorAmador()), 0.0001);
    }

    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();

        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); // 1 hora
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 metros de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);

        double consumoCalorias = 200.0;
        Atividade novaAtividade = atividade.geraAtividade(utilizador, consumoCalorias);

        assertNotNull(novaAtividade);
        assertTrue(novaAtividade instanceof AtivDistAltimetriaConcreta);
    }

    @Test
    public void testClone() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0);
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 m de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);
        AtivDistAltimetriaConcreta clone = (AtivDistAltimetriaConcreta) atividade.clone();

        // verificar se o clone não é o mesmo objeto (referência diferente)
        assertNotSame(atividade, clone);

        assertEquals(atividade.getCodAtividade(), clone.getCodAtividade());
        assertEquals(atividade.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(atividade.getTempo(), clone.getTempo());
        assertEquals(atividade.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(atividade.getDistancia(), clone.getDistancia(), 0.0001);
        assertEquals(atividade.getAltimetria(), clone.getAltimetria(), 0.0001);
    }

    @Test
    public void testToString() {
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0); 
        int freqCardiaca = 120;
        double distancia = 10000; // 10 km
        double altimetria = 500;  // 500 m de altimetria

        AtivDistAltimetriaConcreta atividade = new AtivDistAltimetriaConcreta(dataRealizacao, tempo, freqCardiaca, distancia, altimetria);
        String resultado = atividade.toString();

    
        assertTrue(resultado.contains("Atividade"));
        assertTrue(resultado.contains("Id: " + atividade.getCodAtividade()));
        assertTrue(resultado.contains("Data e hora: "));
        assertTrue(resultado.contains("Duraçao: " + tempo));
        assertTrue(resultado.contains("Frequencia Cardiaca: " + freqCardiaca + " bpm"));
        assertTrue(resultado.contains("Distancia: " + distancia + " metros"));
        assertTrue(resultado.contains("Altimetria: " + altimetria + " metros"));
    }
}
