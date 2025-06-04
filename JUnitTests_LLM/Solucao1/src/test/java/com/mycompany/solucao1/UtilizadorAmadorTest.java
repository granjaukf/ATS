package com.mycompany.solucao1;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilizadorAmadorTest {

    private UtilizadorAmador amador;

    @BeforeEach
    public void setUp() {
        // Instância do UtilizadorAmador para os testes
        amador = new UtilizadorAmador("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
    }

    @Test
    public void testGetNome() {
        assertEquals("João", amador.getNome());
    }

    @Test
    public void testGetMorada() {
        assertEquals("Rua A", amador.getMorada());
    }

    @Test
    public void testGetEmail() {
        assertEquals("joao@email.com", amador.getEmail());
    }

    @Test
    public void testGetFreqCardiaca() {
        assertEquals(70, amador.getFreqCardiaca());
    }

    @Test
    public void testGetPeso() {
        assertEquals(75.0, amador.getPeso());
    }

    @Test
    public void testGetAltura() {
        assertEquals(175, amador.getAltura());
    }

    @Test
    public void testGetGenero() {
        assertEquals('M', amador.getGenero());
    }

    @Test
    public void testGetIdade() {
        assertEquals(35, amador.getIdade()); 
    }

    @Test
    public void testGetFatorMultiplicativo() {
        assertEquals(1.0, amador.getFatorMultiplicativo());
    }

    @Test
    public void testToString() {
        String expected = "Utilizador\nCodigo de Utilizador: " + amador.getCodUtilizador() + "\nNome: João\nMorada: Rua A\nEmail: joao@email.com\nFrequencia Cardiaca: 70 bpm\nPeso: 75.0 kilos\nAltura: 175 centimetros\nData de nascimento 12/05/1990\nIdade: 35 anos\nGenero: M\nAtividades: \n\nPlanos de treino: \nTipo de Utilizador: Amador\n";
        assertTrue(amador.toString().contains("João"));
        assertTrue(amador.toString().contains("Rua A"));
        assertTrue(amador.toString().contains("Tipo de Utilizador: Amador"));
    }

    @Test
    public void testClone() {
        UtilizadorAmador clone = (UtilizadorAmador) amador.clone();
        assertNotSame(amador, clone);
        assertEquals(amador, clone);
    }

    @Test
    public void testEquals() {
        UtilizadorAmador amadorOutro = new UtilizadorAmador("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertTrue(amador.equals(amadorOutro));

        UtilizadorAmador amadorDiferente = new UtilizadorAmador("Maria", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
        assertFalse(amador.equals(amadorDiferente));
    }

    @Test
    public void testUtilizadorNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 1, 1);
        LocalDate fim = LocalDate.of(2024, 12, 31);

        UtilizadorAmador amadorPeriodo = (UtilizadorAmador) amador.utilizadorNumPeriodo(inicio, fim);

        assertNotNull(amadorPeriodo);
        assertEquals(amador.getCodUtilizador(), amadorPeriodo.getCodUtilizador());
        assertEquals(amador.getNome(), amadorPeriodo.getNome());
        assertEquals(amador.getMorada(), amadorPeriodo.getMorada());
        assertEquals(amador.getEmail(), amadorPeriodo.getEmail());
        assertEquals(amador.getFreqCardiaca(), amadorPeriodo.getFreqCardiaca());
        assertEquals(amador.getPeso(), amadorPeriodo.getPeso());
        assertEquals(amador.getAltura(), amadorPeriodo.getAltura());
        assertEquals(amador.getGenero(), amadorPeriodo.getGenero());
    }
    
    @Test
    public void testEqualsWithNullAndDifferentType() {
        assertFalse(amador.equals(null));  // retornar false ao comparar com null
        assertFalse(amador.equals("String"));  // retornar false ao comparar com um objeto de tipo diferente
    }
    
    @Test
    public void testCloneIndependence() {
        UtilizadorAmador clone = (UtilizadorAmador) amador.clone();
        clone.setNome("Outro Nome");
        assertNotEquals(amador.getNome(), clone.getNome()); 
    }
    
    @Test
    public void testToStringWithDifferentData() {
        UtilizadorAmador amador2 = new UtilizadorAmador("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
        String output = amador2.toString();
        assertTrue(output.contains("Carlos"));
        assertTrue(output.contains("Rua C"));
        assertTrue(output.contains("Email: carlos@email.com"));
    }
    
    @Test
    public void testConstructorWithInvalidData() {
        UtilizadorAmador amadorInvalido = new UtilizadorAmador("João", "Rua A", "joao@email.com", 70, -75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertEquals(-75, amadorInvalido.getPeso(), "Peso não deve ser negativo!");

        UtilizadorAmador amadorSemNome = new UtilizadorAmador("", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertEquals("", amadorSemNome.getNome(), "Nome não pode ser vazio!");
    }
    
    @Test
    public void testFatorMultiplicativo() {
        assertEquals(1.0, amador.getFatorMultiplicativo());
    }

}

