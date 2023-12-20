package com.gradle.findfactorial;

public class FindFactorial {


    private final int number;

    public FindFactorial(int number){
        this.number=number;
    }
    public int findFactorilOfANumber(){

        int factorial=1;
        if(number<0)
            factorial=-1;
        if(number==0)
            factorial=1;
        if(number==1)
            factorial=1;
        for(int range_number=2;range_number<=number;range_number++){
            factorial*=range_number;
        }
        return factorial;

    }

    public static void main(String[] arg){

    }

}
