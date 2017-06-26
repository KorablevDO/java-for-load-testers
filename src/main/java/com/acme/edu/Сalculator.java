package com.acme.edu;

/**
 * Created by do.korablev on 26.06.2017.
 */
public class Сalculator {
    private static int memori = 0;
    private static int operationMemori = 0;

    public static int summa(int a, int b) {
        operationMemori = a + b;
        return operationMemori;
    }

    public static int subtraction(int a, int b) {
        operationMemori = a - b;
        return operationMemori;
    }

    public static int multiplication(int a, int b) {
        operationMemori = a * b;
        return operationMemori;
    }

    public static int division(int a, int b) {
        operationMemori = a / b;
        return operationMemori;
    }

    public static void write(int a) {
        operationMemori = a;
    }

    public static void memory() {
        memori = operationMemori;
    }

    public static int memoryPlus() {
        return memori + operationMemori;
    }

    public static int memoryMinus() {
        return memori - operationMemori;
    }
}
