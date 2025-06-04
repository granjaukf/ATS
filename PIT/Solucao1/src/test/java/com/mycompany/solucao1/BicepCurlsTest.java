package com.mycompany.solucao1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class BicepCurlsTest {

    private BicepCurls bicepCurls;
    private UtilizadorAmador utilizador;

    @BeforeEach
    public void setUp() {
        // Inicializa um utilizador amador para os testes
        utilizador = new UtilizadorAmador("João Silva", "Rua Exemplo", "joao@example.com", 70, 75, 180, LocalDateTime.now().toLocalDate(), 'M');

        // Inicializa uma instância de BicepCurls com valores de exemplo
        bicepCurls = new BicepCurls(LocalDateTime.of(2025, 5, 28, 10, 0),
                LocalTime.of(0, 30, 0),
                120,
                15,
                20.0);
    }

    @Test
    public void testConstrutorVazio() {
        BicepCurls bc = new BicepCurls();
        assertNotNull(bc);
        assertEquals(0, bc.getRepeticoes());
        assertEquals(0.0, bc.getPeso(), 0.01);
    }

    @Test
    public void testConstrutorParametrizado() {
        assertEquals(LocalDateTime.of(2025, 5, 28, 10, 0), bicepCurls.getDataRealizacao());
        assertEquals(LocalTime.of(0, 30, 0), bicepCurls.getTempo());
        assertEquals(120, bicepCurls.getFreqCardiaca());
        assertEquals(15, bicepCurls.getRepeticoes());
        assertEquals(20.0, bicepCurls.getPeso(), 0.01);
    }

    @Test
    public void testConstrutorCopia() {
        BicepCurls copia = new BicepCurls(bicepCurls);
        assertEquals(bicepCurls, copia);
    }

    @Test
    public void testGetFatorPeso() {
        double valorNulo = 0.5;
        double valorIncremento = 2.0;
        double fatorEsperado = ((bicepCurls.getPeso() / utilizador.getPeso()) - valorNulo) * valorIncremento;
        assertEquals(fatorEsperado, bicepCurls.getFatorPeso(utilizador, valorNulo, valorIncremento), 0.01);
    }

    @Test
    public void testGetFatorRepeticoes() {
        double valorNulo = 0.1;
        double valorIncremento = 1.5;

        double resultado = bicepCurls.getFatorRepeticoes(valorNulo, valorIncremento);

        assertTrue(resultado > -1 && resultado < 10);
    }

    @Test
    public void testConsumoCalorias() {
        double consumo = bicepCurls.consumoCalorias(utilizador);
        assertTrue(consumo > 0, "O consumo de calorias deve ser maior que zero.");
    }

    @Test
    public void testGeraAtividadeSemHistorico() {
        double consumo = bicepCurls.consumoCalorias(utilizador);
        Atividade nova = bicepCurls.geraAtividade(utilizador, consumo);

        assertNotNull(nova);
        assertTrue(nova instanceof BicepCurls);
        assertTrue(((BicepCurls) nova).getPeso() > 0);
        assertTrue(((BicepCurls) nova).getRepeticoes() > 0);
    }

    @Test
    public void testEquals() {
        BicepCurls igual = new BicepCurls(bicepCurls);
        BicepCurls diferente = new BicepCurls(LocalDateTime.now(), LocalTime.of(0, 20, 0), 110, 10, 15.0);
        assertTrue(bicepCurls.equals(igual));
        assertFalse(bicepCurls.equals(diferente));
    }

    @Test
    public void testClone() {
        BicepCurls clone = (BicepCurls) bicepCurls.clone();
        assertEquals(bicepCurls, clone);
        assertNotSame(bicepCurls, clone);
    }

    @Test
    public void testToString() {
        assertTrue(bicepCurls.toString().contains("Tipo de atividade: Bicep curls"));

    }
}
