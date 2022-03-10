package Varun;

import java.util.Scanner;

public class Functions_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        double num_1 = in.nextDouble();
        System.out.print("Enter number 2 : ");
        double num_2 = in.nextDouble();
        double ans = product(num_1,num_2);
        System.out.println("Product of "+num_1+" and "+num_2+" is "+ans);
    }static double product(double a,double b){
        return (a*b);
    }
}
