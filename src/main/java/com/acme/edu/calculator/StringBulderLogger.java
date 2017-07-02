package com.acme.edu.calculator;

public class StringBulderLogger implements CalculatorLogger {
    private StringBuilder bulder;

    public StringBulderLogger(){
        bulder = new StringBuilder();
    }

    public StringBulderLogger(StringBuilder bulder){
        this.bulder = bulder;
    }

    public void writeLog(String... messages) {
        for (int i = 0; i < messages.length; i++) {
            bulder.append(messages[i] + " ");
        }
    }

    public String[] getArrLog(){
        return bulder.toString().split("\n");
    }
}
