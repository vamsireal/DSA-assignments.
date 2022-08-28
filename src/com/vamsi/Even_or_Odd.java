package com.vamsi;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        if(a%2==0) {
            System.out.println("even");
            }
        else {
            System.out.println("odd");
        }
    }
}
