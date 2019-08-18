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
        int r, s = 0;
        while (a != 0) {
            r = a % 10;
            s = s + r;
            a = a / 10;
        }
        System.out.println(s);

    }
}