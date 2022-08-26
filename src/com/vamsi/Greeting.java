package com.vamsi;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter Name");
        Scanner i = new Scanner(System.in);
        String v = i.next();
        System.out.println("Hi " +v +" how are you!");

    }

}
