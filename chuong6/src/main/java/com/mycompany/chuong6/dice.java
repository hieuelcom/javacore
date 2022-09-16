package com.mycompany.chuong6;

import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {

        System.out.print("Enter the number of dice (>0): ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while (num <= 0) {
            System.out.println("The number of dice can't" +
                    " be 0 or -ve.");
            System.out.print("Enter number of dice: ");
            num = scan.nextInt();
        }

        Random rand = new Random();
        do {
            System.out.println("The values on dice are: ");
            for (int i = 0; i < num; i++) {
                System.out.println(rand.nextInt(6) + 1);
            }
            System.out.print("Do you want to roll the" +
                    " dice again? true/false: ");
        } while (scan.nextBoolean() == true);
        scan.close();
    }
}
