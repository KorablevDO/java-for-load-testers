package com.acme.edu.calculator;

/**
 *
 */
public class StubLogger implements CalculatorLogger{
    public void writeLog(String... messages) {
        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i] + " ");
        }
    }

    public String[] getArrLog(){
        return new String[0];
    }
}
