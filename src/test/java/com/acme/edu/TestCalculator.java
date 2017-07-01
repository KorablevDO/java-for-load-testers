package com.acme.edu;

import com.acme.edu.calculator.Calculator;
import com.acme.edu.calculator.LaunchreCalculator;
import com.acme.edu.calculator.StubLogger;

/**
 * Tests
 */

public class TestCalculator {
    public static void main(String[] args) {
        LaunchreCalculator run1 = new LaunchreCalculator(new StubLogger());
        LaunchreCalculator run2 = new LaunchreCalculator();
        String[] dataCase1 = {"add" ,"1", "1", "div", "8", "4"};
        String[] dataCase2 ={"1", "1", "sub", "9", "5", "add", "8", "8"};
        run1.computing(dataCase1);
        run1.writeLog();
        System.out.println("----------------");
        run2.computing(dataCase2);
        run2.writeLog();
    }
}
