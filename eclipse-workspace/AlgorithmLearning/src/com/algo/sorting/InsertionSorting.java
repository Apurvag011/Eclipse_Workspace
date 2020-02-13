package com.algo.sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InsertionSorting implements SortingAlgorithm {


    public static void main(String[] args) {


        UserInteraction ui = new UserInteraction();
        ui.getUniqueRandomArray();

        //ArrayList<Integer> sampleList = generateNewList();
        //if(sampleList != null){

        }
                /*new ArrayList<>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number of Elements in a sample");
        int sampleSize;
        try{
            sampleSize = Integer.parseInt(myObj.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Can not parse the Sample number");
            return;
        }
        Random r = new Random();

        for(int i=0 ; i<sampleSize ;i++){
            int numberToAdd;
            if(sampleSize <10) {
                numberToAdd = r.nextInt(9);
            }else{
                numberToAdd = r.nextInt(sampleSize-1);
            }
            if(sampleList.contains(numberToAdd)){

            }

        }*/

    //}

    private static ArrayList<Integer> generateNewList() {
        ArrayList<Integer> randomList = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Number of Elements in a sample");
        int sampleSize;
        try{
            sampleSize = Integer.parseInt(myObj.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Can not parse the Sample number");
            return null;
        }
        Random r = new Random();

        for(int i=0 ; i<sampleSize ;i++){
            int numberToAdd;
            if(sampleSize <10) {
                numberToAdd = r.nextInt(9);
            }else{
                numberToAdd = r.nextInt(sampleSize-1);
            }
            if(randomList.contains(numberToAdd)){

            }

        }




        return randomList;
    }

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> array) {
        return null;
    }
}
