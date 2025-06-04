package com.mycompany.solucao1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TrailTest {

    @Test
    public void testConstrutorParametrizado() {
        LocalDateTime dt = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 0, 0); // 1 hora
        int freq = 120;
        double distancia = 10.0;
        double altimetria = 1500.0;

        Trail trail = new Trail(dt, tempo, freq, distancia, altimetria);

        assertEquals(dt, trail.getDataRealizacao());
        assertEquals(tempo, trail.getTempo());
        assertEquals(freq, trail.getFreqCardiaca());
        assertEquals(distancia, trail.getDistancia());
        assertEquals(altimetria, trail.getAltimetria());
    }

    @Test
    public void testGetFatorHard() {
        Trail trail = new Trail();
        trail.setAltimetria(500);
        assertEquals(1.15, trail.getFatorHard(), 0.0001);

        trail.setAltimetria(1500);
        assertEquals(1.25, trail.getFatorHard(), 0.0001);

        trail.setAltimetria(2500);
        assertEquals(1.35, trail.getFatorHard(), 0.0001);
    }

    @Test
    public void testConsumoCalorias() {
        // Cria um utilizador amador com valores plausíveis
        UtilizadorAmador utilizador = new UtilizadorAmador();

        LocalDateTime dt = LocalDateTime.now();
        LocalTime tempo = LocalTime.of(0, 30, 0); // 30 minutos
        Trail trail = new Trail(dt, tempo, 100, 5.0, 1000);

        // Aqui vamos buscar o BMR via método do Utilizador, assumindo que existe
        double bmr = utilizador.getBMR();  // tem que existir no Utilizador, caso contrário adapta

        double esperado = Trail.MET *
                (utilizador.getFatorMultiplicativo() +
                        trail.getFatorVelocidade(2.2, 0.22) +
                        trail.getFatorFreqCardiaca(utilizador) +
                        trail.getFatorAltimetria())
                * bmr / (24 * 60 * 60)
                * trail.getFatorHard()
                * tempo.toSecondOfDay();

        assertEquals(esperado, trail.consumoCalorias(utilizador), 0.0001);
    }


    @Test
    public void testClone() {
        Trail original = new Trail(LocalDateTime.now(), LocalTime.of(1, 0), 100, 10, 2000);
        Trail clone = (Trail) original.clone();

        assertEquals(original, clone);
        assertNotSame(original, clone);
    }

    @Test
    public void testEquals() {
        Trail t1 = new Trail(LocalDateTime.now(), LocalTime.of(1, 0), 100, 10, 2000);
        Trail t2 = new Trail(t1);
        Trail t3 = new Trail(LocalDateTime.now(), LocalTime.of(0, 30), 90, 5, 1000);

        assertTrue(t1.equals(t2));
        assertFalse(t1.equals(t3));
        assertFalse(t1.equals(null));
        assertFalse(t1.equals("outra coisa"));
    }

    @Test
    public void testToString() {
        Trail trail = new Trail(LocalDateTime.now(), LocalTime.of(1, 0), 100, 10, 2000);
        String str = trail.toString();
        assertTrue(str.contains("Tipo de atividade: Trail"));
        assertTrue(str.contains("Altimetria"));
        assertTrue(str.contains("Distancia"));
    }
}
