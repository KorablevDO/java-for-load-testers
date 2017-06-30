package com.acme.edu;

/**
 *
 */
public class Сalculator {
    private static double storedNumber = 0;
    private static double lastNumberObtained = 0;

    public static int addition(int firstNumber, int secondNumber) {
        return (int) addition((double) firstNumber, (double) secondNumber);
    }

    public static int subtraction(int firstNumber, int secondNumber) {
        return (int) subtraction((double) firstNumber, (double) secondNumber);
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        return (int) multiplication((double) firstNumber, (double) secondNumber);
    }

    public static int division(int firstNumber, int secondNumber) {
        return (int) division((double) firstNumber, (double) secondNumber);
    }

    public static double addition(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) + (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) - (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) * (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public static double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            lastNumberObtained = (firstNumber) / (secondNumber);
        } else {
            lastNumberObtained = 0;
            System.out.println("На 0 делить нелльзя");
        }
        return checkForRestrictions(lastNumberObtained);
    }

    public static void setInMemory(double number) {
        lastNumberObtained = checkForRestrictions(number);
    }

    public static void saveInMemory() {
        storedNumber = lastNumberObtained;
    }

    public static double getAmountMemoryAndLastOperation() {
        return checkForRestrictions(storedNumber + lastNumberObtained);
    }

    public static double getDifferenceMemoryAndOperation() {
        return checkForRestrictions(storedNumber - lastNumberObtained);
    }

    public static double getStoredMemory() {
        return storedNumber;
    }

    private static double checkForRestrictions(double number) {
        int limit = 10;

        if (number > limit) {
            return (limit);
        } else if (number < -limit) {
            return (-limit);
        } else {
            return (number);
        }
    }

    public static double moduleNumber(double number) {
        return number * -1;
    }
}
