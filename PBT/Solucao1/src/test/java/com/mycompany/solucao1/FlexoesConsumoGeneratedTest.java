import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.*;
import com.mycompany.solucao1.Flexoes;
import com.mycompany.solucao1.Utilizador;
import com.mycompany.solucao1.UtilizadorProfissional;

public class FlexoesConsumoGeneratedTest {
    @Test
    public void testConsumoCalorias_760_742_171() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(171);
        a.setTempo(LocalTime.ofSecondOfDay(742));
        a.setRepeticoes(760);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 171, 88, 181,
            LocalDate.of(1983, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_340_2371_51() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(51);
        a.setTempo(LocalTime.ofSecondOfDay(2371));
        a.setRepeticoes(340);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 51, 81, 195,
            LocalDate.of(2001, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_935_672_118() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(118);
        a.setTempo(LocalTime.ofSecondOfDay(672));
        a.setRepeticoes(935);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 118, 67, 166,
            LocalDate.of(1973, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_509_652_136() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(136);
        a.setTempo(LocalTime.ofSecondOfDay(652));
        a.setRepeticoes(509);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 136, 54, 166,
            LocalDate.of(2004, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_255_2466_122() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(122);
        a.setTempo(LocalTime.ofSecondOfDay(2466));
        a.setRepeticoes(255);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 122, 115, 171,
            LocalDate.of(1998, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_478_2198_158() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(158);
        a.setTempo(LocalTime.ofSecondOfDay(2198));
        a.setRepeticoes(478);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 158, 79, 193,
            LocalDate.of(1985, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_387_2396_180() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(180);
        a.setTempo(LocalTime.ofSecondOfDay(2396));
        a.setRepeticoes(387);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 180, 113, 158,
            LocalDate.of(1972, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_123_2220_119() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(119);
        a.setTempo(LocalTime.ofSecondOfDay(2220));
        a.setRepeticoes(123);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 119, 109, 200,
            LocalDate.of(1973, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_607_910_153() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(153);
        a.setTempo(LocalTime.ofSecondOfDay(910));
        a.setRepeticoes(607);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 153, 111, 192,
            LocalDate.of(2002, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_454_761_120() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(120);
        a.setTempo(LocalTime.ofSecondOfDay(761));
        a.setRepeticoes(454);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 120, 100, 178,
            LocalDate.of(1973, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_985_674_125() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(125);
        a.setTempo(LocalTime.ofSecondOfDay(674));
        a.setRepeticoes(985);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 125, 60, 175,
            LocalDate.of(1995, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_87_3315_105() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(105);
        a.setTempo(LocalTime.ofSecondOfDay(3315));
        a.setRepeticoes(87);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 105, 83, 150,
            LocalDate.of(1998, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_838_2092_121() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(121);
        a.setTempo(LocalTime.ofSecondOfDay(2092));
        a.setRepeticoes(838);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 121, 52, 162,
            LocalDate.of(2003, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_674_1351_113() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(113);
        a.setTempo(LocalTime.ofSecondOfDay(1351));
        a.setRepeticoes(674);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 113, 93, 179,
            LocalDate.of(2004, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_882_2532_81() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(81);
        a.setTempo(LocalTime.ofSecondOfDay(2532));
        a.setRepeticoes(882);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 81, 105, 164,
            LocalDate.of(1996, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_899_2725_113() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(113);
        a.setTempo(LocalTime.ofSecondOfDay(2725));
        a.setRepeticoes(899);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 113, 91, 156,
            LocalDate.of(1971, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_224_1879_172() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(172);
        a.setTempo(LocalTime.ofSecondOfDay(1879));
        a.setRepeticoes(224);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 172, 77, 152,
            LocalDate.of(1983, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_84_2776_136() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(136);
        a.setTempo(LocalTime.ofSecondOfDay(2776));
        a.setRepeticoes(84);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 136, 112, 181,
            LocalDate.of(2006, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_840_800_199() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(199);
        a.setTempo(LocalTime.ofSecondOfDay(800));
        a.setRepeticoes(840);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 199, 65, 177,
            LocalDate.of(1999, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_65_974_195() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(195);
        a.setTempo(LocalTime.ofSecondOfDay(974));
        a.setRepeticoes(65);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 195, 109, 197,
            LocalDate.of(1998, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_616_2120_172() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(172);
        a.setTempo(LocalTime.ofSecondOfDay(2120));
        a.setRepeticoes(616);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 172, 63, 183,
            LocalDate.of(1986, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_177_1124_141() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(141);
        a.setTempo(LocalTime.ofSecondOfDay(1124));
        a.setRepeticoes(177);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 141, 75, 153,
            LocalDate.of(1969, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_78_228_170() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(170);
        a.setTempo(LocalTime.ofSecondOfDay(228));
        a.setRepeticoes(78);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 170, 118, 163,
            LocalDate.of(1993, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_705_383_133() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(133);
        a.setTempo(LocalTime.ofSecondOfDay(383));
        a.setRepeticoes(705);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 133, 78, 184,
            LocalDate.of(1983, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_712_2886_102() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(102);
        a.setTempo(LocalTime.ofSecondOfDay(2886));
        a.setRepeticoes(712);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 102, 59, 156,
            LocalDate.of(2002, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_857_1264_121() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(121);
        a.setTempo(LocalTime.ofSecondOfDay(1264));
        a.setRepeticoes(857);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 121, 70, 194,
            LocalDate.of(1996, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_221_711_183() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(183);
        a.setTempo(LocalTime.ofSecondOfDay(711));
        a.setRepeticoes(221);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 183, 58, 186,
            LocalDate.of(1978, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_812_2710_87() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(87);
        a.setTempo(LocalTime.ofSecondOfDay(2710));
        a.setRepeticoes(812);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 87, 103, 160,
            LocalDate.of(1987, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_832_306_152() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(152);
        a.setTempo(LocalTime.ofSecondOfDay(306));
        a.setRepeticoes(832);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 152, 102, 188,
            LocalDate.of(2002, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_966_3366_195() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(195);
        a.setTempo(LocalTime.ofSecondOfDay(3366));
        a.setRepeticoes(966);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 195, 103, 170,
            LocalDate.of(2001, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_557_378_151() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(151);
        a.setTempo(LocalTime.ofSecondOfDay(378));
        a.setRepeticoes(557);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 151, 104, 154,
            LocalDate.of(1977, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_449_1597_177() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(177);
        a.setTempo(LocalTime.ofSecondOfDay(1597));
        a.setRepeticoes(449);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 177, 90, 164,
            LocalDate.of(1987, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_763_465_152() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(152);
        a.setTempo(LocalTime.ofSecondOfDay(465));
        a.setRepeticoes(763);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 152, 111, 154,
            LocalDate.of(1991, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_117_223_184() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(184);
        a.setTempo(LocalTime.ofSecondOfDay(223));
        a.setRepeticoes(117);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 184, 117, 177,
            LocalDate.of(1974, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_931_1869_95() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(95);
        a.setTempo(LocalTime.ofSecondOfDay(1869));
        a.setRepeticoes(931);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 95, 78, 196,
            LocalDate.of(2006, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_250_1189_165() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(165);
        a.setTempo(LocalTime.ofSecondOfDay(1189));
        a.setRepeticoes(250);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 165, 52, 170,
            LocalDate.of(1998, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_739_974_63() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(63);
        a.setTempo(LocalTime.ofSecondOfDay(974));
        a.setRepeticoes(739);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 63, 115, 190,
            LocalDate.of(1998, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_71_2850_177() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(177);
        a.setTempo(LocalTime.ofSecondOfDay(2850));
        a.setRepeticoes(71);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 177, 117, 198,
            LocalDate.of(1994, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_391_3331_152() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(152);
        a.setTempo(LocalTime.ofSecondOfDay(3331));
        a.setRepeticoes(391);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 152, 82, 153,
            LocalDate.of(2006, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_361_88_180() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(180);
        a.setTempo(LocalTime.ofSecondOfDay(88));
        a.setRepeticoes(361);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 180, 82, 192,
            LocalDate.of(1981, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_205_3109_57() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(57);
        a.setTempo(LocalTime.ofSecondOfDay(3109));
        a.setRepeticoes(205);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 57, 118, 167,
            LocalDate.of(1976, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_553_2151_56() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(56);
        a.setTempo(LocalTime.ofSecondOfDay(2151));
        a.setRepeticoes(553);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 56, 105, 189,
            LocalDate.of(1985, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_670_195_66() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(66);
        a.setTempo(LocalTime.ofSecondOfDay(195));
        a.setRepeticoes(670);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 66, 110, 157,
            LocalDate.of(1973, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_100_973_102() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(102);
        a.setTempo(LocalTime.ofSecondOfDay(973));
        a.setRepeticoes(100);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 102, 116, 156,
            LocalDate.of(1971, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_306_1054_100() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(100);
        a.setTempo(LocalTime.ofSecondOfDay(1054));
        a.setRepeticoes(306);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 100, 54, 160,
            LocalDate.of(1974, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_129_712_100() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(100);
        a.setTempo(LocalTime.ofSecondOfDay(712));
        a.setRepeticoes(129);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 100, 79, 158,
            LocalDate.of(1997, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_413_1832_86() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(86);
        a.setTempo(LocalTime.ofSecondOfDay(1832));
        a.setRepeticoes(413);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 86, 66, 185,
            LocalDate.of(1972, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_569_801_122() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(122);
        a.setTempo(LocalTime.ofSecondOfDay(801));
        a.setRepeticoes(569);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 122, 111, 166,
            LocalDate.of(2001, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_930_309_62() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(62);
        a.setTempo(LocalTime.ofSecondOfDay(309));
        a.setRepeticoes(930);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 62, 68, 162,
            LocalDate.of(2001, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_837_1428_87() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(87);
        a.setTempo(LocalTime.ofSecondOfDay(1428));
        a.setRepeticoes(837);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 87, 73, 173,
            LocalDate.of(1990, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_815_229_84() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(84);
        a.setTempo(LocalTime.ofSecondOfDay(229));
        a.setRepeticoes(815);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 84, 75, 196,
            LocalDate.of(2004, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_526_1901_141() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(141);
        a.setTempo(LocalTime.ofSecondOfDay(1901));
        a.setRepeticoes(526);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 141, 105, 166,
            LocalDate.of(2001, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_60_3072_94() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(94);
        a.setTempo(LocalTime.ofSecondOfDay(3072));
        a.setRepeticoes(60);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 94, 67, 154,
            LocalDate.of(1979, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_166_262_107() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(107);
        a.setTempo(LocalTime.ofSecondOfDay(262));
        a.setRepeticoes(166);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 107, 65, 198,
            LocalDate.of(1996, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_596_2345_183() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(183);
        a.setTempo(LocalTime.ofSecondOfDay(2345));
        a.setRepeticoes(596);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 183, 70, 186,
            LocalDate.of(1982, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_825_3456_114() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(114);
        a.setTempo(LocalTime.ofSecondOfDay(3456));
        a.setRepeticoes(825);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 114, 112, 187,
            LocalDate.of(1994, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_916_3326_124() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(124);
        a.setTempo(LocalTime.ofSecondOfDay(3326));
        a.setRepeticoes(916);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 124, 54, 193,
            LocalDate.of(1992, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_558_3037_134() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(134);
        a.setTempo(LocalTime.ofSecondOfDay(3037));
        a.setRepeticoes(558);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 134, 73, 183,
            LocalDate.of(2007, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_142_2122_97() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(97);
        a.setTempo(LocalTime.ofSecondOfDay(2122));
        a.setRepeticoes(142);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 97, 64, 198,
            LocalDate.of(1970, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_250_2519_166() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(166);
        a.setTempo(LocalTime.ofSecondOfDay(2519));
        a.setRepeticoes(250);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 166, 74, 159,
            LocalDate.of(1986, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_352_949_126() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(126);
        a.setTempo(LocalTime.ofSecondOfDay(949));
        a.setRepeticoes(352);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 126, 59, 178,
            LocalDate.of(1987, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_166_222_56() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(56);
        a.setTempo(LocalTime.ofSecondOfDay(222));
        a.setRepeticoes(166);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 56, 104, 158,
            LocalDate.of(1987, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_788_194_118() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(118);
        a.setTempo(LocalTime.ofSecondOfDay(194));
        a.setRepeticoes(788);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 118, 71, 155,
            LocalDate.of(1981, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_319_1589_94() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(94);
        a.setTempo(LocalTime.ofSecondOfDay(1589));
        a.setRepeticoes(319);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 94, 112, 174,
            LocalDate.of(1990, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_432_896_71() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(71);
        a.setTempo(LocalTime.ofSecondOfDay(896));
        a.setRepeticoes(432);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 71, 57, 181,
            LocalDate.of(1967, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_22_850_184() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(184);
        a.setTempo(LocalTime.ofSecondOfDay(850));
        a.setRepeticoes(22);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 184, 54, 184,
            LocalDate.of(1967, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_120_359_116() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(116);
        a.setTempo(LocalTime.ofSecondOfDay(359));
        a.setRepeticoes(120);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 116, 61, 166,
            LocalDate.of(1984, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_152_264_95() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(95);
        a.setTempo(LocalTime.ofSecondOfDay(264));
        a.setRepeticoes(152);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 95, 108, 189,
            LocalDate.of(1980, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_859_1852_107() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(107);
        a.setTempo(LocalTime.ofSecondOfDay(1852));
        a.setRepeticoes(859);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 107, 60, 182,
            LocalDate.of(1997, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_468_726_169() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(169);
        a.setTempo(LocalTime.ofSecondOfDay(726));
        a.setRepeticoes(468);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 169, 99, 165,
            LocalDate.of(1984, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_540_222_112() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(112);
        a.setTempo(LocalTime.ofSecondOfDay(222));
        a.setRepeticoes(540);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 112, 61, 190,
            LocalDate.of(1992, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_18_1166_50() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(50);
        a.setTempo(LocalTime.ofSecondOfDay(1166));
        a.setRepeticoes(18);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 50, 74, 162,
            LocalDate.of(1989, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_179_2271_164() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(164);
        a.setTempo(LocalTime.ofSecondOfDay(2271));
        a.setRepeticoes(179);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 164, 71, 153,
            LocalDate.of(1992, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_228_774_57() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(57);
        a.setTempo(LocalTime.ofSecondOfDay(774));
        a.setRepeticoes(228);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 57, 105, 157,
            LocalDate.of(1991, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_756_3169_180() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(180);
        a.setTempo(LocalTime.ofSecondOfDay(3169));
        a.setRepeticoes(756);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 180, 82, 171,
            LocalDate.of(1983, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_941_1625_116() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(116);
        a.setTempo(LocalTime.ofSecondOfDay(1625));
        a.setRepeticoes(941);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 116, 97, 190,
            LocalDate.of(1988, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_911_250_109() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(109);
        a.setTempo(LocalTime.ofSecondOfDay(250));
        a.setRepeticoes(911);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 109, 109, 175,
            LocalDate.of(1972, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_650_318_96() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(96);
        a.setTempo(LocalTime.ofSecondOfDay(318));
        a.setRepeticoes(650);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 96, 93, 154,
            LocalDate.of(1984, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_950_539_92() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(92);
        a.setTempo(LocalTime.ofSecondOfDay(539));
        a.setRepeticoes(950);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 92, 114, 170,
            LocalDate.of(1970, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_82_2072_76() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(76);
        a.setTempo(LocalTime.ofSecondOfDay(2072));
        a.setRepeticoes(82);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 76, 82, 153,
            LocalDate.of(2007, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_311_641_146() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(146);
        a.setTempo(LocalTime.ofSecondOfDay(641));
        a.setRepeticoes(311);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 146, 92, 192,
            LocalDate.of(1978, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_340_762_140() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(140);
        a.setTempo(LocalTime.ofSecondOfDay(762));
        a.setRepeticoes(340);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 140, 81, 182,
            LocalDate.of(1990, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_153_1815_165() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(165);
        a.setTempo(LocalTime.ofSecondOfDay(1815));
        a.setRepeticoes(153);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 165, 98, 181,
            LocalDate.of(1992, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_674_1435_148() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(148);
        a.setTempo(LocalTime.ofSecondOfDay(1435));
        a.setRepeticoes(674);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 148, 115, 154,
            LocalDate.of(1981, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_37_129_199() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(199);
        a.setTempo(LocalTime.ofSecondOfDay(129));
        a.setRepeticoes(37);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 199, 98, 178,
            LocalDate.of(1976, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_989_3110_140() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(140);
        a.setTempo(LocalTime.ofSecondOfDay(3110));
        a.setRepeticoes(989);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 140, 78, 181,
            LocalDate.of(1965, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_997_560_98() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(98);
        a.setTempo(LocalTime.ofSecondOfDay(560));
        a.setRepeticoes(997);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 98, 81, 185,
            LocalDate.of(1966, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_789_1529_182() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(182);
        a.setTempo(LocalTime.ofSecondOfDay(1529));
        a.setRepeticoes(789);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 182, 97, 200,
            LocalDate.of(2006, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_536_2039_94() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(94);
        a.setTempo(LocalTime.ofSecondOfDay(2039));
        a.setRepeticoes(536);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 94, 90, 187,
            LocalDate.of(1968, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_158_2742_162() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(162);
        a.setTempo(LocalTime.ofSecondOfDay(2742));
        a.setRepeticoes(158);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 162, 100, 185,
            LocalDate.of(1987, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_844_3151_88() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(88);
        a.setTempo(LocalTime.ofSecondOfDay(3151));
        a.setRepeticoes(844);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 88, 116, 175,
            LocalDate.of(1995, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_852_2679_140() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(140);
        a.setTempo(LocalTime.ofSecondOfDay(2679));
        a.setRepeticoes(852);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 140, 89, 182,
            LocalDate.of(1988, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_430_3530_181() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(181);
        a.setTempo(LocalTime.ofSecondOfDay(3530));
        a.setRepeticoes(430);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 181, 62, 195,
            LocalDate.of(1979, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_403_2598_108() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(108);
        a.setTempo(LocalTime.ofSecondOfDay(2598));
        a.setRepeticoes(403);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 108, 99, 184,
            LocalDate.of(1978, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_649_3018_123() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(123);
        a.setTempo(LocalTime.ofSecondOfDay(3018));
        a.setRepeticoes(649);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 123, 50, 171,
            LocalDate.of(1979, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_537_2001_126() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(126);
        a.setTempo(LocalTime.ofSecondOfDay(2001));
        a.setRepeticoes(537);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 126, 114, 175,
            LocalDate.of(1970, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_890_2550_145() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(145);
        a.setTempo(LocalTime.ofSecondOfDay(2550));
        a.setRepeticoes(890);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 145, 84, 190,
            LocalDate.of(1970, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_752_2299_86() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(86);
        a.setTempo(LocalTime.ofSecondOfDay(2299));
        a.setRepeticoes(752);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 86, 79, 157,
            LocalDate.of(1975, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_790_2732_62() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(62);
        a.setTempo(LocalTime.ofSecondOfDay(2732));
        a.setRepeticoes(790);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 62, 63, 198,
            LocalDate.of(1979, 1, 1), 'M');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
    @Test
    public void testConsumoCalorias_703_3447_117() {
        Flexoes a = new Flexoes();
        a.setFreqCardiaca(117);
        a.setTempo(LocalTime.ofSecondOfDay(3447));
        a.setRepeticoes(703);
        Utilizador u = new UtilizadorProfissional("Teste", "Rua X", "teste@mail.com", 117, 96, 178,
            LocalDate.of(1971, 1, 1), 'F');
        double calorias = a.consumoCalorias(u);
        assertTrue(calorias >= 0);
    }
}