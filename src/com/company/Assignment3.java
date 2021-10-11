package com.company;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        byte[] arrOne = new byte[10];
        arrFill(arrOne);
        arrPrint(arrOne);
        failedStudentCalculation(arrOne);
        smartStudentCalculation(arrOne);
        histogram(arrOne);
    }

    public static void arrFill(byte[] arrOne) {
        int i = 0;
        int sequenceNo = 1;

        while (sequenceNo <= arrOne.length) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Please enter grade No" + sequenceNo);
            byte grade = inputGrade.nextByte();

            if (grade >= 0 && grade <= 10) {
                arrOne[i++] = grade;
                sequenceNo++;

            } else {
                System.out.println("Wrong data");
            }
        }
    }

    public static void arrPrint(byte[] arrOne) {
        System.out.println("The grades You entered are as follows:");
        for (byte grade : arrOne) {
            System.out.println(grade);
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
        System.out.println("\nThere are " + count + " students that have A grade.\n");
    }

    public static void histogram(byte[] arrOne) {

        int gradePr = 0;

        while (gradePr <= 10) {
            int studentAmount = 0;
            for (int grade : arrOne) {
                if (grade == gradePr) {

                    studentAmount++;
                }

            }
            System.out.println(studentAmount + " students with the grade " + gradePr);
            gradePr++;
        }
    }

}
