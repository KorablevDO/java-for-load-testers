/*

 */
package com.acme.edu;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        computing(args);
        getLog();
    }

    private static void computing(String[] condition) {
        String[] exression = null;
        int variableNumber = 0;
        int stepNumber = 0;
        int allStepNumber = 3;
        for (String operator : condition) {
            if (!checkForNumber(operator)) {
                exression = new String[allStepNumber];
                exression[0] = operator;
                stepNumber++;
            } else if (stepNumber < 1) {
                String message = "Проверьте входные данные" + ";\n";
                System.out.println(message);
                writeLog(message);
            } else {
                variableNumber++;
                exression[variableNumber] = operator;
                stepNumber++;
            }

            if (stepNumber == allStepNumber) {
                stepNumber = 0;
                variableNumber = 0;
                weCalculate(exression);
            }
        }
    }

    private static boolean checkForNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void weCalculate(String[] exression) {
        if (exression != null) {
            String result;
            String operator = exression[0];
            String messageFerst = exression[1];
            String messageSecond = exression[2];
            switch (operator) {
                case "add":
                    result = getValue(concoct(messageFerst, messageSecond));
                    writeLog(messageFerst, operator, messageSecond, "= " + result + ";\n");
                    return;
                case "sub":
                    result = getValue(subtract(messageFerst, messageSecond));
                    writeLog(messageFerst, operator, messageSecond, "= " + result + ";\n");
                    return;
                case "div":
                    result = getValue(strip(messageFerst, messageSecond));
                    writeLog(messageFerst, operator, messageSecond, "= " + result + ";\n");
                    return;
            }

        }
    }

    private static double concoct(String messageFerst, String messageSecond) {
        return Сalculator.addition(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private static double subtract(String messageFerst, String messageSecond) {
        return Сalculator.subtraction(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private static double strip(String messageFerst, String messageSecond) {
        return Сalculator.division(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private static String getValue(double number) {
        System.out.println(number);
        return Double.toString(number);
    }

    private static String stringLog = "";

    private static void writeLog(String... messages) {
        StringBuilder bulder = new StringBuilder();
        for (int i = 0; i < messages.length; i++) {
            bulder.append(messages[i] + " ");
        }
        stringLog += bulder.toString();
    }

    private static void getLog() {
        System.out.println(stringLog);
    }
}
