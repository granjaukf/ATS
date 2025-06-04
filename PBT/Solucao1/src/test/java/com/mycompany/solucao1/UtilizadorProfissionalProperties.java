package com.mycompany.solucao1;

import net.jqwik.api.*;
import net.jqwik.time.api.Dates;
import java.time.LocalDate;

public class UtilizadorProfissionalProperties {

    @Provide
    Arbitrary<UtilizadorProfissional> utilizadores() {
        return Arbitraries.integers().between(50, 200).flatMap(freq ->
               Arbitraries.integers().between(45, 125).flatMap(peso ->
               Arbitraries.integers().between(140, 210).flatMap(altura ->
               Dates.dates().between(LocalDate.of(1970, 1, 1), LocalDate.of(2010, 12, 31)).flatMap(nasc ->
               Arbitraries.chars().with('M', 'F').map(gen ->
               new UtilizadorProfissional("Teste", "Rua X", "x@y.com", freq, peso, altura, nasc, gen)
        )))));
    }

    @Property
    boolean fatorMultiplicativoEhConstante(@ForAll("utilizadores") UtilizadorProfissional u) {
        return u.getFatorMultiplicativo() == 1.5;
    }

    @Property
    boolean cloneEhIgual(@ForAll("utilizadores") UtilizadorProfissional u) {
        return u.clone().equals(u);
    }

    @Property
    boolean equalsComCopia(@ForAll("utilizadores") UtilizadorProfissional u) {
        return new UtilizadorProfissional(u).equals(u);
    }
}