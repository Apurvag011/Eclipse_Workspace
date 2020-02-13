package com.algo.sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInteraction {

    public ArrayList<Integer> getUniqueRandomArray(){
        int sampleSize = getSizeOfArray();
        ArrayList<Integer> arrayToReturn = new ArrayList<>();
        for(int i=0 ; i<sampleSize ;i++){
            arrayToReturn.add(getUniqueRandomInteger(arrayToReturn,sampleSize));
        }
        printArraylist(arrayToReturn);
        //for()
        return arrayToReturn;
    }

    private void printArraylist(ArrayList<Integer> arrayToReturn) {
        for(int i =0 ; i< arrayToReturn.size() ; i ++){
            if(i ==0 ){
                System.out.print("[" + arrayToReturn.get(i) + ",");
            }else if(i == arrayToReturn.size()-1){
                System.out.print(arrayToReturn.get(i) + "]");
            }else{
                System.out.print(arrayToReturn.get(i) + ",");
            }
        }
    }

    private Integer getSizeOfArray(){
        System.out.println("Please Enter the size of the array:" );
        Scanner s = new Scanner(System.in);
        String input = s.next();
        Integer n ;
        try{
            n = Integer.parseInt(input);
        }catch(NumberFormatException e ){
            System.out.println("Can not enter str");
            return getSizeOfArray();
        }
        if(n <= 0){
            System.out.println("Can not enter negative or zero size");
            return getSizeOfArray();
        }else{
            return n;
        }
    }
    private int getUniqueRandomInteger(ArrayList<Integer> intArray, int sampleSize){
        int numberToAdd;
        Random r = new Random();
        if(sampleSize <10) {
            numberToAdd = r.nextInt(9);
        }else{
            numberToAdd = r.nextInt(sampleSize-1);
        }
        if(intArray.contains(numberToAdd)){
            return getUniqueRandomInteger(intArray, sampleSize);
        }
       return numberToAdd;
    }

}
