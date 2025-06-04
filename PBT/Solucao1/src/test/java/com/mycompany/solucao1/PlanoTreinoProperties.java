package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Objects;

public class PlanoTreinoProperties {

    @Provide
    Arbitrary<PlanoTreino> planosTreino() {
        Arbitrary<LocalDate> datas = Dates.dates().between(
            LocalDate.of(2020, 1, 1),
            LocalDate.of(2025, 12, 31)
        );
        
        Arbitrary<List<Atividade>> atividadesList = atividades().list().ofSize(5);
        Arbitrary<List<Integer>> iteracoesList = Arbitraries.integers().between(1, 10).list().ofSize(5);
        
        return Combinators.combine(datas, atividadesList, iteracoesList)
            .as((data, atividades, iteracoes) -> {
                PlanoTreino plano = new PlanoTreino(data);
                int max = Math.min(atividades.size(), iteracoes.size());
                for (int i = 0; i < max; i++) {
                    plano.addAtividade(atividades.get(i), iteracoes.get(i));
                }
                return plano;
            });
    }
    
    @Provide
    Arbitrary<Atividade> atividades() {
        Arbitrary<Corrida> corridas = corridas();
        Arbitrary<Ciclismo> ciclismos = ciclismos();
        Arbitrary<Flexoes> flexoes = flexoes();
        
        return Arbitraries.oneOf(corridas, ciclismos, flexoes);
    }
    
    @Provide
    Arbitrary<Corrida> corridas() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes();
        Arbitrary<LocalTime> tempos = Times.times().between(LocalTime.of(0, 10), LocalTime.of(2, 0));
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(80, 180);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(1000, 20000);
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias)
            .as(Corrida::new);
    }
    
    @Provide
    Arbitrary<Ciclismo> ciclismos() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes();
        Arbitrary<LocalTime> tempos = Times.times().between(LocalTime.of(0, 30), LocalTime.of(3, 0));
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(70, 160);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(5000, 50000);
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias)
            .as(Ciclismo::new);
    }
    
    @Provide
    Arbitrary<Flexoes> flexoes() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes();
        Arbitrary<LocalTime> tempos = Times.times().between(LocalTime.of(0, 1), LocalTime.of(0, 30));
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(60, 150);
        Arbitrary<Integer> repeticoes = Arbitraries.integers().between(5, 50);
        
        return Combinators.combine(datas, tempos, freqCardiaca, repeticoes)
            .as((data, tempo, freq, reps) -> new Flexoes(data, tempo, freq, reps));
    }

    @Property
    boolean caloriasSaoSomaDasAtividades(@ForAll("planosTreino") PlanoTreino plano) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double caloriasCalculadas = plano.caloriasDispendidas(utilizador);
        
        double caloriasEsperadas = 0;
        for (PlanoTreino.AtividadeIteracoes ai : plano.getAtividades()) {
            caloriasEsperadas += ai.getIteracoes() * ai.getAtividade().consumoCalorias(utilizador);
        }
        
        return Math.abs(caloriasCalculadas - caloriasEsperadas) < 0.001;
    }

    @Property
    boolean cloneEhIgual(@ForAll("planosTreino") PlanoTreino plano) {
        PlanoTreino clone = (PlanoTreino) plano.clone();
        return clone.equals(plano);
    }

    @Property
    boolean equalsComCopia(@ForAll("planosTreino") PlanoTreino plano) {
        PlanoTreino copia = new PlanoTreino(plano);
        return copia.equals(plano);
    }

    @Property
    boolean atividadesNoPeriodoCorretas(@ForAll("planosTreino") PlanoTreino plano) {
        LocalDate inicio = plano.getDataRealizacao().minusDays(1);
        LocalDate fim = plano.getDataRealizacao().plusDays(1);
        
        List<PlanoTreino.AtividadeIteracoes> atividadesNoPeriodo = 
            plano.getAtividadesNumPeriodo(inicio, fim);
        
        return atividadesNoPeriodo.size() == plano.getAtividades().size();
    }

    @Property
    boolean geraPlanoValido(@ForAll List<Atividade> atividades) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        LocalDate inicio = LocalDate.now();
        
        atividades = atividades.stream()
            .filter(Objects::nonNull)
            .limit(10)
            .collect(Collectors.toList());
        
        if (atividades.isEmpty()) return true;
        
        List<PlanoTreino> planos = new PlanoTreino().geraPlanoTreino(
            utilizador, atividades, 3, 5, 1000, inicio);
        
        return !planos.isEmpty() && 
               planos.size() <= 7 &&
               planos.stream().allMatch(p -> 
                   p.getAtividades().size() <= 3);
    }
}