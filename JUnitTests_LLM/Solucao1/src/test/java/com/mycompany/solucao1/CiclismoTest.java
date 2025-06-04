package com.mycompany.solucao1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CiclismoTest {

    private Ciclismo ciclismo1;
    private Ciclismo ciclismo2;
    private Ciclismo ciclismo3;
    private UtilizadorAmador utilizador;
    private LocalDateTime dataRealizacao;
    private LocalTime tempo;

    @BeforeEach
    public void setUp() {
        dataRealizacao = LocalDateTime.of(2024, 5, 15, 10, 30);
        tempo = LocalTime.of(1, 30, 0); // 1 hora e 30 minutos

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

        ciclismo1 = new Ciclismo();
        ciclismo2 = new Ciclismo(dataRealizacao, tempo, 70, 25000.0); // 25km
        ciclismo3 = new Ciclismo(ciclismo2); // construtor de cópia
    }

    @Test
    public void testConstrutorVazio() {
        assertNotNull(ciclismo1);
        assertEquals(0.0, ciclismo1.getDistancia(), 0.001);
        assertEquals(0, ciclismo1.getFreqCardiaca());
        assertEquals(LocalTime.of(0, 0), ciclismo1.getTempo());
        assertNotNull(ciclismo1.getDataRealizacao());
        assertTrue(ciclismo1.getCodAtividade() > 0);
    }

    @Test
    public void testConstrutorParametrizado() {
        assertEquals(dataRealizacao, ciclismo2.getDataRealizacao());
        assertEquals(tempo, ciclismo2.getTempo());
        assertEquals(70, ciclismo2.getFreqCardiaca());
        assertEquals(25000.0, ciclismo2.getDistancia(), 0.001);
        assertTrue(ciclismo2.getCodAtividade() > 0);
    }

    @Test
    public void testConstrutorCopia() {
        assertEquals(ciclismo2.getDataRealizacao(), ciclismo3.getDataRealizacao());
        assertEquals(ciclismo2.getTempo(), ciclismo3.getTempo());
        assertEquals(ciclismo2.getFreqCardiaca(), ciclismo3.getFreqCardiaca());
        assertEquals(ciclismo2.getDistancia(), ciclismo3.getDistancia(), 0.001);
        assertEquals(ciclismo2.getCodAtividade(), ciclismo3.getCodAtividade());
    }

    @Test
    public void testGettersSetters() {
        ciclismo1.setDataRealizacao(dataRealizacao);
        ciclismo1.setTempo(tempo);
        ciclismo1.setFreqCardiaca(140);
        ciclismo1.setDistancia(20000.0);

        assertEquals(dataRealizacao, ciclismo1.getDataRealizacao());
        assertEquals(tempo, ciclismo1.getTempo());
        assertEquals(140, ciclismo1.getFreqCardiaca());
        assertEquals(20000.0, ciclismo1.getDistancia(), 0.001);
    }

    @Test
    public void testGetVelocidade() {
        // Para ciclismo2: 25000m em 1h30min (5400 segundos)
        double velocidadeEsperada = 25000.0 / 5400.0; // ~4.63 m/s
        assertEquals(velocidadeEsperada, ciclismo2.getVelocidade(), 0.01);
    }

    @Test
    public void testGetFatorVelocidade() {
        // Testando com valores padrão do ciclismo (valorNulo=10.5, valorIncremento=0.11)
        double velocidade = ciclismo2.getVelocidade();
        double fatorEsperado = (velocidade - 10.5) * 0.11;
        assertEquals(fatorEsperado, ciclismo2.getFatorVelocidade(10.5, 0.11), 0.01);
    }

    @Test
    public void testConsumoCalorias() {
        double calorias = ciclismo2.consumoCalorias(utilizador);
        System.out.println("Calorias calculadas: " + calorias);

        assertTrue(calorias > 0, "O consumo de calorias deve ser positivo");

        // Teste com atividade mais longa - deve consumir mais calorias
        Ciclismo ciclismoLongo = new Ciclismo(dataRealizacao, LocalTime.of(2, 0, 0), 150, 30000.0);
        double caloriasLongo = ciclismoLongo.consumoCalorias(utilizador);
        assertTrue(caloriasLongo > calorias, "Atividade mais longa deve consumir mais calorias");
    }

    @Test
    public void testGeraAtividade() {
        double consumoCaloriasAlvo = 500.0;
        Atividade atividadeGerada = ciclismo1.geraAtividade(utilizador, consumoCaloriasAlvo);

        assertNotNull(atividadeGerada);
        assertTrue(atividadeGerada instanceof Ciclismo);
        assertTrue(atividadeGerada.getTempo().toSecondOfDay() > 0);
        assertTrue(((AtivDistancia) atividadeGerada).getDistancia() > 0);
        assertEquals(0, atividadeGerada.getFreqCardiaca());
    }

    @Test
    public void testEquals() {
        // Teste de igualdade com objetos iguais
        assertTrue(ciclismo2.equals(ciclismo3));
        assertTrue(ciclismo3.equals(ciclismo2));

        // Teste com objeto diferente
        assertFalse(ciclismo1.equals(ciclismo2));

        // Teste com null
        assertFalse(ciclismo1.equals(null));

        // Teste com objeto de classe diferente
        assertFalse(ciclismo1.equals("string"));

        // Teste de reflexividade
        assertTrue(ciclismo1.equals(ciclismo1));
    }

    @Test
    public void testClone() {
        Ciclismo clone = (Ciclismo) ciclismo2.clone();

        assertNotNull(clone);
        assertNotSame(ciclismo2, clone); // Objetos diferentes
        assertEquals(ciclismo2, clone); // Mas com conteúdo igual
        assertEquals(ciclismo2.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(ciclismo2.getTempo(), clone.getTempo());
        assertEquals(ciclismo2.getFreqCardiaca(), clone.getFreqCardiaca());
        assertEquals(ciclismo2.getDistancia(), clone.getDistancia(), 0.001);
    }

    @Test
    public void testToString() {
        String resultado = ciclismo2.toString();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Tipo de atividade: Ciclismo"));
    }

    @Test
    public void testCompareTo() {
        LocalDateTime dataAnterior = LocalDateTime.of(2024, 5, 14, 10, 30);
        LocalDateTime dataPosterior = LocalDateTime.of(2024, 5, 16, 10, 30);

        Ciclismo ciclismoAnterior = new Ciclismo(dataAnterior, tempo, 150, 20000.0);
        Ciclismo ciclismoPosterior = new Ciclismo(dataPosterior, tempo, 150, 20000.0);

        // Data anterior deve ser "menor"
        assertTrue(ciclismoAnterior.compareTo(ciclismo2) < 0);
        // Data posterior deve ser "maior"
        assertTrue(ciclismoPosterior.compareTo(ciclismo2) > 0);
        // Datas iguais - compara por código de atividade
        assertEquals(0, ciclismo2.compareTo(ciclismo3));
    }

    @Test
    public void testValoresLimite() {
        // Teste com distância zero
        Ciclismo ciclismoZero = new Ciclismo(dataRealizacao, LocalTime.of(1, 0, 0), 120, 0.0);
        assertEquals(0.0, ciclismoZero.getDistancia(), 0.001);
        assertEquals(0.0, ciclismoZero.getVelocidade(), 0.001);

        // Teste com tempo muito pequeno
        LocalTime tempoMinimo = LocalTime.of(0, 0, 1); // 1 segundo
        Ciclismo ciclismoRapido = new Ciclismo(dataRealizacao, tempoMinimo, 180, 100.0);
        assertEquals(100.0, ciclismoRapido.getVelocidade(), 0.001); // 100 m/s
    }

    @Test
    public void testFrequenciaCardiacaIntensidade() {
        Ciclismo ciclismoBaixaFC = new Ciclismo(dataRealizacao, tempo, 100, 50000.0);
        Ciclismo ciclismoAltaFC = new Ciclismo(dataRealizacao, tempo, 180, 25000.0);

        double caloriasBaixaFC = ciclismoBaixaFC.consumoCalorias(utilizador);
        double caloriasAltaFC = ciclismoAltaFC.consumoCalorias(utilizador);

        assertNotEquals(caloriasBaixaFC, caloriasAltaFC, 0.001);
    }
}