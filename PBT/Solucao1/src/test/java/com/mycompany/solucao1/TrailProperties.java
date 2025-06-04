package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class TrailProperties {

    @Provide
    Arbitrary<Trail> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 30),  // mínimo 30 minutos
            LocalTime.of(8, 0)    // máximo 8 horas
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(80, 180);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(5000.0, 50000.0); // 5km a 50km
        Arbitrary<Double> altimetrias = Arbitraries.doubles().between(100.0, 3000.0); // 100m a 3000m
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias, altimetrias)
            .as((data, tempo, freq, distancia, altimetria) -> 
                new Trail(data, tempo, freq, distancia, altimetria));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") Trail trail) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return trail.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComAltimetria(@ForAll("atividades") Trail trail) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = trail.consumoCalorias(utilizador);
        
        Trail comMaisAltimetria = new Trail(trail);
        comMaisAltimetria.setAltimetria(trail.getAltimetria() + 500);
        
        return comMaisAltimetria.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean fatorHardAumentaComAltimetria(@ForAll("atividades") Trail trail) {
        double fatorOriginal = trail.getFatorHard();
        
        Trail comMaisAltimetria = new Trail(trail);
        comMaisAltimetria.setAltimetria(trail.getAltimetria() + 1500);
        
        return comMaisAltimetria.getFatorHard() > fatorOriginal;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") Trail trail) {
        return trail.clone().equals(trail);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") Trail trail) {
        return new Trail(trail).equals(trail);
    }
}
