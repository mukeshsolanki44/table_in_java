package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number and print table");

        int tab = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            String str = tab + "x" + i + " = " + (i * tab);
            System.out.println(str);
        }


    }
}
