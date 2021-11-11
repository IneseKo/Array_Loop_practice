package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arrOne = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        negativeElements(arrOne);
        oddElements(arrOne);
        countOddElements(arrOne);
        sameValue(arrOne);
        eachSecondElement(arrOne);
        averageValuePrint(arrOne);
        smallerThanAverage(arrOne);
    }

    public static void negativeElements(int[] arrOne) {
        int i = 0;
        System.out.println("These are the negative elements of the Array:");
        for (int value : arrOne) {
            if (value < 0) {
                System.out.println(value);
                continue;
            }
        }
    }

    public static void oddElements(int[] arrOne) {
        int i = 0;
        System.out.println("\nThese are the odd elements of the Array:");
        for (int value : arrOne) {
            if (value % 2 != 1) {
                System.out.println(value);

            }
        }

    }

    public static void countOddElements(int[] arrOne) {
        int count = 0;
        for (int value : arrOne) {
            if (value % 2 != 1) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " odd Elements in this Array.");
    }
//
    public static void sameValue(int[] arrOne) {
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = i + 1; j < arrOne.length; j++) {
                if (arrOne[i] == arrOne[j]) {
                    System.out.println("\nElement No" + i + " equals Element No" + j + ". Their value is " + arrOne[i] + ".");

                }
            }
        }
    }

    public static void eachSecondElement(int[] arrOne) {
        System.out.println("\nEvery other Element in this Array is following:");
        for (int i = 0; i < arrOne.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arrOne[i]);
                i++;
            }
        }
    }

    public static double averageValue(int[] arrOne) {
        double sum = 0;
        for (int i = 0; i < arrOne.length; i++) {
            sum = sum + arrOne[i];
        }
        double averageValue = sum / arrOne.length;
        return averageValue;
    }

    public static void averageValuePrint(int[] arrOne) {
        System.out.println("\nThe average value of the array is " + averageValue(arrOne));
    }

    public static void smallerThanAverage(int[] arrOne) {
        int count = 0;
        for (int i = 0; i < arrOne.length; i++) {
            if (averageValue(arrOne) > arrOne[i]) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " elements in the Array that are smaller than the average value" + " (" + averageValue(arrOne) + ").");
    }
}
