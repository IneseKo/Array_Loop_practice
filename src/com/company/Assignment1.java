package com.company;

public class Assignment1 {
    public static void main(String[] args) {
        int[] arrOne = {5, 3, 7, 6, 2, 8};
        forLoop(arrOne);
        forEachLoop(arrOne);
        whileLoop(arrOne);
        doWhileLoop(arrOne);
    }

    public static void forLoop(int[] arrOne) {

        for (int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
        }
    }

    public static void forEachLoop(int[] arrOne) {
        for (int value : arrOne) {
            System.out.println(value);
        }
    }

    public static void whileLoop(int[] arrOne) {
        int i = 0;
        while (i < arrOne.length) {
            System.out.println(arrOne[i]);
            i++;
        }
    }
    public static void doWhileLoop(int[] arrOne){
        int i=0;
        do{
            System.out.println(arrOne[i]);
            i++;
        }while(i < arrOne.length);
    }
}
