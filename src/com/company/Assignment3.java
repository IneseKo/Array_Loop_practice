package com.company;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        byte[] arrOne = new byte[10];
        int i = 0;
        int sequenceNo = 1;
        for (byte grade : arrOne) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Please enter grade No" + sequenceNo++);

            grade = inputGrade.nextByte();
            if (grade >= 0 && grade <= 10) {
                arrOne[i] = inputGrade.nextByte();
                i++;
            }
        }
    }
}
