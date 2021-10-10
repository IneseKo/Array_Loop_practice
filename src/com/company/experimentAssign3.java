package com.company;

import java.util.Scanner;

public class experimentAssign3 {
    public static void main(String[] args) {
        byte[] arrOne = new byte[3];
        int i = 0;
        int sequenceNo = 1;

        while (sequenceNo <= arrOne.length) {
            Scanner inputGrade = new Scanner(System.in);
            System.out.println("Please enter grade No" + sequenceNo);
            byte grade = inputGrade.nextByte();

            if (grade > 0 && grade <= 10) {
                arrOne[i++] = grade;
                sequenceNo++;
            } else {
                System.out.println("Wrong data");
            }
        }


        System.out.println("The grades You entered are as follows:");
        for (int k = 0; k < arrOne.length; k++) {
            System.out.println(arrOne[k]);
        }
    }
    }


