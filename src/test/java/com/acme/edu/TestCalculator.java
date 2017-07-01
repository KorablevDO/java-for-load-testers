package com.acme.edu;

import com.acme.edu.calculator.Calculator;
import com.acme.edu.calculator.LaunchCalculator;

/**
 * Tests
 */

public class TestCalculator {
    public static void main(String[] args) {
        LaunchCalculator run1 = new LaunchCalculator();
        LaunchCalculator run2 = new LaunchCalculator();
        String[] case1 = {"add" ,"1", "1", "div", "8", "4"};
        String[] case2 ={"1", "1", "sub", "9", "5", "add", "8", "8"};
        run1.computing(case1);
        run1.getLog();
        System.out.println("----------------");
        run2.computing(case2);
        run2.getLog();
    }

    private static Calculator log = new Calculator();

    private static void addition(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " + " +  secondNumber + " = " + log.addition(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void addition(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " + " +  secondNumber + " = " + log.addition(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void subtraction(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " - " +  secondNumber + " = " + log.subtraction(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void subtraction(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " - " +  secondNumber + " = " + log.subtraction(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void saveMemory(double number){
        log.setInMemory(number);
        log.saveInMemory();
        System.out.println("Set"+ number + " SaveInMerory " + log.getStoredMemory());

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void multiplication(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " * " +  secondNumber + " = " + log.multiplication(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void multiplication(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " * " +  secondNumber + " = " + log.multiplication(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void division(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " / " +  secondNumber + " = " + log.division(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void division(double firstNumber, double secondNumber){
        System.out.println(firstNumber + " / " +  secondNumber + " = " + log.division(firstNumber, secondNumber));

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void memoryPlus(int firstNumber, int secondNumber){
        log.setInMemory(firstNumber);
        log.saveInMemory();
        System.out.println("memoryPlus " + firstNumber + "+" + log.addition(firstNumber, secondNumber) + " = " +
                log.getAmountMemoryAndLastOperation());

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void memoryPlus(double firstNumber, double secondNumber) {
        log.setInMemory(firstNumber);
        log.saveInMemory();
        System.out.println("memoryPlus " + firstNumber + "+" + log.addition(firstNumber, secondNumber) + " = " +
                log.getAmountMemoryAndLastOperation());

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void memoryMinus(int firstNumber, int secondNumber) {
        log.setInMemory(firstNumber);
        log.saveInMemory();
        System.out.println("memoryMinus " + firstNumber + "-" + log.subtraction(firstNumber, secondNumber) + " = " +
                log.getDifferenceMemoryAndOperation());

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void memoryMinus(double firstNumber, double secondNumber){
        log.setInMemory(firstNumber);
        log.saveInMemory();
        System.out.println("memoryMinus " + firstNumber + "-" + log.subtraction(firstNumber, secondNumber) + " = " +
                log.getDifferenceMemoryAndOperation());

        log.setInMemory(0);
        log.saveInMemory();
    }

    private static void module(double number) {
        System.out.println("module " + number + " -> " + log.moduleNumber(number));
    }

    private static void checkLimit(double firstNumber, double secondNumber){
        System.out.println("Limit 10  вызов суммы " + firstNumber + " + " + secondNumber + "-> " + log.addition(firstNumber, secondNumber));
    }

}
