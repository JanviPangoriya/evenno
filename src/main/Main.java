/*
 *@author Janvi Pangoriya
 *Version 1.0
 * */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                c = c + 1;
        }
        if (c == 2)
            System.out.println(a + " is a prime number.");
        else
            System.out.println((a + " is not a prime number."));
    }
}