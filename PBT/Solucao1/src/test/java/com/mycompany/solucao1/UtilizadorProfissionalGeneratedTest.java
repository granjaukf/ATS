import com.mycompany.solucao1.UtilizadorProfissional;
import java.time.*;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilizadorProfissionalGeneratedTest {

    // PROPRIEDADES

    private UtilizadorProfissional gerarUtilizadorProfissionalAleatorio() {
        Random r = new Random();
        int freq = 100 + r.nextInt(200); // frequência mais elevada
        int peso = 50 + r.nextInt(70); // peso
        int altura = 150 + r.nextInt(60); // altura
        int ano = 1970 + r.nextInt(40);
        int mes = 1 + r.nextInt(12);
        int dia = 1 + r.nextInt(28);
        char genero = r.nextBoolean() ? 'M' : 'F';

        return new UtilizadorProfissional("Teste", "Rua Z", "x@y.com", freq, peso, altura,
                LocalDate.of(ano, mes, dia), genero);
    }

    @Test
    public void testFatorMultiplicativoProfissional() {
        for (int i = 0; i < 100; i++) {
            UtilizadorProfissional u = gerarUtilizadorProfissionalAleatorio();
            assertEquals(1.5, u.getFatorMultiplicativo(), 0.01);
        }
    }

    @Test
    public void testEqualsComCopiaProfissional() {
        UtilizadorProfissional u1 = gerarUtilizadorProfissionalAleatorio();
        UtilizadorProfissional u2 = new UtilizadorProfissional(u1);
        assertEquals(u1, u2);
    }



    @Test
public void testEqualsCloneProfissional() {
    UtilizadorProfissional u = gerarUtilizadorProfissionalAleatorio();
    UtilizadorProfissional c = (UtilizadorProfissional) u.clone();
    assertEquals(u, c);
}


@Test
public void testToStringContemTipoProfissional() {
    UtilizadorProfissional u = gerarUtilizadorProfissionalAleatorio();
    String str = u.toString();
    assertTrue(str.contains("Tipo de Utilizador: Profissional"));
}


@Test
public void testUtilizadorNumPeriodoMantemDados() {
    UtilizadorProfissional u = gerarUtilizadorProfissionalAleatorio();
    LocalDate i = LocalDate.of(2024,1,1);
    LocalDate f = LocalDate.of(2024,6,1);

    UtilizadorProfissional p = (UtilizadorProfissional) u.utilizadorNumPeriodo(i, f);
    assertEquals(u.getNome(), p.getNome());
    assertEquals(u.getEmail(), p.getEmail());
    assertEquals(u.getAltura(), p.getAltura());
    assertEquals(u.getGenero(), p.getGenero());
}


}
