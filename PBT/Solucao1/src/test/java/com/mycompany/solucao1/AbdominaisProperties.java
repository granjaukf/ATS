package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class AbdominaisProperties {

    @Provide
    Arbitrary<Abdominais> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 1),  // mínimo 1 minuto
            LocalTime.of(2, 0)   // máximo 2 horas
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(60, 200);
        Arbitrary<Integer> repeticoes = Arbitraries.integers().between(1, 1000);
        
        return Combinators.combine(datas, tempos, freqCardiaca, repeticoes)
            .as((data, tempo, freq, reps) -> 
                new Abdominais(data, tempo, freq, reps));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") Abdominais abdominais) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return abdominais.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") Abdominais abdominais) {
        return abdominais.clone().equals(abdominais);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") Abdominais abdominais) {
        return new Abdominais(abdominais).equals(abdominais);
    }
}