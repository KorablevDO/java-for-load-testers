package com.acme.edu;

/**
 * Tests
 */

public class TestCalculator {
    public static void main(String[] args) {
        addition(4,4);
        addition(2.2, 2.2);
        subtraction(4,2);
        subtraction(4.4,2.2);
        saveMemory(5);
        saveMemory(5.5);
        multiplication(2, 2);
        multiplication(2.2 ,2.2);
        multiplication(2.2 ,0);
        division(4, 2);
        division(4.4, 2);
        division(4.4, 0);
        memoryPlus(1, 3);
        memoryPlus(1.1, 3.1);
        memoryMinus(3, 1);
        memoryMinus(3.1, 1.2);
        module(-5);
        checkLimit(6,6);
    }

    private static void addition(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " + " +  secondNumber + " = " + Сalculator.addition(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void addition(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " + " +  secondNumber + " = " + Сalculator.addition(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void subtraction(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " - " +  secondNumber + " = " + Сalculator.subtraction(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void subtraction(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " - " +  secondNumber + " = " + Сalculator.subtraction(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void saveMemory(double number){
        Сalculator.setInMemory(number);
        Сalculator.saveInMemory();
        System.out.println("Set"+ number + " SaveInMerory " + Сalculator.getStoredMemory());

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void multiplication(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " * " +  secondNumber + " = " + Сalculator.multiplication(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void multiplication(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " * " +  secondNumber + " = " + Сalculator.multiplication(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void division(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " / " +  secondNumber + " = " + Сalculator.division(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void division(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " / " +  secondNumber + " = " + Сalculator.division(firstNumber, secondNumber));

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void memoryPlus(int firstNumber, int secondNumber){
        Сalculator.setInMemory(firstNumber);
        Сalculator.saveInMemory();
        System.out.println("memoryPlus " + firstNumber + "+" + Сalculator.addition(firstNumber, secondNumber) + " = " +
                Сalculator.getAmountMemoryAndLastOperation());

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void memoryPlus(double firstNumber, double secondNumber) {
        Сalculator.setInMemory(firstNumber);
        Сalculator.saveInMemory();
        System.out.println("memoryPlus " + firstNumber + "+" + Сalculator.addition(firstNumber, secondNumber) + " = " +
                Сalculator.getAmountMemoryAndLastOperation());

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void memoryMinus(int firstNumber, int secondNumber) {
        Сalculator.setInMemory(firstNumber);
        Сalculator.saveInMemory();
        System.out.println("memoryMinus " + firstNumber + "-" + Сalculator.subtraction(firstNumber, secondNumber) + " = " +
                Сalculator.getDifferenceMemoryAndOperation());

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void memoryMinus(double firstNumber, double secondNumber){
        Сalculator.setInMemory(firstNumber);
        Сalculator.saveInMemory();
        System.out.println("memoryMinus " + firstNumber + "-" + Сalculator.subtraction(firstNumber, secondNumber) + " = " +
                Сalculator.getDifferenceMemoryAndOperation());

        Сalculator.setInMemory(0);
        Сalculator.saveInMemory();
    }

    private static void module(double number) {
        System.out.println("module " + number + " -> " + Сalculator.moduleNumber(number));
    }

    private static void checkLimit(double firstNumber, double secondNumber){
        System.out.println("Limit 10  вызов суммы " + firstNumber + " + " + secondNumber + "-> " + Сalculator.addition(firstNumber, secondNumber));
    }

}
