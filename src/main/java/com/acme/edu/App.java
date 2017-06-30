/*

 */
package com.acme.edu;

import com.acme.edu.Сalculator;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    calculator(args);
    }

    private static void calculator(String[] arr){
        String[] act = null;
        int step=0;
        int check =0;
        for (String message:arr){
            if(!checkString(message)){
                act = new String[3];
                act[0] = message;
            }else{
                step++;
                act[step] = message;
                check++;
            }

            if(check == 2){
                check = 0;
                step = 0;
                setAct(act);
            }
        }
    }

    private static boolean checkString(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }

    private static void setAct(String[] messages){
        for (String message:messages) {
            switch (message){
                case "add" : result(addition(messages[1], messages[2]));
                    break;
                case "sub" : result(subtraction(messages[1], messages[2]));
                    break;
                case "div" : result(division(messages[1], messages[2]));
                    break;
                default:
                    System.out.println("Команда " + message + " не распознана");
            }
        }
    }

    private static double addition(String messageFerst, String messageSecond){
        return Сalculator.addition(Double.parseDouble(messageFerst),Double.parseDouble(messageSecond));
    }

    private static double subtraction(String messageFerst, String messageSecond){
        return Сalculator.subtraction(Double.parseDouble(messageFerst),Double.parseDouble(messageSecond));
    }

    private static double division(String messageFerst, String messageSecond){
        return Сalculator.division(Double.parseDouble(messageFerst),Double.parseDouble(messageSecond));
    }

    private static void result(double number){
        System.out.println(number);
    }

}
