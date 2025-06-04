package com.mycompany.solucao1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class BenchPressTest {

    private BenchPress benchPress;
    private UtilizadorAmador utilizador;

    @BeforeEach
    public void setUp() {
        benchPress = new BenchPress(
                LocalDateTime.of(2024, 5, 1, 10, 0),
                LocalTime.of(0, 30), // 30 minutos
                120, // frequência cardíaca
                50,  // repetições
                60   // peso
        );

        utilizador = new UtilizadorAmador();
        utilizador.setPeso(70);          // Peso em kg
        // O fator multiplicativo é fixo (1.0), já está definido na classe e não se altera
    }

    @Test
    public void testConstrutorVazio() {
        BenchPress bp = new BenchPress();
        assertNotNull(bp);
    }

    @Test
    public void testConstrutorCopia() {
        BenchPress copia = new BenchPress(benchPress);
        assertEquals(benchPress, copia);
        assertNotSame(benchPress, copia);
    }

    @Test
    public void testConsumoCalorias() {
        double calorias = benchPress.consumoCalorias(utilizador);
        assertTrue(calorias > 0);
    }

    @Test
    public void testGeraAtividade() {
        double calorias = benchPress.consumoCalorias(utilizador);
        Atividade gerada = benchPress.geraAtividade(utilizador, calorias);
        assertTrue(gerada instanceof BenchPress);
        assertEquals(0, gerada.getFreqCardiaca());
        assertTrue(((AtivRepeticoes) gerada).getRepeticoes() > 0);
        assertTrue(((AtivRepsPeso) gerada).getPeso() > 0);
    }

    @Test
    public void testToString() {
        String str = benchPress.toString();
        assertTrue(str.contains("Bench press"));
    }

    @Test
    public void testEquals() {
        BenchPress outra = new BenchPress(benchPress);
        assertEquals(benchPress, outra);
        assertNotEquals(benchPress, null);
        assertNotEquals(benchPress, new Object());
    }

    @Test
    public void testClone() {
        BenchPress clone = (BenchPress) benchPress.clone();
        assertEquals(benchPress, clone);
        assertNotSame(benchPress, clone);
    }
}
