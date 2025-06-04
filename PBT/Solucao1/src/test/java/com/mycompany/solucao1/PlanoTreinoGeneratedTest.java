import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.*;
import com.mycompany.solucao1.*;

public class PlanoTreinoGeneratedTest {
    @Test
    public void testPlanoTreino_1_73_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 73, 76, 195, LocalDate.of(1973, 12, 19), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(73);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_2_143_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 143, 73, 163, LocalDate.of(1988, 11, 9), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(143);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_3_122_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 122, 75, 165, LocalDate.of(1981, 11, 3), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(122);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_4_104_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 104, 95, 153, LocalDate.of(2009, 9, 1), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(104);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_5_154_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 154, 90, 169, LocalDate.of(1993, 6, 28), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(154);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_6_148_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 148, 52, 192, LocalDate.of(1997, 11, 27), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(148);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_7_164_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 164, 95, 176, LocalDate.of(1990, 11, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(164);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_8_115_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 115, 99, 191, LocalDate.of(2002, 7, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(115);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_9_106_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 106, 100, 166, LocalDate.of(1985, 3, 3), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(106);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_10_129_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 129, 91, 200, LocalDate.of(1972, 7, 6), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(129);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_11_116_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 116, 64, 187, LocalDate.of(1999, 9, 20), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(116);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_12_108_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 108, 87, 199, LocalDate.of(1980, 12, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(108);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_13_165_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 165, 52, 199, LocalDate.of(1972, 8, 11), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(165);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_14_154_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 154, 73, 163, LocalDate.of(1989, 9, 8), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(154);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_15_95_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 95, 70, 179, LocalDate.of(1972, 8, 21), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(95);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_16_78_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 78, 72, 168, LocalDate.of(1987, 4, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(78);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_17_172_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 172, 89, 184, LocalDate.of(2003, 8, 27), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(172);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_18_134_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 134, 84, 191, LocalDate.of(1981, 5, 12), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(134);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_19_106_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 106, 51, 199, LocalDate.of(2006, 8, 3), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(106);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_20_136_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 136, 93, 158, LocalDate.of(1986, 11, 22), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(136);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_21_171_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 171, 52, 171, LocalDate.of(1979, 3, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(171);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_22_68_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 68, 100, 155, LocalDate.of(2006, 3, 6), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(68);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_23_104_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 104, 96, 179, LocalDate.of(1995, 12, 19), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(104);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_24_162_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 162, 98, 199, LocalDate.of(2002, 8, 2), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(162);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_25_133_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 133, 88, 187, LocalDate.of(1996, 3, 20), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(133);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_26_79_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 79, 96, 172, LocalDate.of(1993, 3, 22), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(79);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_27_139_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 139, 92, 155, LocalDate.of(1972, 4, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(139);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_28_110_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 110, 92, 188, LocalDate.of(1988, 10, 26), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(110);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_29_156_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 156, 80, 169, LocalDate.of(1971, 5, 23), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(156);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_30_61_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 61, 95, 166, LocalDate.of(1994, 2, 20), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(61);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_31_168_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 168, 78, 196, LocalDate.of(1974, 6, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(168);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_32_158_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 158, 84, 173, LocalDate.of(1987, 9, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(158);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_33_126_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 126, 90, 189, LocalDate.of(2005, 4, 9), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(126);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_34_90_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 90, 57, 159, LocalDate.of(1984, 8, 7), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(90);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_35_178_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 178, 57, 181, LocalDate.of(1990, 4, 11), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(178);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_36_123_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 123, 61, 197, LocalDate.of(1972, 4, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(123);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_37_129_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 129, 61, 185, LocalDate.of(2008, 12, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(129);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_38_151_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 151, 86, 182, LocalDate.of(1976, 4, 24), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(151);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_39_130_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 130, 95, 191, LocalDate.of(2002, 8, 21), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(130);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_40_78_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 78, 99, 175, LocalDate.of(2009, 5, 21), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(78);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_41_63_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 63, 65, 177, LocalDate.of(1988, 8, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(63);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_42_94_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 94, 52, 177, LocalDate.of(1976, 3, 24), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(94);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_43_90_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 90, 96, 197, LocalDate.of(2004, 11, 28), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(90);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_44_142_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 142, 61, 157, LocalDate.of(1972, 12, 18), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(142);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_45_99_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 99, 77, 153, LocalDate.of(1997, 5, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(99);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_46_124_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 124, 93, 187, LocalDate.of(1992, 9, 18), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(124);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_47_143_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 143, 59, 193, LocalDate.of(2010, 7, 13), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(143);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_48_100_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 100, 95, 184, LocalDate.of(1985, 2, 15), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(100);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_49_148_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 148, 97, 159, LocalDate.of(1984, 4, 17), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(148);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_50_129_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 129, 54, 173, LocalDate.of(1978, 6, 23), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(129);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_51_117_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 117, 80, 182, LocalDate.of(2009, 2, 25), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(117);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_52_125_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 125, 82, 193, LocalDate.of(2008, 1, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(125);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_53_143_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 143, 83, 176, LocalDate.of(1984, 4, 26), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(143);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_54_138_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 138, 50, 189, LocalDate.of(1974, 12, 22), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(138);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_55_109_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 109, 50, 170, LocalDate.of(1996, 2, 12), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(109);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_56_123_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 123, 69, 177, LocalDate.of(1997, 11, 26), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(123);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_57_92_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 92, 51, 197, LocalDate.of(1971, 8, 3), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(92);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_58_63_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 63, 93, 175, LocalDate.of(1986, 8, 14), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(63);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_59_77_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 77, 61, 161, LocalDate.of(1976, 2, 7), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(77);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_60_80_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 80, 60, 162, LocalDate.of(1977, 6, 14), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(80);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_61_138_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 138, 56, 151, LocalDate.of(1973, 8, 28), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(138);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_62_154_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 154, 86, 194, LocalDate.of(1994, 3, 7), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(154);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_63_114_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 114, 67, 189, LocalDate.of(2002, 11, 7), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(114);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_64_175_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 175, 73, 168, LocalDate.of(1996, 5, 3), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(175);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_65_92_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 92, 80, 177, LocalDate.of(1972, 3, 13), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(92);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_66_110_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 110, 76, 151, LocalDate.of(1992, 12, 19), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(110);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_67_151_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 151, 67, 166, LocalDate.of(1995, 3, 13), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(151);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_68_136_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 136, 78, 158, LocalDate.of(1984, 11, 26), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(136);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_69_97_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 97, 89, 157, LocalDate.of(1983, 9, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(97);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_70_87_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 87, 52, 162, LocalDate.of(1980, 2, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(87);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_71_78_3() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 78, 54, 172, LocalDate.of(1977, 1, 21), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(78);
        a.setTempo(LocalTime.of(0, 3));
        a.setRepeticoes(15);
        plano.addAtividade(a, 3);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_72_67_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 67, 90, 158, LocalDate.of(1996, 7, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(67);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_73_116_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 116, 78, 169, LocalDate.of(1971, 11, 1), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(116);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_74_107_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 107, 51, 162, LocalDate.of(1991, 7, 25), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(107);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_75_161_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 161, 71, 153, LocalDate.of(1981, 3, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(161);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_76_120_1() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 120, 61, 157, LocalDate.of(1973, 2, 19), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(120);
        a.setTempo(LocalTime.of(0, 1));
        a.setRepeticoes(5);
        plano.addAtividade(a, 1);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_77_161_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 161, 85, 157, LocalDate.of(1991, 1, 18), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(161);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_78_62_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 62, 73, 179, LocalDate.of(1988, 9, 24), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(62);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_79_177_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 177, 53, 150, LocalDate.of(2006, 1, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(177);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_80_77_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 77, 82, 187, LocalDate.of(1988, 2, 20), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(77);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_81_180_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 180, 95, 191, LocalDate.of(2009, 4, 9), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(180);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_82_162_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 162, 93, 158, LocalDate.of(2000, 10, 2), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(162);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_83_173_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 173, 51, 162, LocalDate.of(1982, 12, 6), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(173);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_84_145_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 145, 57, 190, LocalDate.of(1991, 1, 18), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(145);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_85_110_6() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 110, 50, 185, LocalDate.of(2008, 8, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(110);
        a.setTempo(LocalTime.of(0, 6));
        a.setRepeticoes(30);
        plano.addAtividade(a, 6);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_86_113_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 113, 95, 156, LocalDate.of(1998, 11, 26), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(113);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_87_117_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 117, 70, 157, LocalDate.of(1978, 12, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(117);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_88_73_2() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 73, 74, 191, LocalDate.of(1991, 2, 10), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(73);
        a.setTempo(LocalTime.of(0, 2));
        a.setRepeticoes(10);
        plano.addAtividade(a, 2);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_89_128_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 128, 64, 164, LocalDate.of(1970, 3, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(128);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_90_90_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 90, 63, 151, LocalDate.of(1973, 3, 15), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(90);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_91_75_8() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 75, 96, 157, LocalDate.of(1977, 9, 2), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(75);
        a.setTempo(LocalTime.of(0, 8));
        a.setRepeticoes(40);
        plano.addAtividade(a, 8);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_92_132_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 132, 74, 167, LocalDate.of(1975, 5, 20), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(132);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_93_94_4() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 94, 68, 198, LocalDate.of(1987, 12, 4), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(94);
        a.setTempo(LocalTime.of(0, 4));
        a.setRepeticoes(20);
        plano.addAtividade(a, 4);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_94_131_9() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 131, 92, 174, LocalDate.of(1991, 1, 5), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(131);
        a.setTempo(LocalTime.of(0, 9));
        a.setRepeticoes(45);
        plano.addAtividade(a, 9);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_95_174_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 174, 54, 154, LocalDate.of(1985, 9, 21), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(174);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_96_61_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 61, 68, 177, LocalDate.of(1973, 1, 16), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(61);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_97_139_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 139, 76, 162, LocalDate.of(1988, 4, 18), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(139);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_98_95_10() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 95, 57, 181, LocalDate.of(2004, 9, 12), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(95);
        a.setTempo(LocalTime.of(0, 10));
        a.setRepeticoes(50);
        plano.addAtividade(a, 10);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_99_76_5() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 76, 79, 163, LocalDate.of(2001, 9, 27), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(76);
        a.setTempo(LocalTime.of(0, 5));
        a.setRepeticoes(25);
        plano.addAtividade(a, 5);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testPlanoTreino_100_66_7() {
        UtilizadorAmador u = new UtilizadorAmador("Nome", "Morada", "email@email.com", 66, 65, 194, LocalDate.of(1982, 3, 23), 'M');
        PlanoTreino plano = new PlanoTreino(LocalDate.now());
        Abdominais a = new Abdominais();
        a.setFreqCardiaca(66);
        a.setTempo(LocalTime.of(0, 7));
        a.setRepeticoes(35);
        plano.addAtividade(a, 7);
        double calorias = plano.caloriasDispendidas(u);
        assertTrue(calorias >= 0);
    }
}