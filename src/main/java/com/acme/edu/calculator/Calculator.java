package com.acme.edu.calculator;

/**
 *
 */
public class Calculator {
    private double storedNumber = 0;
    private double lastNumberObtained = 0;

    public int addition(int firstNumber, int secondNumber) {
        return (int) addition((double) firstNumber, (double) secondNumber);
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return (int) subtraction((double) firstNumber, (double) secondNumber);
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return (int) multiplication((double) firstNumber, (double) secondNumber);
    }

    public int division(int firstNumber, int secondNumber) {
        return (int) division((double) firstNumber, (double) secondNumber);
    }

    public double addition(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) + (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public double subtraction(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) - (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public double multiplication(double firstNumber, double secondNumber) {
        lastNumberObtained = (firstNumber) * (secondNumber);
        return checkForRestrictions(lastNumberObtained);
    }

    public double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            lastNumberObtained = (firstNumber) / (secondNumber);
        } else {
            lastNumberObtained = 0;
            System.out.println("На 0 делить нелльзя");
        }
        return checkForRestrictions(lastNumberObtained);
    }

    public void setInMemory(double number) {
        lastNumberObtained = checkForRestrictions(number);
    }

    public void saveInMemory() {
        storedNumber = lastNumberObtained;
    }

    public double getAmountMemoryAndLastOperation() {
        return checkForRestrictions(storedNumber + lastNumberObtained);
    }

    public double getDifferenceMemoryAndOperation() {
        return checkForRestrictions(storedNumber - lastNumberObtained);
    }

    public double getStoredMemory() {
        return storedNumber;
    }

    private double checkForRestrictions(double number) {
        int limit = 10;

        if (number > limit) {
            return (limit);
        } else if (number < -limit) {
            return (-limit);
        } else {
            return (number);
        }
    }

    public double moduleNumber(double number) {
        return number * -1;
    }
}
