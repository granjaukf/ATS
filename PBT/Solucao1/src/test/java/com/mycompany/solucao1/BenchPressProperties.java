package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class BenchPressProperties {

    @Provide
    Arbitrary<BenchPress> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 1),  // mínimo 1 minuto
            LocalTime.of(1, 0)   // máximo 1 hora
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(60, 200);
        Arbitrary<Integer> repeticoes = Arbitraries.integers().between(1, 100);
        Arbitrary<Double> pesos = Arbitraries.doubles().between(20.0, 200.0);
        
        return Combinators.combine(datas, tempos, freqCardiaca, repeticoes, pesos)
            .as((data, tempo, freq, reps, peso) -> 
                new BenchPress(data, tempo, freq, reps, peso));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") BenchPress benchPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return benchPress.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComPeso(@ForAll("atividades") BenchPress benchPress) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = benchPress.consumoCalorias(utilizador);
        
        BenchPress comMaisPeso = new BenchPress(benchPress);
        comMaisPeso.setPeso(benchPress.getPeso() + 10);
        
        return comMaisPeso.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") BenchPress benchPress) {
        return benchPress.clone().equals(benchPress);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") BenchPress benchPress) {
        return new BenchPress(benchPress).equals(benchPress);
    }
}