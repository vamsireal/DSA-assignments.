package com.vamsi;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Enter a,b:");
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        float r1 = a+b;
        float r2 = a-b;
        float r3= a*b;
        float r4 = (a/b);
        System.out.print(r1 +" "+ r2 +" "+" "+ r3+" " + r4) ;

    }
}
// In this program the r4 will not give the decimal form without rounding off unless we give one of its inputs float.
// the rounding off here gives the preceding value as 1 from 1.8.