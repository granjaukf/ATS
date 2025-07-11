/*
 * This file was automatically generated by EvoSuite
 * Tue May 27 01:25:25 GMT 2025
 */

package com.mycompany.solucao1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mycompany.solucao1.Atividade;
import com.mycompany.solucao1.BenchPress;
import com.mycompany.solucao1.LegPress;
import com.mycompany.solucao1.PlanoTreino;
import com.mycompany.solucao1.Utilizador;
import com.mycompany.solucao1.UtilizadorAmador;
import com.mycompany.solucao1.UtilizadorPraticanteOcasional;
import com.mycompany.solucao1.UtilizadorProfissional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BenchPress_ESTest extends BenchPress_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.now();
      int int0 = 1558;
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, 1558, 1558, 1558);
      benchPress0.equals(localDateTime0);
      LocalDate localDate0 = MockLocalDate.now();
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("", "", "", 1558, 'J', 1558, localDate0, 'J');
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional();
      utilizadorPraticanteOcasional0.addAtividade(benchPress0);
      PlanoTreino planoTreino0 = new PlanoTreino();
      PlanoTreino planoTreino1 = new PlanoTreino(planoTreino0);
      planoTreino1.addAtividade(benchPress0, 2146089178);
      utilizadorPraticanteOcasional0.addPlanoTreino(planoTreino1);
      // Undeclared exception!
      benchPress0.geraAtividade(utilizadorPraticanteOcasional0, 1558);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.from(localDateTime0);
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, 1558, 0, 1596.8529498);
      Period period0 = Period.of((-3308), 3410, (-3308));
      period0.toTotalMonths();
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", "", 0, 0, (-3308), localDate0, 'c');
      double double0 = benchPress0.consumoCalorias(utilizadorProfissional0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional("n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", "YiJ'ri9V0S", 2399, 3410, (-1871), localDate0, 'X');
      LocalDate localDate1 = MockLocalDate.now();
      utilizadorPraticanteOcasional0.setAltura((-3308));
      utilizadorPraticanteOcasional0.planosTreinos(localDate1, localDate0);
      BenchPress benchPress1 = (BenchPress)benchPress0.geraAtividade(utilizadorPraticanteOcasional0, (-3308));
      assertEquals((-1064), benchPress1.getRepeticoes());
      assertEquals(3410.0, benchPress1.getPeso(), 0.01);
      
      benchPress0.clone();
      period0.negated();
      BenchPress benchPress2 = (BenchPress)benchPress0.geraAtividade(utilizadorProfissional0, (-1778.3546448404725));
      assertEquals(0, benchPress2.getRepeticoes());
      
      LegPress legPress0 = new LegPress();
      boolean boolean0 = benchPress0.equals(legPress0);
      assertFalse(boolean0);
      
      benchPress0.clone();
      assertFalse(benchPress0.equals((Object)benchPress2));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = MockLocalTime.ofSecondOfDay(1L);
      int int0 = (-2503);
      BenchPress benchPress0 = new BenchPress((LocalDateTime) null, localTime0, (-2503), 2768, 0.0);
      BenchPress benchPress1 = new BenchPress(benchPress0);
      String string0 = "\nTipo de atividade: Bench press\n";
      String string1 = "";
      // Undeclared exception!
      try { 
        benchPress0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Atividade", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BenchPress benchPress0 = null;
      try {
        benchPress0 = new BenchPress((BenchPress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Atividade", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      benchPress0.clone();
      Utilizador utilizador0 = null;
      benchPress0.clone();
      benchPress0.setProximoCodigo((-1));
      // Undeclared exception!
      try { 
        benchPress0.geraAtividade((Utilizador) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.BenchPress", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional();
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional1 = new UtilizadorPraticanteOcasional(utilizadorPraticanteOcasional0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      benchPress0.setProximoCodigo(0);
      utilizadorPraticanteOcasional0.allAtividades(localDate0, localDate0);
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional2 = new UtilizadorPraticanteOcasional(utilizadorPraticanteOcasional1, localDate0, localDate0);
      utilizadorPraticanteOcasional2.planosTreinos(localDate0, localDate0);
      benchPress0.geraAtividade(utilizadorPraticanteOcasional2, 0L);
      // Undeclared exception!
      try { 
        benchPress0.consumoCalorias(utilizadorPraticanteOcasional1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.mycompany.solucao1.AtivRepeticoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      UtilizadorAmador utilizadorAmador0 = new UtilizadorAmador();
      utilizadorAmador0.setAltura((-2550));
      benchPress0.setTempo((LocalTime) null);
      benchPress0.geraAtividade(utilizadorAmador0, (-1.0));
      benchPress0.clone();
      utilizadorAmador0.setProximoCodigo((-2550));
      utilizadorAmador0.addAtividade(benchPress0);
      benchPress0.clone();
      benchPress0.setProximoCodigo((-2545));
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      utilizadorAmador0.setDataNascimento(localDate0);
      double double0 = 3944.4093097667237;
      benchPress0.geraAtividade(utilizadorAmador0, 3944.4093097667237);
      benchPress0.toString();
      benchPress0.equals((Object) null);
      utilizadorAmador0.allMetrosAltimetria(localDate0, localDate0);
      benchPress0.toString();
      // Undeclared exception!
      try { 
        benchPress0.consumoCalorias(utilizadorAmador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.AtivRepeticoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      BenchPress benchPress1 = new BenchPress();
      benchPress0.equals(benchPress1);
      boolean boolean0 = benchPress0.equals(benchPress0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      benchPress0.setTempo((LocalTime) null);
      BenchPress benchPress1 = new BenchPress(benchPress0);
      // Undeclared exception!
      try { 
        benchPress0.equals(benchPress1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.from(localDateTime0);
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, 1870, 1902, 524.0);
      BenchPress benchPress1 = new BenchPress(benchPress0);
      benchPress1.setTempo(localTime0);
      benchPress1.compareTo((Atividade) benchPress0);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional();
      utilizadorProfissional0.addAtividade(benchPress1);
      benchPress0.setRepeticoes(0);
      utilizadorProfissional0.setGenero('b');
      benchPress1.geraAtividade(utilizadorProfissional0, 1870);
      benchPress0.geraAtividade(utilizadorProfissional0, 1870);
      benchPress1.geraAtividade(utilizadorProfissional0, 1870);
      Object object0 = benchPress0.clone();
      benchPress1.equals(object0);
      benchPress1.toString();
      assertFalse(benchPress1.equals((Object)benchPress0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.from(localDateTime0);
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, (-883), (-883), (-883));
      Period period0 = Period.of(0, 3410, 0);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", 0, 0, 0, localDate0, 'c');
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional("n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", "n \"62y.Tp<\"nSu3XwW", (-883), 3410, (-883), localDate0, 'X');
      utilizadorPraticanteOcasional0.getAtividadesPlanoTreino();
      utilizadorPraticanteOcasional0.addAtividade(benchPress0);
      utilizadorPraticanteOcasional0.planosTreinos(localDate0, localDate0);
      Atividade atividade0 = benchPress0.geraAtividade(utilizadorPraticanteOcasional0, (-883));
      benchPress0.toString();
      atividade0.setDataRealizacao(localDateTime0);
      period0.negated();
      benchPress0.geraAtividade(utilizadorProfissional0, (-1778.3546448404725));
      LegPress legPress0 = new LegPress();
      benchPress0.equals((Object) null);
      benchPress0.consumoCalorias(utilizadorProfissional0);
      System.setCurrentTimeMillis(1258L);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.now();
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, 1558, 1558, 1558);
      benchPress0.equals(localDateTime0);
      LocalDate localDate0 = MockLocalDate.now();
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("", "", "", 1558, 'i', 1558, localDate0, 'i');
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional();
      utilizadorPraticanteOcasional0.addAtividade(benchPress0);
      Atividade atividade0 = benchPress0.geraAtividade(utilizadorPraticanteOcasional0, 1558);
      String string0 = atividade0.toString();
      assertEquals("Atividade\nId: 2\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nPeso: 1246.4 kilos\nTipo de atividade: Bench press\n", string0);
      
      BenchPress benchPress1 = (BenchPress)benchPress0.geraAtividade(utilizadorProfissional0, 1558);
      assertEquals(105.0, benchPress1.getPeso(), 0.01);
      assertEquals(519, benchPress1.getRepeticoes());
      
      boolean boolean0 = benchPress0.equals((Object) null);
      assertFalse(boolean0);
      
      double double0 = benchPress0.consumoCalorias(utilizadorProfissional0);
      assertEquals(143377.38238012567, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional();
      // Undeclared exception!
      try { 
        benchPress0.consumoCalorias(utilizadorPraticanteOcasional0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.mycompany.solucao1.AtivRepeticoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      BenchPress benchPress1 = new BenchPress(benchPress0);
      assertTrue(benchPress1.equals((Object)benchPress0));
      
      benchPress0.equals(benchPress1);
      boolean boolean0 = benchPress0.equals(benchPress0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = MockLocalTime.now();
      BenchPress benchPress0 = new BenchPress((LocalDateTime) null, localTime0, 2871, (-1), 2871);
      assertEquals(1, benchPress0.getCodAtividade());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BenchPress benchPress0 = new BenchPress();
      String string0 = benchPress0.toString();
      assertEquals("Atividade\nId: 1\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nPeso: 0.0 kilos\nTipo de atividade: Bench press\n", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.now();
      BenchPress benchPress0 = new BenchPress(localDateTime0, localTime0, 1558, 1558, 1558);
      benchPress0.equals(localDateTime0);
      LocalDate localDate0 = MockLocalDate.now();
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("r[", "r[", "r[", '@', '@', 1558, localDate0, '@');
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional();
      utilizadorPraticanteOcasional0.addAtividade(benchPress0);
      Atividade atividade0 = benchPress0.geraAtividade(utilizadorPraticanteOcasional0, 1558);
      String string0 = atividade0.toString();
      assertEquals("Atividade\nId: 2\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nPeso: 1246.4 kilos\nTipo de atividade: Bench press\n", string0);
      
      BenchPress benchPress1 = (BenchPress)benchPress0.geraAtividade(utilizadorProfissional0, 1558);
      assertEquals(64.0, benchPress1.getPeso(), 0.01);
      assertEquals(540, benchPress1.getRepeticoes());
      
      boolean boolean0 = benchPress0.equals((Object) null);
      assertFalse(boolean0);
      
      double double0 = benchPress0.consumoCalorias(utilizadorProfissional0);
      assertEquals(190778.52768880207, double0, 0.01);
  }
}
