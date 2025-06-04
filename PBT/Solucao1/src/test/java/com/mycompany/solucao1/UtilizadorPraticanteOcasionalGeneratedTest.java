import com.mycompany.solucao1.UtilizadorPraticanteOcasional;
import java.time.*;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilizadorPraticanteOcasionalGeneratedTest {

    // PROPRIEDADES

    private UtilizadorPraticanteOcasional gerarUtilizadorPraticanteAleatorio() {
        Random r = new Random();
        int freq = 50 + r.nextInt(150);           // frequência semanal
        int peso = 45 + r.nextInt(80);            // peso
        int altura = 140 + r.nextInt(70);         // altura
        int ano = 1970 + r.nextInt(40);
        int mes = 1 + r.nextInt(12);
        int dia = 1 + r.nextInt(28);
        char genero = r.nextBoolean() ? 'M' : 'F';

        return new UtilizadorPraticanteOcasional("Teste", "Rua Y", "x@y.com", freq, peso, altura,
            LocalDate.of(ano, mes, dia), genero);
    }

    @Test
    public void testFatorMultiplicativoPraticante() {
        for (int i = 0; i < 100; i++) {
            UtilizadorPraticanteOcasional u = gerarUtilizadorPraticanteAleatorio();
            assertEquals(1.25, u.getFatorMultiplicativo(), 0.01);
        }
    }

    @Test
    public void testEqualsComCopiaPraticante() {
        UtilizadorPraticanteOcasional u1 = gerarUtilizadorPraticanteAleatorio();
        UtilizadorPraticanteOcasional u2 = new UtilizadorPraticanteOcasional(u1);
        assertEquals(u1, u2);
    }

    @Test
    public void testCloneMantemDados() {
        UtilizadorPraticanteOcasional u = gerarUtilizadorPraticanteAleatorio();
        UtilizadorPraticanteOcasional c = (UtilizadorPraticanteOcasional) u.clone();
        assertEquals(u, c);
    }

    @Test
    public void testToStringContemTipoPraticante() {
        UtilizadorPraticanteOcasional u = gerarUtilizadorPraticanteAleatorio();
        String str = u.toString();
        assertTrue(str.contains("Tipo de Utilizador: Praticante Ocasional"));
    }

    @Test
    public void testUtilizadorNumPeriodoMantemDados() {
        UtilizadorPraticanteOcasional u = gerarUtilizadorPraticanteAleatorio();
        LocalDate inicio = LocalDate.of(2024, 1, 1);
        LocalDate fim = LocalDate.of(2024, 6, 1);

        UtilizadorPraticanteOcasional novo = (UtilizadorPraticanteOcasional) u.utilizadorNumPeriodo(inicio, fim);

        assertEquals(u.getNome(), novo.getNome());
        assertEquals(u.getAltura(), novo.getAltura());
        assertEquals(u.getGenero(), novo.getGenero());
        assertEquals(u.getEmail(), novo.getEmail());
    }

    @Test
    public void testFatorMultiplicativoDentroDeLimites() {
        UtilizadorPraticanteOcasional u = gerarUtilizadorPraticanteAleatorio();
        double f = u.getFatorMultiplicativo();
        assertTrue(f >= 1.0 && f <= 2.0);
    }
}
