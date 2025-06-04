package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class BttProperties {

    @Provide
    Arbitrary<Btt> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 30),  // mínimo 30 minutos
            LocalTime.of(6, 0)    // máximo 6 horas
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(70, 160);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(10000.0, 100000.0); // 10km a 100km
        Arbitrary<Double> altimetrias = Arbitraries.doubles().between(200.0, 2500.0); // 200m a 2500m
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias, altimetrias)
            .as((data, tempo, freq, distancia, altimetria) -> 
                new Btt(data, tempo, freq, distancia, altimetria));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") Btt btt) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return btt.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComDistancia(@ForAll("atividades") Btt btt) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = btt.consumoCalorias(utilizador);
        
        Btt comMaisDistancia = new Btt(btt);
        comMaisDistancia.setDistancia(btt.getDistancia() + 10000);
        
        return comMaisDistancia.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean fatorHardCalculadoCorretamente(@ForAll("atividades") Btt btt) {
        double alt = btt.getAltimetria();
        double expected = 1.05;
        if (alt > 1000) expected += 0.10;
        if (alt > 2000) expected += 0.10;
        
        return Math.abs(btt.getFatorHard() - expected) < 0.001;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") Btt btt) {
        return btt.clone().equals(btt);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") Btt btt) {
        return new Btt(btt).equals(btt);
    }
}
