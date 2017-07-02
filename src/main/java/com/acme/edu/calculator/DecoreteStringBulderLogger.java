package com.acme.edu.calculator;

public class DecoreteStringBulderLogger extends StringBulderLogger {
    public DecoreteStringBulderLogger() {
        super();
    }

    public DecoreteStringBulderLogger(StringBuilder bulder) {
        super(bulder);
    }

    @Override
    public void writeLog(String... messages) {
        for(int i = 0; i<messages.length; i++){
            messages[i] = "[Decor] "+messages[i];
        }
        super.writeLog(messages);
    }
}
