package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.*;
import java.time.*;
import java.util.*;

public class CiclismoProperties {

    @Provide
    Arbitrary<Ciclismo> atividades() {
        Arbitrary<LocalDateTime> datas = DateTimes.dateTimes().between(
            LocalDateTime.of(2020, 1, 1, 0, 0),
            LocalDateTime.of(2025, 12, 31, 23, 59)
        );
        
        Arbitrary<LocalTime> tempos = Times.times().between(
            LocalTime.of(0, 15),  // mínimo 15 minutos
            LocalTime.of(6, 0)    // máximo 6 horas
        );
        
        Arbitrary<Integer> freqCardiaca = Arbitraries.integers().between(70, 160);
        Arbitrary<Double> distancias = Arbitraries.doubles().between(5000.0, 100000.0); // 5km a 100km
        
        return Combinators.combine(datas, tempos, freqCardiaca, distancias)
            .as((data, tempo, freq, distancia) -> 
                new Ciclismo(data, tempo, freq, distancia));
    }

    @Property
    boolean consumoCaloriasPositivo(@ForAll("atividades") Ciclismo ciclismo) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        return ciclismo.consumoCalorias(utilizador) > 0;
    }

    @Property
    boolean consumoAumentaComTempo(@ForAll("atividades") Ciclismo ciclismo) {
        UtilizadorAmador utilizador = new UtilizadorAmador();
        double consumoOriginal = ciclismo.consumoCalorias(utilizador);
        
        Ciclismo comMaisTempo = new Ciclismo(ciclismo);
        comMaisTempo.setTempo(ciclismo.getTempo().plusMinutes(15));
        
        return comMaisTempo.consumoCalorias(utilizador) > consumoOriginal;
    }

    @Property
    boolean velocidadeCalculadaCorretamente(@ForAll("atividades") Ciclismo ciclismo) {
        double velocidadeEsperada = ciclismo.getDistancia() / ciclismo.getTempo().toSecondOfDay();
        return Math.abs(ciclismo.getVelocidade() - velocidadeEsperada) < 0.001;
    }

    @Property
    boolean cloneEhIgual(@ForAll("atividades") Ciclismo ciclismo) {
        return ciclismo.clone().equals(ciclismo);
    }

    @Property
    boolean equalsComCopia(@ForAll("atividades") Ciclismo ciclismo) {
        return new Ciclismo(ciclismo).equals(ciclismo);
    }
}
