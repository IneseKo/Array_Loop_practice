package com.company;

import java.util.Scanner;

public class Assignment3 {
    private static Scanner inputGrade = new Scanner(System.in);

    public static void main(String[] args) {
        byte[] arrOne = new byte[3];
        arrFill(arrOne);
        arrPrint(arrOne);
        failedStudentCalculation(arrOne);
        smartStudentCalculation(arrOne);
        histogram(arrOne);
    }

    public static void arrFill(byte[] arrOne) {
        int i = 0;
        int sequenceNo = 1;
        byte grade = 0;
        while (sequenceNo <= arrOne.length) {
            System.out.println("Please enter grade No" + sequenceNo);

            if (inputGrade.hasNextShort() && grade >= 0 && grade <= 10) {
                grade = inputGrade.nextByte();
                arrOne[i] = grade;
                sequenceNo++;
                i++;
            } else {
                System.out.println("Wrong data. Please restart the program!");
                break;
            }
        }
    }

    public static void arrPrint(byte[] arrOne) {
        System.out.println("The grades You entered are as follows:");
        for (int i = 0; i < arrOne.length; i++) {
            System.out.println(arrOne[i]);
        }
    }

    public static void failedStudentCalculation(byte[] arrOne) {
        int count = 0;

        for (int grade : arrOne) {
            if (grade < 4) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " students that have failed.");
    }

    public static void smartStudentCalculation(byte[] arrOne) {
        int count = 0;

        for (int grade : arrOne) {
            if (grade == 10) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " students that have A grade.");
    }

    public static void histogram(byte[] arrOne) {
        int studentAmount = 0;
        int grade = 0;

        for (int i = 0; i < arrOne.length; i++) {
            for (int ignore : arrOne) {
                if (arrOne[i] == i) {
                    studentAmount++;
                                }
                System.out.println(studentAmount + " students with the grade " + grade);
                grade++;
            }
        }
    }

}
