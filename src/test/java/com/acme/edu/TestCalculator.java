package com.acme.edu;

/**
 * Created by do.korablev on 26.06.2017.
 */

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println(Сalculator.summa(10, 10));
        Сalculator.write(6);
        Сalculator.memory();
        System.out.println(Сalculator.subtraction(10, 5));
        System.out.println(Сalculator.memoryPlus());
        System.out.println(Сalculator.multiplication(10, 10));
        Сalculator.memory();
        System.out.println(Сalculator.division(50, 5));
        System.out.println(Сalculator.memoryMinus());
    }
}
