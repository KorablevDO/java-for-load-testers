package com.acme.edu;

import com.acme.edu.calculator.DecoreteStringBulderLogger;
import com.acme.edu.calculator.LaunchreCalculator;
import com.acme.edu.calculator.StringBulderLogger;
import com.acme.edu.calculator.StubLogger;

public class TestCalculator {
    public static void main(String[] args) {
        LaunchreCalculator run1 = new LaunchreCalculator(new DecoreteStringBulderLogger(new StringBuilder("[Test]\n")));
        LaunchreCalculator run2 = new LaunchreCalculator(new StringBulderLogger());
        LaunchreCalculator run3 = new LaunchreCalculator(new StubLogger());
        String[] dataCase1 = {"add" ,"1", "1", "div", "8", "4"};
        String[] dataCase2 ={"1", "1", "sub", "9", "5", "add", "8", "8"};
        String[] dataCase3 ={"sub", "8", "3", "add", "2", "7"};
        run1.computing(dataCase1);
        run1.writeLog();
        System.out.println("----------------");
        run2.computing(dataCase2);
        run2.writeLog();
        System.out.println("----------------");
        run3.computing(dataCase3);
        run3.writeLog();
    }
}
