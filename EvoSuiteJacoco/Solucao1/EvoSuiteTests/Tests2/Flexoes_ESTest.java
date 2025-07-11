/*
 * This file was automatically generated by EvoSuite
 * Tue May 27 01:32:59 GMT 2025
 */

package com.mycompany.solucao1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mycompany.solucao1.Flexoes;
import com.mycompany.solucao1.Utilizador;
import com.mycompany.solucao1.UtilizadorPraticanteOcasional;
import com.mycompany.solucao1.UtilizadorProfissional;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Flexoes_ESTest extends Flexoes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional("Atividade\nId: 1\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nTipo de atividade: Flex\u00F5es\n", "Atividade\nId: 1\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nTipo de atividade: Flex\u00F5es\n", "_*ooF>7Uno3Q", 1830, 1830, (-223), localDate0, '0');
      Flexoes flexoes1 = (Flexoes)flexoes0.geraAtividade(utilizadorProfissional0, (-223));
      assertEquals((-217), flexoes1.getRepeticoes());
      assertEquals(0, flexoes1.getFreqCardiaca());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      flexoes0.setProximoCodigo(0);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional();
      Flexoes flexoes1 = (Flexoes)flexoes0.geraAtividade(utilizadorProfissional0, (-1));
      assertEquals(0, flexoes1.getFreqCardiaca());
      assertEquals(Integer.MIN_VALUE, flexoes1.getRepeticoes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      flexoes0.setProximoCodigo((-2479));
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional();
      Flexoes flexoes1 = (Flexoes)flexoes0.geraAtividade(utilizadorProfissional0, 2788.01);
      assertEquals(0, flexoes1.getFreqCardiaca());
      assertEquals(Integer.MAX_VALUE, flexoes1.getRepeticoes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDateTime localDateTime0 = MockLocalDateTime.now();
      LocalTime localTime0 = MockLocalTime.now();
      Flexoes flexoes0 = new Flexoes(localDateTime0, localTime0, 148, 148);
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional();
      double double0 = flexoes0.consumoCalorias(utilizadorProfissional0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Month month0 = Month.SEPTEMBER;
      LocalDateTime localDateTime0 = MockLocalDateTime.of(0, month0, 10, 0, 10, 4, 4);
      LocalTime localTime0 = MockLocalTime.ofSecondOfDay(7L);
      Flexoes flexoes0 = new Flexoes(localDateTime0, localTime0, 10, 4266);
      LocalDate localDate0 = MockLocalDate.now();
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional("\nTipo de atividade: Flex\u00F5es\n", "\nTipo de atividade: Flex\u00F5es\n", "\nTipo de atividade: Flex\u00F5es\n", 0, 'U', 0, localDate0, 'U');
      double double0 = flexoes0.consumoCalorias(utilizadorPraticanteOcasional0);
      assertEquals(29.441825810185186, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Month month0 = Month.SEPTEMBER;
      LocalDateTime localDateTime0 = MockLocalDateTime.of(0, month0, 10, 0, 10, 4, 4);
      LocalTime localTime0 = MockLocalTime.ofSecondOfDay(7L);
      Flexoes flexoes0 = new Flexoes(localDateTime0, localTime0, 10, 4266);
      LocalDate localDate0 = MockLocalDate.now();
      UtilizadorPraticanteOcasional utilizadorPraticanteOcasional0 = new UtilizadorPraticanteOcasional("\nTipo de atividade: Flex\u00F5es\n", "`6", "\nTipo de atividade: Flex\u00F5es\n", (-1970), 0, (-1970), localDate0, 'U');
      double double0 = flexoes0.consumoCalorias(utilizadorPraticanteOcasional0);
      assertEquals((-151.3518337673611), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = MockLocalTime.ofSecondOfDay(1781L);
      Flexoes flexoes0 = new Flexoes((LocalDateTime) null, localTime0, 0, 0);
      // Undeclared exception!
      try { 
        flexoes0.geraAtividade((Utilizador) null, 3959.6257797503);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Flexoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      Flexoes flexoes1 = new Flexoes(flexoes0);
      flexoes1.setTempo((LocalTime) null);
      // Undeclared exception!
      try { 
        flexoes1.equals(flexoes0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Atividade", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      UtilizadorProfissional utilizadorProfissional0 = new UtilizadorProfissional();
      // Undeclared exception!
      try { 
        flexoes0.consumoCalorias(utilizadorProfissional0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.mycompany.solucao1.AtivRepeticoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Flexoes flexoes0 = null;
      try {
        flexoes0 = new Flexoes((Flexoes) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Atividade", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      Flexoes flexoes1 = new Flexoes(flexoes0);
      boolean boolean0 = flexoes1.equals(flexoes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      boolean boolean0 = flexoes0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      boolean boolean0 = flexoes0.equals(flexoes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      boolean boolean0 = flexoes0.equals("Atividade\nId: 1\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nTipo de atividade: Flex\u00F5es\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      String string0 = flexoes0.toString();
      assertEquals("Atividade\nId: 1\nData e hora: 14/02/2014 20:21:21\nDura\u00E7ao: 00:00\nFrequencia Cardiaca: 0 bpm\nRepeti\u00E7oes: 0\nTipo de atividade: Flex\u00F5es\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      Object object0 = flexoes0.clone();
      assertNotSame(object0, flexoes0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Flexoes flexoes0 = new Flexoes();
      // Undeclared exception!
      try { 
        flexoes0.consumoCalorias((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Flexoes", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = MockLocalTime.now();
      Flexoes flexoes0 = new Flexoes((LocalDateTime) null, localTime0, 531, 531);
      // Undeclared exception!
      try { 
        flexoes0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.mycompany.solucao1.Atividade", e);
      }
  }
}
