package com.courseera.intro.multiplication;

public class SimpleMultiplication  implements  Multiplication{

    @Override
    public String multiply(String[] inputNumbers , Helper helper) {
        String answer = "0";

        //Finding out which Number has least digits and putting this number second;
        char[] firstNumberArray = ( inputNumbers[0].length() >= inputNumbers[1].length() ) ? inputNumbers[0].toCharArray() : inputNumbers[1].toCharArray();
        char[] secondNumberArray = ( inputNumbers[0].length() >= inputNumbers[1].length() ) ? inputNumbers[1].toCharArray() : inputNumbers[0].toCharArray();

        int n = secondNumberArray.length;

        //3rd grade Multiplication
        String temp;
        String[] resultsArray = new String[secondNumberArray.length];
        //Initialize first array
        for (int i = 0 ; i< resultsArray.length ; i++){
            resultsArray[i] = "";
        }
        for(int i=0 ; i < secondNumberArray.length ; i++){
            String buffer = "0";
            for(int j = firstNumberArray.length -1 ; j>=0 ; j --){
                temp = helper.add( helper.mul( String.valueOf(secondNumberArray[i]), String.valueOf(firstNumberArray[j])), buffer );
                resultsArray[i] += helper.mod(temp , "10" );
                buffer = helper.div(temp, "10");
            }
            resultsArray[i] += buffer;
            resultsArray[i] = helper.reverseString(resultsArray[i]);
            for (int k =0 ; k < secondNumberArray.length - i ; k++){
                resultsArray[i] += "0";
            }
        }

        //Calculating answer
        for (int i=0 ; i< resultsArray.length ; i++){
            answer = helper.add(answer, resultsArray[i]);
        }

        return answer;
    }
}
