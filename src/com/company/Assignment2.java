package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arrOne = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negativeElements(arrOne);
        System.out.println();
        oddElements(arrOne);
        System.out.println();
        countOddElements(arrOne);
        System.out.println();
        sameValue(arrOne);

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
            if (value % 2 != 1) {
                System.out.println(value);

            }
        }

    }

    public static void countOddElements(int[] arrOne) {
             int sum = 0;
        for (int value : arrOne) {
            if (value % 2 != 1) {
                               sum = sum+1;
                System.out.println(sum);      }
        }
}

public static void sameValue(int[] arrOne) {
        int i = 0;
    for (int value : arrOne) {
        if (value == arrOne[i]) {
            System.out.println(value + "=" + i);
            i++;
            continue;
        }
        System.out.println("There are no elements with the same value");
    }

        }
    }
