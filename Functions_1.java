package Varun;

import java.util.Scanner;

public class Functions_1 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        a=in.nextDouble();
        System.out.print("Enter number 2 : ");
        b=in.nextDouble();
        System.out.print("Enter number 3 : ");
        c=in.nextDouble();
        max(a,b,c);
        min(a,b,c);
    }static void max(double num_1,double num_2,double num_3){
        if ((num_1>num_2) & (num_1>num_3)){
            System.out.println(num_1+" is the greatest number.");
        }else if ((num_2>num_3)&(num_2>num_1)){
            System.out.println(num_2+" is the greatest number.");
        }else{
            System.out.println(num_3+" is the greatest number.");
        }
    }static void min(double num_1,double num_2,double num_3){
        if ((num_1<num_2) & (num_1<num_3)){
            System.out.println(num_1+" is the least number.");
        }else if ((num_2<num_3)&(num_2<num_1)){
            System.out.println(num_2+" is the least number.");
        }else{
            System.out.println(num_3+" is the least number.");
        }
    }
}
