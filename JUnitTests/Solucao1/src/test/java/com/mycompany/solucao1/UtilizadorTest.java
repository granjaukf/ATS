package com.mycompany.solucao1;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilizadorTest {

    private UtilizadorAmador amador;
    private UtilizadorPraticanteOcasional ocasional;
    private UtilizadorProfissional profissional;

    @BeforeEach
    public void setUp() {
        // Instâncias para os testes 
        amador = new UtilizadorAmador("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        ocasional = new UtilizadorPraticanteOcasional("Maria", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
        profissional = new UtilizadorProfissional("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
    }

    @Test
    public void testGetNome() {
        assertEquals("João", amador.getNome());
        assertEquals("Maria", ocasional.getNome());
        assertEquals("Carlos", profissional.getNome());
    }

    @Test
    public void testGetMorada() {
        assertEquals("Rua A", amador.getMorada());
        assertEquals("Rua B", ocasional.getMorada());
        assertEquals("Rua C", profissional.getMorada());
    }

    @Test
    public void testGetEmail() {
        assertEquals("joao@email.com", amador.getEmail());
        assertEquals("maria@email.com", ocasional.getEmail());
        assertEquals("carlos@email.com", profissional.getEmail());
    }

    @Test
    public void testGetFreqCardiaca() {
        assertEquals(70, amador.getFreqCardiaca());
        assertEquals(75, ocasional.getFreqCardiaca());
        assertEquals(80, profissional.getFreqCardiaca());
    }

    @Test
    public void testGetPeso() {
        assertEquals(75.0, amador.getPeso());
        assertEquals(60.0, ocasional.getPeso());
        assertEquals(80.0, profissional.getPeso());
    }

    @Test
    public void testGetAltura() {
        assertEquals(175, amador.getAltura());
        assertEquals(165, ocasional.getAltura());
        assertEquals(180, profissional.getAltura());
    }

    @Test
    public void testGetGenero() {
        assertEquals('M', amador.getGenero());
        assertEquals('F', ocasional.getGenero());
        assertEquals('M', profissional.getGenero());
    }

    @Test
    public void testGetIdade() {
        assertEquals(35, amador.getIdade()); // tendo em conta 2025 
        assertEquals(40, ocasional.getIdade());
        assertEquals(45, profissional.getIdade());
    }

    @Test
    public void testGetFatorMultiplicativo() {
        assertEquals(1.0, amador.getFatorMultiplicativo());
        assertEquals(1.25, ocasional.getFatorMultiplicativo());
        assertEquals(1.5, profissional.getFatorMultiplicativo());
    }

    @Test
    public void testClone() {
        UtilizadorAmador amadorClone = (UtilizadorAmador) amador.clone();
        assertNotSame(amador, amadorClone);
        assertEquals(amador, amadorClone);

        UtilizadorPraticanteOcasional ocasionalClone = (UtilizadorPraticanteOcasional) ocasional.clone();
        assertNotSame(ocasional, ocasionalClone);
        assertEquals(ocasional, ocasionalClone);

        UtilizadorProfissional profissionalClone = (UtilizadorProfissional) profissional.clone();
        assertNotSame(profissional, profissionalClone);
        assertEquals(profissional, profissionalClone);
    }

    @Test
    public void testEquals() {
        UtilizadorAmador amadorOutro = new UtilizadorAmador("João", "Rua A", "joao@email.com", 70, 75, 175, LocalDate.of(1990, 5, 12), 'M');
        assertTrue(amador.equals(amadorOutro));
        assertFalse(amador.equals(ocasional));

        UtilizadorPraticanteOcasional ocasionalOutro = new UtilizadorPraticanteOcasional("Maria", "Rua B", "maria@email.com", 75, 60, 165, LocalDate.of(1985, 8, 22), 'F');
        assertTrue(ocasional.equals(ocasionalOutro));
        assertFalse(ocasional.equals(profissional));

        UtilizadorProfissional profissionalOutro = new UtilizadorProfissional("Carlos", "Rua C", "carlos@email.com", 80, 80, 180, LocalDate.of(1980, 2, 10), 'M');
        assertTrue(profissional.equals(profissionalOutro));
        assertFalse(profissional.equals(amador));
    }

    @Test
    public void testToString() {
        String expectedAmador = "Utilizador\nCodigo de Utilizador: " + amador.getCodUtilizador() + "\nNome: João\nMorada: Rua A\nEmail: joao@email.com\nFrequencia Cardiaca: 70 bpm\nPeso: 75.0 kilos\nAltura: 175 centimetros\nData de nascimento 12/05/1990\nIdade: 35 anos\nGenero: M\nAtividades: \n\nPlanos de treino: \n";
        assertTrue(amador.toString().contains("João"));
        assertTrue(amador.toString().contains("Rua A"));

        String expectedOcasional = "Utilizador\nCodigo de Utilizador: " + ocasional.getCodUtilizador() + "\nNome: Maria\nMorada: Rua B\nEmail: maria@email.com\nFrequencia Cardiaca: 75 bpm\nPeso: 60.0 kilos\nAltura: 165 centimetros\nData de nascimento 22/08/1985\nIdade: 40 anos\nGenero: F\nAtividades: \n\nPlanos de treino: \n";
        assertTrue(ocasional.toString().contains("Maria"));
        assertTrue(ocasional.toString().contains("Rua B"));

        String expectedProfissional = "Utilizador\nCodigo de Utilizador: " + profissional.getCodUtilizador() + "\nNome: Carlos\nMorada: Rua C\nEmail: carlos@email.com\nFrequencia Cardiaca: 80 bpm\nPeso: 80.0 kilos\nAltura: 180 centimetros\nData de nascimento 10/02/1980\nIdade: 45 anos\nGenero: M\nAtividades: \n\nPlanos de treino: \n";
        assertTrue(profissional.toString().contains("Carlos"));
        assertTrue(profissional.toString().contains("Rua C"));
    }
}
