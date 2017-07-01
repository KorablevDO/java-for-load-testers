package com.acme.edu.calculator;

/**
 *
 */
public class OperationLog {
    private StringBuilder bulder = new StringBuilder();

    public void writeLog(String... messages) {
        for (int i = 0; i < messages.length; i++) {
            bulder.append(messages[i] + " ");
        }
    }

    public String[] getArrLog(){
        return bulder.toString().split("\n");
    }
}
