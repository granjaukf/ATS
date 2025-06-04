package com.mycompany.solucao1;

import org.junit.jupiter.api.Test;
import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

public class AbdominaisTest {

    @Test
    public void testConstrutorParametrizadoEGetters() {
        LocalDateTime data = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(0, 30); // 30 minutos
        int freqCardiaca = 110;
        int repeticoes = 100;

        Abdominais abd = new Abdominais(data, tempo, freqCardiaca, repeticoes);

        assertEquals(data, abd.getDataRealizacao());
        assertEquals(tempo, abd.getTempo());
        assertEquals(freqCardiaca, abd.getFreqCardiaca());
        assertEquals(repeticoes, abd.getRepeticoes());
    }

    @Test
    public void testConsumoCalorias() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        utilizador.setPeso(70);
        utilizador.setAltura(175);

        LocalTime tempo = LocalTime.of(0, 30); // 30 minutos = 1800 segundos
        Abdominais abd = new Abdominais(LocalDateTime.now(), tempo, 110, 100);

        double esperado = 3 * (utilizador.getFatorMultiplicativo()
                + abd.getFatorRepeticoes(1, 0.2)
                + abd.getFatorFreqCardiaca(utilizador))
                * utilizador.getBMR() / (24 * 60 * 60)
                * 1800;

        double resultado = abd.consumoCalorias(utilizador);
        assertEquals(esperado, resultado, 0.01);
    }

    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        utilizador.setPeso(70);
        utilizador.setAltura(175);

        double consumoDesejado = 50.0;

        Abdominais abd = new Abdominais();
        Atividade gerada = abd.geraAtividade(utilizador, consumoDesejado);

        assertTrue(gerada instanceof Abdominais);
        assertNotNull(gerada.getTempo());
        assertEquals(0, gerada.getFreqCardiaca());
        assertTrue(((Abdominais) gerada).getRepeticoes() > 0);
    }

    @Test
    public void testClone() {
        Abdominais abd1 = new Abdominais(LocalDateTime.now(), LocalTime.of(0, 20), 100, 80);
        Abdominais abd2 = (Abdominais) abd1.clone();

        assertNotSame(abd1, abd2);
        assertEquals(abd1, abd2);
    }

    @Test
    public void testEquals() {
        Abdominais abd1 = new Abdominais(LocalDateTime.now(), LocalTime.of(0, 20), 100, 80);
        Abdominais abd2 = new Abdominais(abd1);
        Abdominais abd3 = new Abdominais(LocalDateTime.now(), LocalTime.of(0, 10), 90, 50);

        assertTrue(abd1.equals(abd2));
        assertFalse(abd1.equals(abd3));
        assertFalse(abd1.equals(null));
    }

    @Test
    public void testToString() {
        Abdominais abd = new Abdominais(LocalDateTime.of(2024, 5, 9, 10, 0), LocalTime.of(0, 30), 110, 100);
        String result = abd.toString();

        assertTrue(result.contains("Tipo de atividade: Abdominais"));
        assertTrue(result.contains("Frequencia Cardiaca: 110"));
        assertTrue(result.contains("Repetiçoes: 100"));
        assertTrue(result.contains("Duraçao: 00:30"));
    }
}
