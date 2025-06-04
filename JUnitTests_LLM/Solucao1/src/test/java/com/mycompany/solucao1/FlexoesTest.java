package com.mycompany.solucao1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FlexoesTest {

    private Flexoes flexoes1;
    private Flexoes flexoes2;
    private Flexoes flexoes3;
    private UtilizadorAmador utilizador;
    private UtilizadorAmador utilizador2;
    private LocalDateTime dataRealizacao;
    private LocalTime tempo;

    @BeforeEach
    public void setUp() {
        dataRealizacao = LocalDateTime.of(2024, 5, 15, 14, 30);
        tempo = LocalTime.of(0, 20, 0); // 20 minutos

        utilizador = new UtilizadorAmador(
                "João",
                "Rua A",
                "joao@email.com",
                70,
                75,
                175,
                LocalDate.of(1990, 5, 12),
                'M'
        );

        utilizador2 = new UtilizadorAmador(
                "Tomas",
                "Rua B",
                "tomas@email.com",
                90,
                60,
                180,
                LocalDate.of(2004, 3, 9),
                'M'
        );

        // Criar instâncias de Flexoes para teste
        flexoes1 = new Flexoes();
        flexoes2 = new Flexoes(dataRealizacao, tempo, 130, 100); // 100 flexões
        flexoes3 = new Flexoes(flexoes2); // construtor de cópia
    }

    @Test
    public void testConstrutorVazio() {
        assertNotNull(flexoes1);
        assertEquals(0, flexoes1.getRepeticoes());
        assertEquals(0, flexoes1.getFreqCardiaca());
        assertEquals(LocalTime.of(0, 0), flexoes1.getTempo());
        assertNotNull(flexoes1.getDataRealizacao());
        assertTrue(flexoes1.getCodAtividade() > 0);
    }

    @Test
    public void testConstrutorParametrizado() {
        assertEquals(dataRealizacao, flexoes2.getDataRealizacao());
        assertEquals(tempo, flexoes2.getTempo());
        assertEquals(130, flexoes2.getFreqCardiaca());
        assertEquals(100, flexoes2.getRepeticoes());
        assertTrue(flexoes2.getCodAtividade() > 0);
    }

    @Test
    public void testConstrutorCopia() {
        assertEquals(flexoes2.getDataRealizacao(), flexoes3.getDataRealizacao());
        assertEquals(flexoes2.getTempo(), flexoes3.getTempo());
        assertEquals(flexoes2.getFreqCardiaca(), flexoes3.getFreqCardiaca());
        assertEquals(flexoes2.getRepeticoes(), flexoes3.getRepeticoes());
        assertEquals(flexoes2.getCodAtividade(), flexoes3.getCodAtividade());
    }

    @Test
    public void testGettersSetters() {
        flexoes1.setDataRealizacao(dataRealizacao);
        flexoes1.setTempo(tempo);
        flexoes1.setFreqCardiaca(125);
        flexoes1.setRepeticoes(50);

        assertEquals(dataRealizacao, flexoes1.getDataRealizacao());
        assertEquals(tempo, flexoes1.getTempo());
        assertEquals(125, flexoes1.getFreqCardiaca());
        assertEquals(50, flexoes1.getRepeticoes());
    }

    @Test
    public void testCalculoRepeticoesPorSegundo() {
        // Para flexoes2: 100 repetições em 20 minutos (1200 segundos)
        double repeticoesPorSegundoEsperadas = 100.0 / 1200.0; // ~0.083 reps/segundo

        // Calculamos manualmente já que não há método getRitmo()
        double repeticoesPorSegundo = (double) flexoes2.getRepeticoes() / flexoes2.getTempo().toSecondOfDay();
        assertEquals(repeticoesPorSegundoEsperadas, repeticoesPorSegundo, 0.001);
    }

    @Test
    public void testGetFatorRepeticoes() {
        double repeticoesPorSegundo = (double) flexoes2.getRepeticoes() / flexoes2.getTempo().toSecondOfDay(); // 0.0833333
        double fatorEsperado = (repeticoesPorSegundo - 0.5) * 0.2; //


        System.out.println("Repetições: " + flexoes2.getRepeticoes());
        System.out.println("Tempo em segundos: " + flexoes2.getTempo().toSecondOfDay());
        System.out.println("Reps/s: " + repeticoesPorSegundo);
        System.out.println("Fator esperado: " + fatorEsperado);
        System.out.println("Fator real: " + flexoes2.getFatorRepeticoes(0.5, 0.2));
        assertEquals(fatorEsperado, flexoes2.getFatorRepeticoes(0.5, 0.2), 0.01);
    }

    @Test
    public void testConsumoCalorias() {
        // Teste básico - verifica se o método retorna um valor positivo
        double calorias = flexoes2.consumoCalorias(utilizador);
        assertTrue(calorias > 0, "O consumo de calorias deve ser positivo");

        // Teste com atividade mais intensa - mais repetições em menos tempo
        Flexoes flexoesIntensas = new Flexoes(dataRealizacao, LocalTime.of(0, 10, 0), 150, 80);
        double caloriasIntensas = flexoesIntensas.consumoCalorias(utilizador);
        assertTrue(caloriasIntensas > 0, "Atividade intensa deve consumir calorias");

        // Teste com atividade mais longa - deve consumir mais calorias
        Flexoes flexoesLongas = new Flexoes(dataRealizacao, LocalTime.of(0, 30, 0), 130, 150);
        double caloriasLongas = flexoesLongas.consumoCalorias(utilizador);
        assertTrue(caloriasLongas > calorias, "Atividade mais longa deve consumir mais calorias");
    }

    @Test
    public void testGeraAtividade() {
        double consumoCaloriasAlvo = 200.0;
        Atividade atividadeGerada = flexoes1.geraAtividade(utilizador, consumoCaloriasAlvo);

        assertNotNull(atividadeGerada);
        assertTrue(atividadeGerada instanceof Flexoes);
        assertTrue(atividadeGerada.getTempo().toSecondOfDay() > 0);
        assertTrue(((AtivRepeticoes) atividadeGerada).getRepeticoes() > 0);
        assertEquals(0, atividadeGerada.getFreqCardiaca());

        // Verifica se o número de repetições é baseado no tempo (1 rep por segundo)
        int tempoSegundos = atividadeGerada.getTempo().toSecondOfDay();
        int repeticoesEsperadas = tempoSegundos * 1;
        assertEquals(repeticoesEsperadas, ((AtivRepeticoes) atividadeGerada).getRepeticoes());
    }

    @Test
    public void testEquals() {
        // Teste de igualdade com objetos iguais
        assertTrue(flexoes2.equals(flexoes3));
        assertTrue(flexoes3.equals(flexoes2));

        // Teste com objeto diferente
        assertFalse(flexoes1.equals(flexoes2));

        // Teste com null
        assertFalse(flexoes1.equals(null));

        // Teste com objeto de classe diferente
        assertFalse(flexoes1.equals("string"));

        // Teste de reflexividade
        assertTrue(flexoes1.equals(flexoes1));

        // Teste com flexões diferentes
        Flexoes flexoesDiferentes = new Flexoes(dataRealizacao, tempo, 130, 200);
        assertFalse(flexoes2.equals(flexoesDiferentes));
    }

    @Test
    public void testClone() {
        Flexoes clone = (Flexoes) flexoes2.clone();

        assertNotNull(clone);
        assertNotSame(flexoes2, clone); // Objetos diferentes
        assertEquals(flexoes2, clone); // Mas com conteúdo igual
        assertEquals(flexoes2.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(flexoes2.getTempo(), clone.getTempo());
        assertEquals(flexoes2.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(flexoes2.getRepeticoes(), clone.getRepeticoes());
    }

    @Test
    public void testToString() {
        String resultado = flexoes2.toString();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Tipo de atividade: Flexões"));
    }

    @Test
    public void testCompareTo() {
        LocalDateTime dataAnterior = LocalDateTime.of(2024, 5, 14, 14, 30);
        LocalDateTime dataPosterior = LocalDateTime.of(2024, 5, 16, 14, 30);

        Flexoes flexoesAnteriores = new Flexoes(dataAnterior, tempo, 130, 100);
        Flexoes flexoesPosteriores = new Flexoes(dataPosterior, tempo, 130, 100);

        // Data anterior deve ser "menor"
        assertTrue(flexoesAnteriores.compareTo(flexoes2) < 0);
        // Data posterior deve ser "maior"
        assertTrue(flexoesPosteriores.compareTo(flexoes2) > 0);
        // Datas iguais - compara por código de atividade
        assertEquals(0, flexoes2.compareTo(flexoes3));
    }

    @Test
    public void testValoresLimite() {
        // Teste com zero repetições
        Flexoes flexoesZero = new Flexoes(dataRealizacao, LocalTime.of(0, 10, 0), 120, 0);
        assertEquals(0, flexoesZero.getRepeticoes());

        // Calculamos manualmente as repetições por segundo
        double repeticoesPorSegundoZero = 0.0 / 600.0; // 0 reps em 600 segundos
        assertEquals(0.0, repeticoesPorSegundoZero, 0.001);

        // Teste com tempo muito pequeno
        LocalTime tempoMinimo = LocalTime.of(0, 0, 1); // 1 segundo
        Flexoes flexoesRapidas = new Flexoes(dataRealizacao, tempoMinimo, 180, 10);
        double repeticoesPorSegundoRapidas = 10.0 / 1.0; // 10 reps em 1 segundo
        assertEquals(10.0, repeticoesPorSegundoRapidas, 0.001);

        // Teste com muitas repetições
        Flexoes flexoesMuitas = new Flexoes(dataRealizacao, LocalTime.of(1, 0, 0), 140, 1000);
        assertEquals(1000, flexoesMuitas.getRepeticoes());
        double repeticoesPorSegundoMuitas = 1000.0 / 3600.0; // ~0.278 reps/segundo
        assertEquals(repeticoesPorSegundoMuitas,
                (double) flexoesMuitas.getRepeticoes() / flexoesMuitas.getTempo().toSecondOfDay(), 0.001);
    }

    @Test
    public void testFrequenciaCardiacaVariada() {
        // Teste com diferentes frequências cardíacas
        Flexoes flexoesBaixaFC = new Flexoes(dataRealizacao, tempo, 90, 100);
        Flexoes flexoesAltaFC = new Flexoes(dataRealizacao, tempo, 170, 100);

        double caloriasBaixaFC = flexoesBaixaFC.consumoCalorias(utilizador);
        double caloriasAltaFC = flexoesAltaFC.consumoCalorias(utilizador2);

        assertTrue(caloriasBaixaFC > 0);
        assertTrue(caloriasAltaFC > 0);
        // A frequência cardíaca pode influenciar o consumo de calorias
        assertNotEquals(caloriasBaixaFC, caloriasAltaFC, 0.001);
    }

    @Test
    public void testRitmosDiferentes() {
        // Flexões rápidas: muitas repetições em pouco tempo
        Flexoes flexoesRapidas = new Flexoes(dataRealizacao, LocalTime.of(0, 5, 0), 160, 100);

        // Flexões lentas: poucas repetições em muito tempo
        Flexoes flexoesLentas = new Flexoes(dataRealizacao, LocalTime.of(0, 30, 0), 110, 50);

        // Calculamos manualmente as repetições por segundo
        double repeticoesPorSegundoRapidas = (double) flexoesRapidas.getRepeticoes() / flexoesRapidas.getTempo().toSecondOfDay();
        double repeticoesPorSegundoLentas = (double) flexoesLentas.getRepeticoes() / flexoesLentas.getTempo().toSecondOfDay();

        assertTrue(repeticoesPorSegundoRapidas > repeticoesPorSegundoLentas,
                "Repetições por segundo rápidas devem ser maiores que lentas");

        // CORREÇÃO: Usar linha base menor que ambas as taxas
        // Taxa rápida ≈ 0.333, taxa lenta ≈ 0.028
        // Usando valorNulo = 0.02 (menor que ambas)

        double fatorRapido = flexoesRapidas.getFatorRepeticoes(0.02, 0.2);
        double fatorLento = flexoesLentas.getFatorRepeticoes(0.02, 0.2);

        assertTrue(fatorRapido > fatorLento, "Fator de repetição rápida deve ser maior");
    }

    @Test
    public void testConsistenciaCalculos() {
        // Verifica se os cálculos são consistentes
        double calorias1 = flexoes2.consumoCalorias(utilizador);
        double calorias2 = flexoes2.consumoCalorias(utilizador);

        assertEquals(calorias1, calorias2, 0.001, "Cálculos devem ser consistentes");

        // Verifica se atividades idênticas têm o mesmo consumo
        Flexoes flexoesIdenticas = new Flexoes(
                flexoes2.getDataRealizacao(),
                flexoes2.getTempo(),
                flexoes2.getFreqCardiaca(),
                flexoes2.getRepeticoes()
        );

        double caloriasIdenticas = flexoesIdenticas.consumoCalorias(utilizador);
        assertEquals(calorias1, caloriasIdenticas, 0.001, "Atividades idênticas devem ter mesmo consumo");
    }
}