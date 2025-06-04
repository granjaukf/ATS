package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class BicepCurlsProperties {

    @Provide
    Arbitrary<BicepCurls> atividades() {
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
        Arbitrary<Double> pesos = Arbitraries.doubles().between(5.0, 50.0);
        
        return Combinators.combine(datas, tempos, freqCardiaca, repeticoes, pesos)
            .as((data, tempo, freq, reps, peso) -> 
                new BicepCurls(data, tempo, freq, reps, peso));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") BicepCurls bicepCurls) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return bicepCurls.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComRepeticoes(@ForAll("atividades") BicepCurls bicepCurls) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = bicepCurls.consumoCalorias(utilizador);
        
        BicepCurls comMaisReps = new BicepCurls(bicepCurls);
        comMaisReps.setRepeticoes(bicepCurls.getRepeticoes() + 10);
        
        return comMaisReps.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") BicepCurls bicepCurls) {
        return bicepCurls.clone().equals(bicepCurls);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") BicepCurls bicepCurls) {
        return new BicepCurls(bicepCurls).equals(bicepCurls);
    }
}