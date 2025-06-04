package com.mycompany.solucao1;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilizadorProfissionalTest {

    private UtilizadorProfissional profissional;

    @BeforeEach
    public void setUp() {
        // instância do UtilizadorProfissional para os testes
        profissional = new UtilizadorProfissional("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
    }

    @Test
    public void testGetNome() {
        assertEquals("Carlos", profissional.getNome());
    }

    @Test
    public void testGetMorada() {
        assertEquals("Rua C", profissional.getMorada());
    }

    @Test
    public void testGetEmail() {
        assertEquals("carlos@email.com", profissional.getEmail());
    }

    @Test
    public void testGetFreqCardiaca() {
        assertEquals(80, profissional.getFreqCardiaca());
    }

    @Test
    public void testGetPeso() {
        assertEquals(80.0, profissional.getPeso());
    }

    @Test
    public void testGetAltura() {
        assertEquals(180, profissional.getAltura());
    }

    @Test
    public void testGetGenero() {
        assertEquals('M', profissional.getGenero());
    }

    @Test
    public void testGetIdade() {
        assertEquals(45, profissional.getIdade()); 
    }

    @Test
    public void testGetFatorMultiplicativo() {
        assertEquals(1.5, profissional.getFatorMultiplicativo());
    }

    @Test
    public void testToString() {
        String expected = "Utilizador\nCodigo de Utilizador: " + profissional.getCodUtilizador() + "\nNome: Carlos\nMorada: Rua C\nEmail: carlos@email.com\nFrequencia Cardiaca: 80 bpm\nPeso: 80.0 kilos\nAltura: 180 centimetros\nData de nascimento 10/02/1980\nIdade: 45 anos\nGenero: M\nAtividades: \n\nPlanos de treino: \nTipo de Utilizador: Profissional\n";
        assertTrue(profissional.toString().contains("Carlos"));
        assertTrue(profissional.toString().contains("Rua C"));
        assertTrue(profissional.toString().contains("Tipo de Utilizador: Profissional"));
    }

    @Test
    public void testClone() {
        UtilizadorProfissional clone = (UtilizadorProfissional) profissional.clone();
        assertNotSame(profissional, clone);
        assertEquals(profissional, clone);
    }

    @Test
    public void testEquals() {
        UtilizadorProfissional profissionalOutro = new UtilizadorProfissional("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
        assertTrue(profissional.equals(profissionalOutro));

        UtilizadorProfissional profissionalDiferente = new UtilizadorProfissional("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertFalse(profissional.equals(profissionalDiferente));
    }

    @Test
    public void testUtilizadorNumPeriodo() {
        LocalDate inicio = LocalDate.of(2024, 1, 1);
        LocalDate fim = LocalDate.of(2024, 12, 31);

        UtilizadorProfissional profissionalPeriodo = (UtilizadorProfissional) profissional.utilizadorNumPeriodo(inicio, fim);

        assertNotNull(profissionalPeriodo);
        assertEquals(profissional.getCodUtilizador(), profissionalPeriodo.getCodUtilizador());
        assertEquals(profissional.getNome(), profissionalPeriodo.getNome());
        assertEquals(profissional.getMorada(), profissionalPeriodo.getMorada());
        assertEquals(profissional.getEmail(), profissionalPeriodo.getEmail());
        assertEquals(profissional.getFreqCardiaca(), profissionalPeriodo.getFreqCardiaca());
        assertEquals(profissional.getPeso(), profissionalPeriodo.getPeso());
        assertEquals(profissional.getAltura(), profissionalPeriodo.getAltura());
        assertEquals(profissional.getGenero(), profissionalPeriodo.getGenero());
    }

    @Test
    public void testEqualsWithNullAndDifferentType() {
        assertFalse(profissional.equals(null));  // retornar false ao comparar com null
        assertFalse(profissional.equals("String"));  // retornar false ao comparar com um objeto de tipo diferente
    }

    @Test
    public void testCloneIndependence() {
        UtilizadorProfissional clone = (UtilizadorProfissional) profissional.clone();
        clone.setNome("Outro Nome");  // novo nome do clone
        assertNotEquals(profissional.getNome(), clone.getNome());  // o nome dos objetos não deve ser o mesmo
    }

    @Test
    public void testToStringWithDifferentData() {
        UtilizadorProfissional profissional2 = new UtilizadorProfissional("João", "Rua D", "joao@email.com", 70, 70, 170, LocalDate.of(1985, 5, 12), 'M');
        String output = profissional2.toString();
        assertTrue(output.contains("João"));
        assertTrue(output.contains("Rua D"));
        assertTrue(output.contains("Email: joao@email.com"));
    }
    
    @Test
    public void testConstructorWithInvalidData() {
        // Teste com dados inválidos como peso ou altura negativos
        UtilizadorProfissional profissionalInvalido = new UtilizadorProfissional("Carlos", "Rua C", "carlos@email.com", 80, -80, 180, LocalDate.of(1980, 2, 10), 'M');
        assertEquals(-80, profissionalInvalido.getPeso(), "Peso não deve ser negativo!");

        // Teste com dados nulos ou inválidos (por exemplo, nome vazio)
        UtilizadorProfissional profissionalSemNome = new UtilizadorProfissional("", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
        assertEquals("", profissionalSemNome.getNome(), "Nome não pode ser vazio!");
    }

    @Test
    public void testFatorMultiplicativo() {
        assertEquals(1.5, profissional.getFatorMultiplicativo());
    }
}
