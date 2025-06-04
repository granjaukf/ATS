package com.mycompany.solucao1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PlanoTreinoTest {

    private PlanoTreino planoTreino;
    private Utilizador utilizador;
    private Atividade atividade1;
    private Atividade atividade2;
    private LocalDate dataTest;

    @BeforeEach
    void setUp() {
        dataTest = LocalDate.of(2024, 5, 15);
        planoTreino = new PlanoTreino(dataTest);

        // Criar utilizador de teste
        utilizador = new UtilizadorAmador("João", "Rua A", "joao@email.com",
                70, 75, 175, LocalDate.of(1990, 5, 12), 'M');

        LocalDateTime dataRealizacao1 = LocalDateTime.of(dataTest, LocalTime.of(8, 0));
        LocalTime tempo1 = LocalTime.of(0, 30); // 30 minutos de duração
        atividade1 = new Corrida(dataRealizacao1, tempo1, 120, 5.0); // 5km de distância

        LocalDateTime dataRealizacao2 = LocalDateTime.of(dataTest, LocalTime.of(9, 0));
        LocalTime tempo2 = LocalTime.of(0, 15); //
        atividade2 = new Flexoes(dataRealizacao2, tempo2, 100,20);
    }

    @Test
    @DisplayName("Teste do construtor vazio")
    void testConstrutorVazio() {
        PlanoTreino plano = new PlanoTreino();

        assertEquals(0, plano.getCodPlano());
        assertEquals(LocalDate.now(), plano.getDataRealizacao());
        assertTrue(plano.getAtividades().isEmpty());
    }

    @Test
    @DisplayName("Teste do construtor parameterizado")
    void testConstrutorParameterizado() {
        LocalDate data = LocalDate.of(2024, 6, 1);
        PlanoTreino plano = new PlanoTreino(data);

        assertTrue(plano.getCodPlano() > 0);
        assertEquals(data, plano.getDataRealizacao());
        assertTrue(plano.getAtividades().isEmpty());
    }

    @Test
    @DisplayName("Teste do construtor de cópia")
    void testConstrutorCopia() {
        planoTreino.addAtividade(atividade1, 3);

        PlanoTreino copia = new PlanoTreino(planoTreino);

        assertEquals(planoTreino.getCodPlano(), copia.getCodPlano());
        assertEquals(planoTreino.getDataRealizacao(), copia.getDataRealizacao());
        assertEquals(planoTreino.getAtividades().size(), copia.getAtividades().size());
    }

    @Test
    @DisplayName("Teste adicionar atividade")
    void testAddAtividade() {
        assertTrue(planoTreino.getAtividades().isEmpty());

        planoTreino.addAtividade(atividade1, 5);

        assertEquals(1, planoTreino.getAtividades().size());
        assertEquals(5, planoTreino.getAtividades().get(0).getIteracoes());
        assertEquals(atividade1.getClass(), planoTreino.getAtividades().get(0).getAtividade().getClass());
    }

    @Test
    @DisplayName("Teste adicionar múltiplas atividades")
    void testAddMultiplasAtividades() {
        planoTreino.addAtividade(atividade1, 3);
        planoTreino.addAtividade(atividade2, 10);

        assertEquals(2, planoTreino.getAtividades().size());
        assertEquals(3, planoTreino.getAtividades().get(0).getIteracoes());
        assertEquals(10, planoTreino.getAtividades().get(1).getIteracoes());
    }

    @Test
    @DisplayName("Teste cálculo de calorias dispendidas")
    void testCaloriasDispendidas() {
        // Assumindo que as atividades retornam valores específicos para consumoCalorias
        planoTreino.addAtividade(atividade1, 2); // 2 iterações
        planoTreino.addAtividade(atividade2, 3); // 3 iterações

        double calorias = planoTreino.caloriasDispendidas(utilizador);

        assertTrue(calorias > 0);
    }

    @Test
    @DisplayName("Teste getters e setters")
    void testGettersSetters() {
        LocalDate novaData = LocalDate.of(2024, 7, 1);

        planoTreino.setDataRealizacao(novaData);
        assertEquals(novaData, planoTreino.getDataRealizacao());

        assertTrue(planoTreino.getCodPlano() > 0);
    }

    @Test
    @DisplayName("Teste atividades num período")
    void testAtividadesNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 5, 10);
        LocalDate fim = LocalDate.of(2024, 5, 20);

        // Atividade dentro do período
        atividade1.setDataRealizacao(LocalDateTime.of(2024, 5, 15, 10, 0));
        planoTreino.addAtividade(atividade1, 2);

        // Atividade fora do período
        atividade2.setDataRealizacao(LocalDateTime.of(2024, 5, 25, 10, 0));
        planoTreino.addAtividade(atividade2, 3);

        List<PlanoTreino.AtividadeIteracoes> atividadesPeriodo =
                planoTreino.getAtividadesNumPeriodo(inicio, fim);

        assertEquals(1, atividadesPeriodo.size());
        assertEquals(2, atividadesPeriodo.get(0).getIteracoes());
    }

    @Test
    @DisplayName("Teste atividades que respeitam predicado")
    void testAtividadesQueRespeitamP() {
        LocalDate inicio = LocalDate.of(2024, 5, 10);
        LocalDate fim = LocalDate.of(2024, 5, 20);

        atividade1.setDataRealizacao(LocalDateTime.of(2024, 5, 15, 10, 0));
        planoTreino.addAtividade(atividade1, 2);

        // Predicado que sempre retorna true
        Predicate<Atividade> predicadoTrue = a -> true;

        List<Atividade> atividades = planoTreino.atividadesQueRespeitamP(inicio, fim, predicadoTrue);

        assertEquals(2, atividades.size()); // 2 iterações = 2 atividades na lista
    }

    @Test
    @DisplayName("Teste compareTo")
    void testCompareTo() {
        LocalDate data1 = LocalDate.of(2024, 5, 15);
        LocalDate data2 = LocalDate.of(2024, 5, 20);

        PlanoTreino plano1 = new PlanoTreino(data1);
        PlanoTreino plano2 = new PlanoTreino(data2);

        assertTrue(plano1.compareTo(plano2) < 0); // data1 é anterior a data2
        assertTrue(plano2.compareTo(plano1) > 0); // data2 é posterior a data1

        PlanoTreino plano3 = new PlanoTreino(data1);
        // Como têm a mesma data, compara pelos códigos
        assertNotEquals(0, plano1.compareTo(plano3));
    }

    @Test
    @DisplayName("Teste clone")
    void testClone() {
        planoTreino.addAtividade(atividade1, 3);

        PlanoTreino clone = (PlanoTreino) planoTreino.clone();

        assertNotSame(planoTreino, clone);
        assertEquals(planoTreino.getCodPlano(), clone.getCodPlano());
        assertEquals(planoTreino.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(planoTreino.getAtividades().size(), clone.getAtividades().size());
    }

    @Test
    @DisplayName("Teste toString")
    void testToString() {
        planoTreino.addAtividade(atividade1, 2);

        String resultado = planoTreino.toString();

        assertNotNull(resultado);
        assertTrue(resultado.contains("Plano de Treino"));
        assertTrue(resultado.contains("Codigo de Plano de Treino"));
        assertTrue(resultado.contains("Data de realizaçao"));
        assertTrue(resultado.contains("Atividades e suas iteraçoes"));
    }

    @Test
    @DisplayName("Teste plano treino num período")
    void testPlanoTreinoNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 5, 10);
        LocalDate fim = LocalDate.of(2024, 5, 20);

        atividade1.setDataRealizacao(LocalDateTime.of(2024, 5, 15, 10, 0));
        planoTreino.addAtividade(atividade1, 2);

        PlanoTreino planoPeriodo = (PlanoTreino) planoTreino.planoTreinoNumPeriodo(inicio, fim);

        assertNotNull(planoPeriodo);
        assertEquals(planoTreino.getCodPlano(), planoPeriodo.getCodPlano());
        assertEquals(planoTreino.getDataRealizacao(), planoPeriodo.getDataRealizacao());
    }

    @Test
    @DisplayName("Teste geração de plano de treino")
    void testGeraPlanoTreino() {
        List<Atividade> atividades = new ArrayList<>();
        atividades.add(atividade1);
        atividades.add(atividade2);

        LocalDate inicio = LocalDate.of(2024, 6, 1);

        List<PlanoTreino> planos = planoTreino.geraPlanoTreino(
                utilizador,
                atividades,
                2,      // maxAtivDia
                5,      // ativPorSemana
                2000.0, // consumoCaloricoMinimo
                inicio
        );

        assertNotNull(planos);
        assertFalse(planos.isEmpty());

        // Verifica se os planos foram criados com as datas corretas
        for (PlanoTreino plano : planos) {
            assertNotNull(plano.getDataRealizacao());
            assertTrue(plano.getDataRealizacao().compareTo(inicio) >= 0);
        }
    }

    @Test
    @DisplayName("Teste setProximoCodigo")
    void testSetProximoCodigo() {
        PlanoTreino plano = new PlanoTreino();
        plano.setProximoCodigo(100);

        PlanoTreino novoPlano = new PlanoTreino(LocalDate.now());
        assertTrue(novoPlano.getCodPlano() >= 100);
    }

    @Test
    @DisplayName("Teste imutabilidade das listas")
    void testImutabilidadeListas() {
        planoTreino.addAtividade(atividade1, 3);

        List<PlanoTreino.AtividadeIteracoes> atividades = planoTreino.getAtividades();
        int tamanhoOriginal = atividades.size();

        // Tentar modificar a lista retornada não deve afetar o plano original
        atividades.clear();

        assertEquals(tamanhoOriginal, planoTreino.getAtividades().size());
    }
}