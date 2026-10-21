package com.senai.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcPotenciaTest{
    @Test
    void testarPotencia(){
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(127, 2.5);
        assertEquals(317,5, potencia);
    }
}