package com.company;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
String[] arrayOne = {"2","8","9","4","5"};
        System.out.println(arrayOne[0]);
        System.out.println(Arrays.toString(arrayOne));
        arrayOne[1] = "0";
        for(int i=0; i<arrayOne.length; i=i+2){
                       System.out.println(arrayOne[i]="1");
        }

    }
}
