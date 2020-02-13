package com.courseera.intro.multiplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainClass {


    public static void main(String[] args){
        System.out.println("Welcome to Multiplication Program");
        double f = 0.112345d ;
        BigDecimal decimal;
        decimal = new BigDecimal(0.3333333);


        decimal  = decimal.multiply(new BigDecimal(3)).setScale(3, RoundingMode.FLOOR);
        System.out.println("The value is :" + decimal.toString());
        while(true) {
            Helper helper = new Helper();
            String[] inputArray = helper.getInput();
            Multiplication mAlgo = new SimpleMultiplication();
            helper.showAnswer(mAlgo.multiply(inputArray, helper));
            if(helper.askContinue()) {
                continue;
            }
            else{
                helper.sayGoodbye();
                break;
            }
        }

    }
}
