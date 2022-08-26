package com.vamsi;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter a,b:");
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = i.nextInt();
        if (a==b){
            System.out.println("Both are equal");
        }
        else{
            if (a>b){
                System.out.println("A is larger");
            }
            else {
                System.out.println("B is larger");
            }
        }
    }
}
