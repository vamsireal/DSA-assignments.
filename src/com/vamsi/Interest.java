package com.vamsi;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        System.out.println("Enter PTR:");
        Scanner i = new Scanner(System.in);
        int T = i.nextInt();
        int P = i.nextInt();
        float R = i.nextFloat();
        float interest = P*T*R/100;
        System.out.println("The interest is:"+interest);

    }
}
