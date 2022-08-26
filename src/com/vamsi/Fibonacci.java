package com.vamsi;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n value:");
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        int c=0;
        int s=0;
        int s1=0;
        int s2=1;
        while(c<n){
            System.out.println(s);
            s=s1+s2;
            s1=s2;
            s2=s;
            c++;
        }
    }
}
