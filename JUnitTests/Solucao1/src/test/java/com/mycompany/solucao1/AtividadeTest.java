package com.mycompany.solucao1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AtividadeTest {
    
    // Classe de implementação concreta de Atividade para realizar os testes
    private class AtividadeConcreta extends Atividade {
        public AtividadeConcreta() {
            super();
        }
        
        public AtividadeConcreta(LocalDateTime realizacao, LocalTime tempo, int freqCardiaca) {
            super(realizacao, tempo, freqCardiaca);
        }
        
        public AtividadeConcreta(Atividade umaAtividade) {
            super(umaAtividade);
        }
        
        @Override
        public double consumoCalorias(Utilizador utilizador) {
        
            return 500.0 * getFatorFreqCardiaca(utilizador);
        }
        
        @Override
        public Atividade geraAtividade(Utilizador utilizador, double consumoCalorias) {
          
            return new AtividadeConcreta();
        }
        
        @Override
        public Object clone() {
            return new AtividadeConcreta(this);
        }
    }
    
    
    @Test
    public void testGetFatorFreqCardiaca() {
        
        UtilizadorAmador utilizador = new UtilizadorAmador(); 
        int utilizadorFreqCardiaca = 70; 
        utilizador.setFreqCardiaca(utilizadorFreqCardiaca); 
        
        AtividadeConcreta atividade = new AtividadeConcreta();
        int atividadeFreqCardiaca = 140; 
        atividade.setFreqCardiaca(atividadeFreqCardiaca); 
        
        double expected = ((70 / 140) - 2) * 0.4;
        
        assertEquals(expected, atividade.getFatorFreqCardiaca(utilizador), 0.0001); // delta
    }
    
    @Test
    public void testConsumoCalorias() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        utilizador.setFreqCardiaca(70); 
        

        AtividadeConcreta atividade = new AtividadeConcreta();
        atividade.setFreqCardiaca(140); 
             
        double fatorFreqCardiaca = atividade.getFatorFreqCardiaca(utilizador);
        double expectedCalorias = 500.0 * fatorFreqCardiaca;
       
        assertEquals(expectedCalorias, atividade.consumoCalorias(utilizador), 0.0001);
    }
    
    @Test
    public void testGeraAtividade() {
        UtilizadorAmador utilizador = new UtilizadorAmador();
    
        AtividadeConcreta atividade = new AtividadeConcreta();
        atividade.setFreqCardiaca(120); 
        
       
        double consumoCalorias = 500.0; 
        Atividade novaAtividade = atividade.geraAtividade(utilizador, consumoCalorias);
        
        assertNotNull(novaAtividade);
        assertTrue(novaAtividade instanceof AtividadeConcreta);
    }

    
    /* // acho que nao é preciso destes metodos 
      @Test
    public void testClone() {
        UtilizadorAmador utilizador = new UtilizadorAmador("Teste", "Rua das Flores", "teste@email.com", 
                                          70, 70, 170, LocalDate.of(1990, 1, 1), 'M');
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 30);
        int freqCardiaca = 120;

        AtividadeConcreta atividade = new AtividadeConcreta(dataRealizacao, tempo, freqCardiaca);
        AtividadeConcreta clone = (AtividadeConcreta) atividade.clone();
        
        // verificar se o clone não é o mesmo objeto (referência diferente)
        assertNotSame(atividade, clone);
        
        // verificar se os atributos são iguais
        assertEquals(atividade.getCodAtividade(), clone.getCodAtividade());
        assertEquals(atividade.getDataRealizacao(), clone.getDataRealizacao());
        assertEquals(atividade.getTempo(), clone.getTempo());
        assertEquals(atividade.getFreqCardiaca(), clone.getFreqCardiaca());
    }
    
    @Test
    public void testCompareTo() {
        UtilizadorAmador utilizador = new UtilizadorAmador("Teste", "Rua das Flores", "teste@email.com", 
                                          70, 70, 170, LocalDate.of(1990, 1, 1), 'M');
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 30); // 1 hora e 30 minutos
        int freqCardiaca = 120;
        
        LocalDateTime dataAntes = LocalDateTime.of(2024, 5, 8, 10, 0);
        LocalDateTime dataDepois = LocalDateTime.of(2024, 5, 10, 10, 0);
        
        AtividadeConcreta atividadeAntes = new AtividadeConcreta(dataAntes, tempo, freqCardiaca);
        AtividadeConcreta atividadeBase = new AtividadeConcreta(dataRealizacao, tempo, freqCardiaca);
        AtividadeConcreta atividadeDepois = new AtividadeConcreta(dataDepois, tempo, freqCardiaca);
        
        // Verificar ordenação por data
        assertTrue(atividadeAntes.compareTo(atividadeBase) < 0);
        assertTrue(atividadeBase.compareTo(atividadeDepois) < 0);
        assertTrue(atividadeBase.compareTo(atividadeBase) == 0);
        
        // Criar atividades com a mesma data para testar desempate por código
        AtividadeConcreta atividade1 = new AtividadeConcreta(dataRealizacao, tempo, freqCardiaca);
        AtividadeConcreta atividade2 = new AtividadeConcreta(dataRealizacao, tempo, freqCardiaca);
        
        // O resultado deve ser diferente de 0 pois os códigos são diferentes
        assertNotEquals(0, atividade1.compareTo(atividade2));
    }
    
    @Test
    public void testToString() {
        UtilizadorAmador utilizador = new UtilizadorAmador("Teste", "Rua das Flores", "teste@email.com", 
                                          70, 70, 170, LocalDate.of(1990, 1, 1), 'M');
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 30); // 1 hora e 30 minutos
        int freqCardiaca = 120;

        AtividadeConcreta atividade = new AtividadeConcreta(dataRealizacao, tempo, freqCardiaca);
        String resultado = atividade.toString();
        
        // Verificar se o resultado contém informações importantes
        assertTrue(resultado.contains("Atividade"));
        assertTrue(resultado.contains("Id: " + atividade.getCodAtividade()));
        assertTrue(resultado.contains("Data e hora: "));
        assertTrue(resultado.contains("Duraçao: " + tempo));
        assertTrue(resultado.contains("Frequencia Cardiaca: " + freqCardiaca + " bpm"));
    }

    @Test
    public void testProximoCodigo() {
        UtilizadorAmador utilizador = new UtilizadorAmador("Teste", "Rua das Flores", "teste@email.com", 
                                          70, 70, 170, LocalDate.of(1990, 1, 1), 'M');
        LocalDateTime dataRealizacao = LocalDateTime.of(2024, 5, 9, 10, 0);
        LocalTime tempo = LocalTime.of(1, 30); // 1 hora e 30 minutos
        int freqCardiaca = 120;

        // Limpar códigos anteriores para fazer um teste limpo
        int codigoInicial = 100;
        AtividadeConcreta atividade = new AtividadeConcreta();
        atividade.setProximoCodigo(codigoInicial);
        
        // Criar uma nova atividade para verificar se o código foi incrementado
        AtividadeConcreta novaAtividade = new AtividadeConcreta();
        
        // O código da nova atividade deve ser igual ao codigoInicial
        assertEquals(codigoInicial, novaAtividade.getCodAtividade());
        
        // A próxima atividade deve ter código incrementado
        AtividadeConcreta tercaAtividade = new AtividadeConcreta();
        assertEquals(codigoInicial + 1, tercaAtividade.getCodAtividade());
    }
    */
}
