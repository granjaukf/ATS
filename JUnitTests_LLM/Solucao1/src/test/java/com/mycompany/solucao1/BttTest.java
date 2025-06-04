package com.mycompany.solucao1;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BttTest {
    private UtilizadorAmador user;
    private Btt bttActivity;
    private LocalDateTime testDateTime;

    @BeforeEach
    public void setUp() {
        // Create an amateur user for testing
        user = new UtilizadorAmador("João Silva", "Rua Exemplo", "joao@example.com", 70, 75, 180, LocalDateTime.now().toLocalDate(), 'M');
        testDateTime = LocalDateTime.of(2023, 6, 10, 9, 30);

        // Create a BTT activity
        bttActivity = new Btt(
                testDateTime,
                LocalTime.of(1, 45, 0), // 1 hour 45 minutes
                150, // heart rate
                35000.0, // distance in meters (35km)
                1200.0 // altitude gain in meters
        );
    }

    @Test
    public void testConsumoCalorias() {
        double expectedCalories = 10 * (user.getFatorMultiplicativo() +
                bttActivity.getFatorVelocidade(10.5, 0.11) +
                bttActivity.getFatorFreqCardiaca(user) +
                bttActivity.getFatorAltimetria()) *
                user.getBMR() / (24 * 60 * 60) *
                bttActivity.getFatorHard() *
                bttActivity.getTempo().toSecondOfDay();

        double actualCalories = bttActivity.consumoCalorias(user);

        assertEquals(expectedCalories, actualCalories, 0.01);
    }

    @Test
    public void testGetFatorHard() {
        // Test with medium altitude (1200m)
        double expectedFactor = 1.15; // 1.05 base + 0.10 for >1000m
        assertEquals(expectedFactor, bttActivity.getFatorHard(), 0.01);

        // Test with low altitude
        Btt lowAltitude = new Btt(testDateTime, LocalTime.of(1, 0, 0), 140, 25000.0, 800.0);
        assertEquals(1.05, lowAltitude.getFatorHard(), 0.01);

        // Test with high altitude
        Btt highAltitude = new Btt(testDateTime, LocalTime.of(2, 0, 0), 160, 40000.0, 2500.0);
        assertEquals(1.25, highAltitude.getFatorHard(), 0.01);
    }

    @Test
    public void testGeraAtividade() {
        double targetCalories = 500.0;
        Atividade generatedActivity = bttActivity.geraAtividade(user, targetCalories);

        assertTrue(generatedActivity instanceof Btt);

        Btt generatedBtt = (Btt) generatedActivity;

        // Verify the activity has reasonable values
        assertNotNull(generatedBtt.getTempo());
        assertTrue(generatedBtt.getDistancia() > 0);
        assertTrue(generatedBtt.getAltimetria() >= 0);

        // Verify the relationship between time and distance
        double expectedDistance = generatedBtt.getTempo().toSecondOfDay() * 10.5;
        assertEquals(expectedDistance, generatedBtt.getDistancia(), 0.01);
    }

    @Test
    public void testGetFatorAltimetria() {
        double expectedFactor = 1200.0 * 0.0005; // 0.6
        assertEquals(expectedFactor, bttActivity.getFatorAltimetria(), 0.01);
    }

    @Test
    public void testGetVelocidade() {
        double expectedSpeed = 35000.0 / (105 * 60); // 35km in 1h45m
        double actualSpeed = bttActivity.getVelocidade();

        assertEquals(expectedSpeed, actualSpeed, 0.01);
    }

    @Test
    public void testClone() {
        Btt cloned = (Btt) bttActivity.clone();

        assertEquals(bttActivity.getDataRealizacao(), cloned.getDataRealizacao());
        assertEquals(bttActivity.getTempo(), cloned.getTempo());
        assertEquals(bttActivity.getFreqCardiaca(), cloned.getFreqCardiaca());
        assertEquals(bttActivity.getDistancia(), cloned.getDistancia(), 0.01);
        assertEquals(bttActivity.getAltimetria(), cloned.getAltimetria(), 0.01);
    }

    @Test
    public void testEquals() {
        Btt sameActivity = new Btt(
                testDateTime,
                LocalTime.of(1, 45, 0),
                150,
                35000.0,
                1200.0
        );

        Btt differentActivity = new Btt(
                testDateTime,
                LocalTime.of(1, 30, 0),
                145,
                30000.0,
                1000.0
        );

        assertTrue(bttActivity.equals(sameActivity));
        assertFalse(bttActivity.equals(differentActivity));
    }

    @Test
    public void testToString() {
        String str = bttActivity.toString();

        assertTrue(str.contains("BTT"));
        assertTrue(str.contains("Distancia: 35000.0 metros"));
        assertTrue(str.contains("Altimetria: 1200.0 metros"));
    }
}