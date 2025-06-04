package com.mycompany.solucao1;
import java.time.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LegPressTest {
    private UtilizadorAmador user;
    private LegPress legPressActivity;
    private LocalDateTime testDateTime;

    @BeforeEach
    public void setUp() {
        // Create an amateur user for testing
        user = new UtilizadorAmador("João Silva", "Rua Exemplo", "joao@example.com", 70, 75, 180, LocalDateTime.now().toLocalDate(), 'M');

        testDateTime = LocalDateTime.of(2023, 5, 1, 10, 0);

        // Create a leg press activity
        legPressActivity = new LegPress(
                testDateTime,
                LocalTime.of(0, 5, 0), // 5 minutes
                130, // heart rate
                50,  // repetitions
                100.0 // weight in kg
        );
    }

    @Test
    public void testConsumoCalorias() {
        double expectedCalories = 4 * (user.getFatorMultiplicativo() +
                legPressActivity.getFatorRepeticoes(0.5, 0.2) +
                legPressActivity.getFatorPeso(user, 1, 0.2) +
                legPressActivity.getFatorFreqCardiaca(user)) *
                user.getBMR() / (24 * 60 * 60) *
                legPressActivity.getTempo().toSecondOfDay();

        double actualCalories = legPressActivity.consumoCalorias(user);

        assertEquals(expectedCalories, actualCalories, 0.01);
    }

    @Test
    public void testGeraAtividade() {
        double targetCalories = 200.0;
        Atividade generatedActivity = legPressActivity.geraAtividade(user, targetCalories);

        assertTrue(generatedActivity instanceof LegPress);

        LegPress generatedLegPress = (LegPress) generatedActivity;

        // Verify the activity has reasonable values
        assertNotNull(generatedLegPress.getTempo());
        assertTrue(generatedLegPress.getRepeticoes() > 0);
        assertTrue(generatedLegPress.getPeso() > 0);
    }

    @Test
    public void testClone() {
        LegPress cloned = (LegPress) legPressActivity.clone();

        assertEquals(legPressActivity.getDataRealizacao(), cloned.getDataRealizacao());
        assertEquals(legPressActivity.getTempo(), cloned.getTempo());
        assertEquals(legPressActivity.getFreqCardiaca(), cloned.getFreqCardiaca());
        assertEquals(legPressActivity.getRepeticoes(), cloned.getRepeticoes());
        assertEquals(legPressActivity.getPeso(), cloned.getPeso(), 0.01);
    }

    @Test
    public void testEquals() {
        LegPress sameActivity = new LegPress(
                testDateTime,
                LocalTime.of(0, 5, 0),
                130,
                50,
                100.0
        );

        LegPress differentActivity = new LegPress(
                testDateTime,
                LocalTime.of(0, 6, 0),
                140,
                60,
                110.0
        );

        assertTrue(legPressActivity.equals(sameActivity));
        assertFalse(legPressActivity.equals(differentActivity));
    }

    @Test
    public void testToString() {
        String str = legPressActivity.toString();

        assertTrue(str.contains("Leg press"));
        assertTrue(str.contains("Peso: 100.0 kilos"));
        assertTrue(str.contains("Repetiçoes: 50"));
        assertTrue(str.contains("Tipo de atividade: Leg press"));
    }
}