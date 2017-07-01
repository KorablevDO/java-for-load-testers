package com.acme.edu.calculator;

/**
 *
 */
public class LaunchreCalculator {
    private CalculatorLogger log;

    public LaunchreCalculator(CalculatorLogger typeLogger){
        log = typeLogger;
    }

    public LaunchreCalculator(){
        log = new StringBulderLogger();
    }

    public void computing(String[] condition) {
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
                String message = "Проверьте входные данные" + "\n";
                System.out.println(message);
                log.writeLog(message);
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

    private boolean checkForNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void weCalculate(String[] exression) {
        if (exression != null) {
            String result;
            String operator = exression[0];
            String messageFerst = exression[1];
            String messageSecond = exression[2];
            Calculator calculator = new Calculator();
            switch (operator) {
                case "add":
                    result = getValue(concoct(messageFerst, messageSecond, calculator));
                    log.writeLog(messageFerst, operator, messageSecond, "= " + result + "\n");
                    return;
                case "sub":
                    result = getValue(subtract(messageFerst, messageSecond, calculator));
                    log.writeLog(messageFerst, operator, messageSecond, "= " + result + "\n");
                    return;
                case "div":
                    result = getValue(strip(messageFerst, messageSecond, calculator));
                    log.writeLog(messageFerst, operator, messageSecond, "= " + result + "\n");
                    return;
            }
        }
    }

    private double concoct(String messageFerst, String messageSecond, Calculator calculator) {
        return calculator.addition(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private double subtract(String messageFerst, String messageSecond, Calculator calculator) {
        return calculator.subtraction(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private double strip(String messageFerst, String messageSecond, Calculator calculator) {
        return calculator.division(Double.parseDouble(messageFerst), Double.parseDouble(messageSecond));
    }

    private String getValue(double number) {
        System.out.println(number);
        return Double.toString(number);
    }

    public void writeLog() {
        for (String message:log.getArrLog()) {
            System.out.println(message);
        }
    }
}
