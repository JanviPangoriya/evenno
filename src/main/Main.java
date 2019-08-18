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
        int b = obj.nextInt();
        for (int i = a + 1; i <= b - 1; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        }
}