
/*package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanoTreinoTest {

    private PlanoTreino planoTreino;
    private Utilizador utilizador;
    private Atividade atividade;
    private Atividade atividade2;

    @BeforeEach
    public void setUp() {
        // Criando uma instância do Utilizador para os testes
        utilizador = new UtilizadorAmador("Carlos", "Rua A", "carlos@email.com", 72, 80, 180, LocalDate.of(1990, 5, 12), 'M');

        // Criando uma instância do PlanoTreino para os testes
        planoTreino = new PlanoTreino(LocalDate.of(2024, 5, 12));

        // Criando instâncias de Atividade para os testes
        atividade = new BenchPress(LocalDateTime.now(), LocalTime.of(0, 30), 85, 12, 40);
        atividade2 = new Flexoes(LocalDateTime.now(), LocalTime.of(0, 20), 80, 20);

        // Adicionando atividades ao plano de treino
        planoTreino.addAtividade(atividade, 3);
        planoTreino.addAtividade(atividade2, 2);
    }

    @Test
    public void testPlanoTreinoInicializacao() {
        assertNotNull(planoTreino);
        assertEquals(1, planoTreino.getCodPlano());  // Verifica se o código do plano é gerado corretamente
        assertEquals(LocalDate.of(2024, 5, 12), planoTreino.getDataRealizacao());
    }

    @Test
    public void testAddAtividade() {
        // Verificando se a atividade foi adicionada corretamente
        List<PlanoTreino.AtividadeIteracoes> atividades = planoTreino.getAtividades();
        assertEquals(2, atividades.size()); // Verifica se existem duas atividades
        assertTrue(atividades.get(0).getAtividade() instanceof BenchPress);
        assertTrue(atividades.get(1).getAtividade() instanceof Flexoes);
    }

    @Test
    public void testCaloriasDispendidas() {
        double calorias = planoTreino.caloriasDispendidas(utilizador);
        assertTrue(calorias > 0); // Verifica se as calorias dispendidas são positivas
    }

    @Test
    public void testGetAtividadesNumPeriodo() {
        // Teste para verificar atividades no período
        LocalDate inicio = LocalDate.of(2024, 5, 1);
        LocalDate fim = LocalDate.of(2024, 5, 31);
        List<PlanoTreino.AtividadeIteracoes> atividadesPeriodo = planoTreino.getAtividadesNumPeriodo(inicio, fim);
        assertEquals(2, atividadesPeriodo.size()); // Verifica que temos duas atividades no intervalo
    }

    @Test
    public void testToString() {
        String expectedString = "Plano de Treino\nCodigo de Plano de Treino: " + planoTreino.getCodPlano() +
                                "\nData de realizaçao: 12/05/2024\nAtividades e suas iteraçoes: \n" +
                                "Atividade\nId: " + atividade.getCodAtividade() +
                                "\nData e hora: " + atividade.getDataRealizacao().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +
                                "\nDuraçao: 00:30\nFrequencia Cardiaca: 85 bpm\nTipo de atividade: Bench press\nIteracoes: 3\n" +
                                "Atividade\nId: " + atividade2.getCodAtividade() +
                                "\nData e hora: " + atividade2.getDataRealizacao().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) +
                                "\nDuraçao: 00:20\nFrequencia Cardiaca: 80 bpm\nTipo de atividade: Flexões\nIteracoes: 2\n";

        assertTrue(planoTreino.toString().contains("Plano de Treino"));
        assertTrue(planoTreino.toString().contains("12/05/2024"));
        assertTrue(planoTreino.toString().contains("Bench press"));
        assertTrue(planoTreino.toString().contains("Flexões"));
    }

    @Test
    public void testEquals() {
        PlanoTreino outroPlanoTreino = new PlanoTreino(planoTreino);
        assertTrue(planoTreino.equals(outroPlanoTreino));

        PlanoTreino planoTreinoDiferente = new PlanoTreino(LocalDate.of(2024, 6, 1));
        assertFalse(planoTreino.equals(planoTreinoDiferente));
    }

    @Test
    public void testClone() {
        PlanoTreino planoTreinoClone = (PlanoTreino) planoTreino.clone();
        assertNotSame(planoTreino, planoTreinoClone); // Verifica que os objetos não são os mesmos
        assertEquals(planoTreino, planoTreinoClone); // Verifica que os conteúdos são iguais
    }

    @Test
    public void testPlanoTreinoNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 5, 1);
        LocalDate fim = LocalDate.of(2024, 5, 31);
        PlanoTreino planoTreinoPeriodo = (PlanoTreino) planoTreino.planoTreinoNumPeriodo(inicio, fim);

        assertNotNull(planoTreinoPeriodo);
        assertEquals(planoTreino.getCodPlano(), planoTreinoPeriodo.getCodPlano());
        assertEquals(planoTreino.getDataRealizacao(), planoTreinoPeriodo.getDataRealizacao());
    }

    @Test
    public void testGeraPlanoTreino() {
        List<PlanoTreino> planos = planoTreino.geraPlanoTreino(utilizador, List.of(atividade, atividade2), 2, 4, 500, LocalDate.of(2024, 5, 10));
        assertNotNull(planos);
        assertTrue(planos.size() > 0); // Verifica se a lista de planos não está vazia
    }
}*/
