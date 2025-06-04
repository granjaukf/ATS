package com.mycompany.solucao1;
import java.time.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CorridaTest {
    private UtilizadorAmador user;
    private Corrida corridaActivity;
    private LocalDateTime testDateTime;

    @Before
    public void setUp() {
        user = new UtilizadorAmador("João Silva", "Rua Exemplo", "joao@example.com", 70, 75, 180, LocalDateTime.now().toLocalDate(), 'M');

        testDateTime = LocalDateTime.of(2023, 5, 1, 8, 0);

        // Create a running activity
        corridaActivity = new Corrida(
                testDateTime,
                LocalTime.of(0, 30, 0), // 30 minutes
                140, // heart rate
                5000.0 // distance in meters (5km)
        );
    }

    @Test
    public void testConsumoCalorias() {
        double expectedCalories = 8 * (user.getFatorMultiplicativo() +
                corridaActivity.getFatorVelocidade(2.2, 0.22) +
                corridaActivity.getFatorFreqCardiaca(user)) *
                user.getBMR() / (24 * 60 * 60) *
                corridaActivity.getTempo().toSecondOfDay();

        double actualCalories = corridaActivity.consumoCalorias(user);

        assertEquals(expectedCalories, actualCalories, 0.01);
    }

    @Test
    public void testGeraAtividade() {
        double targetCalories = 300.0;
        Atividade generatedActivity = corridaActivity.geraAtividade(user, targetCalories);

        assertTrue(generatedActivity instanceof Corrida);

        Corrida generatedCorrida = (Corrida) generatedActivity;

        // Verify the activity has reasonable values
        assertNotNull(generatedCorrida.getTempo());
        assertTrue(generatedCorrida.getDistancia() > 0);

        // Verify the relationship between time and distance
        double expectedDistance = generatedCorrida.getTempo().toSecondOfDay() * 2.2;
        assertEquals(expectedDistance, generatedCorrida.getDistancia(), 0.01);
    }

    @Test
    public void testGetVelocidade() {
        double expectedSpeed = 5000.0 / (30 * 60); // 5km in 30 minutes
        double actualSpeed = corridaActivity.getVelocidade();

        assertEquals(expectedSpeed, actualSpeed, 0.01);
    }

    @Test
    public void testGetFatorVelocidade() {
        double speed = corridaActivity.getVelocidade();
        double expectedFactor = (speed - 2.2) * 0.22;
        double actualFactor = corridaActivity.getFatorVelocidade(2.2, 0.22);

        assertEquals(expectedFactor, actualFactor, 0.01);
    }

    @Test
    public void testClone() {
        Corrida cloned = (Corrida) corridaActivity.clone();

        assertEquals(corridaActivity.getDataRealizacao(), cloned.getDataRealizacao());
        assertEquals(corridaActivity.getTempo(), cloned.getTempo());
        assertEquals(corridaActivity.getFreqCardiaca(), cloned.getFreqCardiaca());
        assertEquals(corridaActivity.getDistancia(), cloned.getDistancia(), 0.01);
    }

    @Test
    public void testEquals() {
        Corrida sameActivity = new Corrida(
                testDateTime,
                LocalTime.of(0, 30, 0),
                140,
                5000.0
        );

        Corrida differentActivity = new Corrida(
                testDateTime,
                LocalTime.of(0, 25, 0),
                135,
                4500.0
        );

        assertTrue(corridaActivity.equals(sameActivity));
        assertFalse(corridaActivity.equals(differentActivity));
    }

    @Test
    public void testToString() {
        String str = corridaActivity.toString();

        assertTrue(str.contains("Corrida"));
        assertTrue(str.contains("Distancia: 5000.0 metros"));
    }
}