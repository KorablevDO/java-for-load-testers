package com.acme.edu.calculator;

/**
 *
 */
public interface CalculatorLogger {
    public void writeLog(String... messages);
    public String[] getArrLog();
}
