package com.vamsi;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the STRING:");
        Scanner i = new Scanner(System.in);
        String y = "";
        String s = i.nextLine();
        int l = s.length();
        for(int k=l-1;k>=0;k--) {
            y=y + s.charAt(k);
        }
        if(s.equalsIgnoreCase(y))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
// The charAt() method returns the character at the specified index in a string
//The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences,returns true if the strings are equal, and false if not.
// Tip: Use the compareToIgnoreCase() method to compare two strings lexicographically, ignoring case differences.
// int l = s.length(); is the syntax used to find length of a string.