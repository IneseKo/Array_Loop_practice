package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arrOne = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negativeElements(arrOne);
        System.out.println();
        oddElements(arrOne);
        System.out.println();
        countOddElements(arrOne);

    }

    public static void negativeElements(int[] arrOne) {
        int i = 0;
        for (int value : arrOne) {
            if (value < 0) {
                System.out.println(value);
                continue;
            }
        }
    }

    public static void oddElements(int[] arrOne) {
        int i = 0;
        for (int value : arrOne) {
            if (value % 2 == 0) {
                System.out.println(value);
                continue;
            }
        }

    }
    public static void countOddElements(int[] arrOne) {
        int i=0;
        int sum=0;
        for (int value: arrOne) {
            if (value % 2 == 0) {
                sum = sum+1;
                continue;
                System.out.println(sum);
            }
        }
    }
}
