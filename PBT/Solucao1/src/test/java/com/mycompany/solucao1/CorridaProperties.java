package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class CorridaProperties {

    @Provide
    Arbitrary<Corrida> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 10),  // mínimo 10 minutos
            LocalTime.of(3, 0)     // máximo 3 horas
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(80, 180);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(1000.0, 42000.0); // 1km a 42km
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias)
            .as((data, tempo, freq, distancia) -> 
                new Corrida(data, tempo, freq, distancia));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") Corrida corrida) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return corrida.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComDistancia(@ForAll("atividades") Corrida corrida) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = corrida.consumoCalorias(utilizador);
        
        Corrida comMaisDistancia = new Corrida(corrida);
        comMaisDistancia.setDistancia(corrida.getDistancia() + 1000);
        
        return comMaisDistancia.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean velocidadeCalculadaCorretamente(@ForAll("atividades") Corrida corrida) {
        double velocidadeEsperada = corrida.getDistancia() / corrida.getTempo().toSecondOfDay();
        return Math.abs(corrida.getVelocidade() - velocidadeEsperada) < 0.001;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") Corrida corrida) {
        return corrida.clone().equals(corrida);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") Corrida corrida) {
        return new Corrida(corrida).equals(corrida);
    }
}
