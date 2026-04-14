package com.example;

import java.util.Scanner;

public class lab1 {

    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return n + " là số chẵn";
        } else {
            return n + " là số lẻ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            System.out.println(checkEvenOdd(x));
        }

        sc.close();
    }
}