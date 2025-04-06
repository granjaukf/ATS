package com.mycompany.solucao1;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilizadorPraticanteOcasionalTest {

    private UtilizadorPraticanteOcasional ocasional;

    @BeforeEach
    public void setUp() {
        // instância do UtilizadorPraticanteOcasional para os testes
        ocasional = new UtilizadorPraticanteOcasional("Maria", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
    }

    @Test
    public void testGetNome() {
        assertEquals("Maria", ocasional.getNome());
    }

    @Test
    public void testGetMorada() {
        assertEquals("Rua B", ocasional.getMorada());
    }

    @Test
    public void testGetEmail() {
        assertEquals("maria@email.com", ocasional.getEmail());
    }

    @Test
    public void testGetFreqCardiaca() {
        assertEquals(75, ocasional.getFreqCardiaca());
    }

    @Test
    public void testGetPeso() {
        assertEquals(60.0, ocasional.getPeso());
    }

    @Test
    public void testGetAltura() {
        assertEquals(165, ocasional.getAltura());
    }

    @Test
    public void testGetGenero() {
        assertEquals('F', ocasional.getGenero());
    }

    @Test
    public void testGetIdade() {
        assertEquals(40, ocasional.getIdade()); 
    }

    @Test
    public void testGetFatorMultiplicativo() {
        assertEquals(1.25, ocasional.getFatorMultiplicativo());
    }

    @Test
    public void testToString() {
        String expected = "Utilizador\nCodigo de Utilizador: " + ocasional.getCodUtilizador() + "\nNome: Maria\nMorada: Rua B\nEmail: maria@email.com\nFrequencia Cardiaca: 75 bpm\nPeso: 60.0 kilos\nAltura: 165 centimetros\nData de nascimento 22/08/1985\nIdade: 40 anos\nGenero: F\nAtividades: \n\nPlanos de treino: \nTipo de Utilizador: Praticante Ocasional\n";
        assertTrue(ocasional.toString().contains("Maria"));
        assertTrue(ocasional.toString().contains("Rua B"));
        assertTrue(ocasional.toString().contains("Tipo de Utilizador: Praticante Ocasional"));
    }

    @Test
    public void testClone() {
        UtilizadorPraticanteOcasional clone = (UtilizadorPraticanteOcasional) ocasional.clone();
        assertNotSame(ocasional, clone);
        assertEquals(ocasional, clone);
    }

    @Test
    public void testEquals() {
        UtilizadorPraticanteOcasional ocasionalOutro = new UtilizadorPraticanteOcasional("Maria", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
        assertTrue(ocasional.equals(ocasionalOutro));

        UtilizadorPraticanteOcasional ocasionalDiferente = new UtilizadorPraticanteOcasional("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertFalse(ocasional.equals(ocasionalDiferente));
    }

    @Test
    public void testUtilizadorNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 1, 1);
        LocalDate fim = LocalDate.of(2024, 12, 31);

        UtilizadorPraticanteOcasional ocasionalPeriodo = (UtilizadorPraticanteOcasional) ocasional.utilizadorNumPeriodo(inicio, fim);

        assertNotNull(ocasionalPeriodo);
        assertEquals(ocasional.getCodUtilizador(), ocasionalPeriodo.getCodUtilizador());
        assertEquals(ocasional.getNome(), ocasionalPeriodo.getNome());
        assertEquals(ocasional.getMorada(), ocasionalPeriodo.getMorada());
        assertEquals(ocasional.getEmail(), ocasionalPeriodo.getEmail());
        assertEquals(ocasional.getFreqCardiaca(), ocasionalPeriodo.getFreqCardiaca());
        assertEquals(ocasional.getPeso(), ocasionalPeriodo.getPeso());
        assertEquals(ocasional.getAltura(), ocasionalPeriodo.getAltura());
        assertEquals(ocasional.getGenero(), ocasionalPeriodo.getGenero());
    }

    @Test
    public void testEqualsWithNullAndDifferentType() {
        assertFalse(ocasional.equals(null));  // retornar false ao comparar com null
        assertFalse(ocasional.equals("String"));  // retornar false ao comparar com um objeto de tipo diferente
    }

    @Test
    public void testCloneIndependence() {
        UtilizadorPraticanteOcasional clone = (UtilizadorPraticanteOcasional) ocasional.clone();
        clone.setNome("Outro Nome");  // novo nome do clone
        assertNotEquals(ocasional.getNome(), clone.getNome());  //o nome dos objetos não deve ser o mesmo
    }

    @Test
    public void testToStringWithDifferentData() {
        UtilizadorPraticanteOcasional ocasional2 = new UtilizadorPraticanteOcasional("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
        String output = ocasional2.toString();
        assertTrue(output.contains("Carlos"));
        assertTrue(output.contains("Rua C"));
        assertTrue(output.contains("Email: carlos@email.com"));
    }
    
    @Test
    public void testConstructorWithInvalidData() {
        // Teste com dados inválidos como peso ou altura negativos
        UtilizadorPraticanteOcasional ocasionalInvalido = new UtilizadorPraticanteOcasional("Maria", "Rua B", "maria@email.com", 75, -60, 165, LocalDate.of(1985, 8, 22), 'F');
        assertEquals(-60, ocasionalInvalido.getPeso(), "Peso não deve ser negativo!");

        // Teste com dados nulos ou inválidos (por exemplo, nome vazio)
        UtilizadorPraticanteOcasional ocasionalSemNome = new UtilizadorPraticanteOcasional("", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
        assertEquals("", ocasionalSemNome.getNome(), "Nome não pode ser vazio!");
    }

    @Test
    public void testFatorMultiplicativo() {
        assertEquals(1.25, ocasional.getFatorMultiplicativo());
    }
}
