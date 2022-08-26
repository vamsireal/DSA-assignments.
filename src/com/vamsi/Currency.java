package com.vamsi;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        System.out.println("Enter currency in rupees:");
        Scanner i = new Scanner(System.in);
        float R = i.nextFloat();
        double USD = R*0.013;
        System.out.println("Currency in USD is:"+USD);
    }
}
