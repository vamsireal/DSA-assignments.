package com.vamsi;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the numbers:");
        Scanner i = new Scanner(System.in);
        int n1 = i.nextInt();
        int n2 = i.nextInt();
        for (int j=n1+1;j<n2;++j) {
            int t1 = j;
            int d=0;
            int s=0;
            int r;
            while(t1!=0){
                t1/=10;
                ++d;
            }
            t1=j;
            while (t1!=0) {
                r = t1 % 10;
                s += Math.pow(r, d);
                t1 /= 10;
            }
            if (s == j) {
                System.out.println(j+" is Armstrong");
            }

        }
    }
}
// Got different result bcoz of misplacing brackets to while loop at 19.
//  s += Math.pow(r, d) , it is syntax for doing exponential calculations.