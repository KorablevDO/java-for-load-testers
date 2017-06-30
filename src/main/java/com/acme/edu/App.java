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
    getLog();
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
        try{
            Double.parseDouble(string);
            return true;
        }catch (Exception e)
        {
            return  false;
        }
    }

    private static void setAct(String[] messages){
        if(messages != null) {
            String strLog;
            for (String message : messages) {
                switch (message) {
                    case "add":
                        strLog = result(addition(messages[1], messages[2]));
                        log(message,messages[1],messages[2],strLog);
                        break;
                    case "sub":
                        strLog = result(subtraction(messages[1], messages[2]));
                        log(message,messages[1],messages[2],strLog);
                        break;
                    case "div":
                        strLog = result(division(messages[1], messages[2]));
                        log(message,messages[1],messages[2],strLog);
                        break;
                }
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

    private static String result(double number){
        System.out.println(number);
        return Double.toString(number);
    }

    private static String[] arrLog = new String[0];

    private static void log(String command, String messageFerst,String messageSecond, String result){
        int length = arrLog.length;
        String[] temporaryArrLog = addArr(new String[length+1]);
        temporaryArrLog[temporaryArrLog.length -1]= messageFerst + " " + command + " " + messageSecond + " = " + result;
        arrLog = temporaryArrLog;
    }

    private static String[] addArr(String[] arr){
        for(int i = 0; i < (arr.length -1);i++){
            arr[i]=arrLog[i];
        }
        return arr;
    }

    private static void getLog(){
        for (String message:arrLog) {
            System.out.println(message);
        }
    }
}
