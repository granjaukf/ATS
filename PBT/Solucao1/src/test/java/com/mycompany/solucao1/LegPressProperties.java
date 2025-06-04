package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class LegPressProperties {

    @Provide
    Arbitrary<LegPress> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 1),  // mínimo 1 minuto
            LocalTime.of(1, 30)  // máximo 1 hora e 30 minutos
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(60, 180);
        Arbitrary<Integer> repeticoes = Arbitraries.integers().between(1, 50);
        Arbitrary<Double> pesos = Arbitraries.doubles().between(20.0, 300.0); // 20kg a 300kg
        
        return Combinators.combine(datas, tempos, freqCardiaca, repeticoes, pesos)
            .as((data, tempo, freq, reps, peso) -> 
                new LegPress(data, tempo, freq, reps, peso));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") LegPress legPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return legPress.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComPeso(@ForAll("atividades") LegPress legPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = legPress.consumoCalorias(utilizador);
        
        LegPress comMaisPeso = new LegPress(legPress);
        comMaisPeso.setPeso(legPress.getPeso() + 20);
        
        return comMaisPeso.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean consumoAumentaComRepeticoes(@ForAll("atividades") LegPress legPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = legPress.consumoCalorias(utilizador);
        
        LegPress comMaisReps = new LegPress(legPress);
        comMaisReps.setRepeticoes(legPress.getRepeticoes() + 5);
        
        return comMaisReps.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") LegPress legPress) {
        return legPress.clone().equals(legPress);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") LegPress legPress) {
        return new LegPress(legPress).equals(legPress);
    }

    @Property
    boolean geraAtividadeValida(@ForAll("atividades") LegPress legPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoDesejado = 300; // 300 calorias
        Atividade atividadeGerada = legPress.geraAtividade(utilizador, consumoDesejado);
        
        return atividadeGerada != null && 
               atividadeGerada instanceof LegPress &&
               ((LegPress)atividadeGerada).getPeso() > 0 &&
               ((LegPress)atividadeGerada).getRepeticoes() > 0;
    }
}