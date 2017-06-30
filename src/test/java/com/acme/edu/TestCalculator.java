package com.acme.edu;

/**
 * Created by do.korablev on 26.06.2017.
 */

public class TestCalculator {
    public static void main(String[] args) {
        summa();
        subtraction();
        setMemoryAndMemoryAndGetMemory();
        multiplication();
        division();
        memoryPlus();
        memoryMinus();
        module();
    }

    private static void summa(){
        int a = 4;
        int b = 4;
        double c = 3.2;
        double d = 1.9;

        int result1 = Сalculator.summa(a, b);
        double result2 = Сalculator.summa(d, c);

        if((result1 > a) && (result1 > b)){
            System.out.println("summa pass " + result1);
        }else{
            System.out.println("summa Fail " + result1);
        }

        if((result2 > c) && (result2 > d)){
            System.out.println("summa pass " + result2);
        }else{
            System.out.println("summa Fail " + result2);
        }

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void subtraction(){
        int a = 4;
        int b = 4;
        double c = 3.2;
        double d = 1.9;

        int result1 = Сalculator.subtraction(a, b);
        double result2 = Сalculator.subtraction(d, c);

        if((result1 < a) && (result1 < b)){
            System.out.println("subtraction pass " + result1);
        }else{
            System.out.println("subtraction Fail " + result1);
        }

        if((result2 < c) && (result2 < d)){
            System.out.println("subtraction pass " + result2);
        }else{
            System.out.println("subtraction Fail " + result2);
        }

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void setMemoryAndMemoryAndGetMemory(){
        int a = 6;
        double b = 3.3;

        Сalculator.setMemory(a);
        Сalculator.memory();
        System.out.println(a + " -> " + Сalculator.getMemory());

        Сalculator.setMemory(b);
        Сalculator.memory();
        System.out.println(b + " -> " + Сalculator.getMemory());

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void multiplication(){
        int a = 2;
        int b = 2;
        double c = 3.2;
        double d = 1.9;

        int result1 = Сalculator.multiplication(a, b);
        double result2 = Сalculator.multiplication(d, c);

        if((result1 > a) && (result1 > b)){
            System.out.println("multiplication pass " + result1);
        }else{
            System.out.println("multiplication Fail " + result1);
        }

        if((result2 > c) && (result2 > d)){
            System.out.println("multiplication pass " + result2);
        }else{
            System.out.println("multiplication Fail " + result2);
        }

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void division(){
        int a = 8;
        int b = 4;
        double c = 4.2;
        double d = 1.9;

        int result1 = Сalculator.division(a, b);
        double result2 = Сalculator.division(d, c);

        if((result1 < a) && (result1 < b)){
            System.out.println("division pass " + result1);
        }else{
            System.out.println("division Fail " + result1);
        }

        if((result2 < c) && (result2 < d)){
            System.out.println("division pass " + result2);
        }else{
            System.out.println("division Fail " + result2);
        }

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void memoryPlus(){
        int a = 2;
        int b = 1;
        double c = 3.3;
        double d = 2.2;

        Сalculator.setMemory(a);
        Сalculator.memory();
        System.out.println("memoryPlus " + a + "+" + Сalculator.summa(a, b) + " = " + Сalculator.getMemoryPlus());

        Сalculator.setMemory(0);
        Сalculator.memory();

        Сalculator.setMemory(b);
        Сalculator.memory();
        Сalculator.summa(c, d);
        System.out.println("memoryPlus " + b + "+" + Сalculator.summa(c, b) + " = " + Сalculator.getMemoryPlus());

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    private static void memoryMinus() {
        int a = 8;
        int b = 2;
        double c = 8.3;
        double d = 2.2;

        Сalculator.setMemory(a);
        Сalculator.memory();
        System.out.println("memoryMinus " + a + "-" + Сalculator.subtraction(a, b) + " = " + Сalculator.getMemoryMinus());

        Сalculator.setMemory(0);
        Сalculator.memory();

        Сalculator.setMemory(c);
        Сalculator.memory();
        Сalculator.summa(c, d);
        System.out.println("memoryMinus " + b + "-" + Сalculator.subtraction(c, b) + " = " + Сalculator.getMemoryMinus());

        Сalculator.setMemory(0);
        Сalculator.memory();
    }

    public static void module() {
        int a = -5;
        double b = -2.1;
        System.out.println("module " + a + " -> " + Сalculator.module(a));
        System.out.println("module " + b + " -> " + Сalculator.module(b));
    }
}
