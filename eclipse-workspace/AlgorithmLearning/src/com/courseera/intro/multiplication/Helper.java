package com.courseera.intro.multiplication;

import java.util.Scanner;

public class Helper {
    int addCount;
    int multiplyCount;
    Scanner sc;

    public Helper() {
        sc = new Scanner(System.in);
    }

    protected String add(String a, String b ){
        addCount++;
        return  String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }

    protected String mul(String a, String b ){
        multiplyCount++;
        return  String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }

    protected String mod(String a, String b ){
        return  String.valueOf(Integer.parseInt(a) % Integer.parseInt(b));
    }

    protected String[] getInput(){

        String[] inputArray = new String[2];

        int n =0 ;
        while (true){
            if(n>=2)
                break;
            System.out.println("Please Enter " + (n+1) + " Number:" );
            String temp = sc.next();
            if(validateString(temp)){
                inputArray[n] = temp;
            }else{
                System.out.println("Please Enter Valid Number");
                continue;
            }
            n++;
        }
        return inputArray;
    }

    protected void showAnswer(String answer ){
        System.out.println("The Answer is : " + answer);
        System.out.println("two digit multiply count is : " + multiplyCount);
        multiplyCount = 0;
    }

    private boolean validateString( String s){
        return s.matches("[0-9]+");
    }

    public boolean askContinue() {
        System.out.println("Press Y to Continue: ");
        String reply = sc.next();
        if(reply.compareToIgnoreCase("Y") == 0){
            return true;
        }
        return false;
    }

    protected String reverseString(String s){
        String reverse = "";
        char[] strCharArray = s.toCharArray();
        for(int i = s.length()-1 ; i>=0 ; i--){
            reverse = reverse + strCharArray[i];
        }
        return reverse;
    }

    public void sayGoodbye() {
        System.out.println("Adios Amigo!!!!!!");
    }

    protected String div(String temp, String s) {
        return  String.valueOf(Integer.parseInt(temp) / Integer.parseInt(s));
    }
}
