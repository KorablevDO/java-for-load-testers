package com.acme.edu;

/**
 * Created by do.korablev on 26.06.2017.
 */
public class Сalculator {
    private static double storedNumber = 0;
    private static double lastNumberObtained = 0;

    public static int summa(int a, int b) {
        lastNumberObtained = checkForRestrictions( a ) + checkForRestrictions( b );
        return (int)checkForRestrictions( lastNumberObtained );
    }

    public static int subtraction(int a, int b) {
        lastNumberObtained = checkForRestrictions( a ) - checkForRestrictions( b );
        return (int)checkForRestrictions( lastNumberObtained );
    }

    public static int multiplication(int a, int b) {
        lastNumberObtained = checkForRestrictions( a ) * checkForRestrictions( b );
        return (int)checkForRestrictions( lastNumberObtained );
    }

    public static int division(int a, int b) {
        lastNumberObtained = checkForRestrictions( a ) / checkForRestrictions( b );
        return (int)checkForRestrictions( lastNumberObtained );
    }

    public static double summa(double a, double b) {
        lastNumberObtained = checkForRestrictions( a ) + checkForRestrictions( b );
        return checkForRestrictions( lastNumberObtained );
    }

    public static double subtraction(double a, double b) {
        lastNumberObtained = checkForRestrictions( a ) - checkForRestrictions( b );
        return checkForRestrictions( lastNumberObtained );
    }

    public static double multiplication(double a, double b) {
        lastNumberObtained = checkForRestrictions( a ) * checkForRestrictions( b );
        return checkForRestrictions( lastNumberObtained );
    }

    public static double division(double a, double b) {
        lastNumberObtained = checkForRestrictions( a ) / checkForRestrictions( b );
        return checkForRestrictions( lastNumberObtained );
    }

    public static void setMemory(double a) {
        lastNumberObtained = checkForRestrictions( a );
    }

    public static void memory() {
        storedNumber = lastNumberObtained;
    }

    public static double getMemoryPlus() {
        return checkForRestrictions(storedNumber + lastNumberObtained);
    }


    public static double getMemoryMinus() {
        return checkForRestrictions(storedNumber - lastNumberObtained);
    }

    public static double getMemory(){
        return storedNumber;
    }

    private static double checkForRestrictions(double number){
        int limit = 10;

        if(number > limit){
            return limit;
        }else if(number < -limit){
            return -limit;
        }else {
            return number;
        }
    }

    public static double module(double number){
       return number * -1;
    }
}
