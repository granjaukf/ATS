package com.mycompany.solucao1;

import org.junit.jupiter.api.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testPedeString() {
        String input = "teste\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        String result = menu.pedeString("Mensagem");

        assertEquals("teste", result);
    }

    @Test
    public void testPedeInt() {
        String input = "42\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        int result = menu.pedeInt("Insira um número");

        assertEquals(42, result);
    }

    @Test
    public void testPedeDouble() {
        String input = "3.14\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        double result = menu.pedeDouble("Insira um double");

        assertEquals(3.14, result, 0.001);
    }

    @Test
    public void testPedeData() {
        String input = "12/06/2024\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        LocalDate result = menu.pedeData("Data");

        assertEquals(LocalDate.of(2024, 6, 12), result);
    }

    @Test
    public void testPedeTempo() {
        String input = "01:30:00\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        LocalTime result = menu.pedeTempo("Tempo");

        assertEquals(LocalTime.of(1, 30, 0), result);
    }

    @Test
    public void testPedeDataHora() {
        String input = "12/06/2024 10:30:00\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Menu menu = new Menu(new String[]{"Menu", "Sair"});
        LocalDateTime result = menu.pedeDataHora("Data e hora");

        assertEquals(LocalDateTime.of(2024, 6, 12, 10, 30, 0), result);
    }

}
