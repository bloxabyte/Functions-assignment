package Varun;

import java.util.Scanner;

public class Functions_3 {
    public static void main(String[] args) {
        //eligible to vote or not
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of people you are going to check for eligibility : ");
        int num  = in.nextInt();
        votingeligibilityCheck(num);
    }static void votingeligibilityCheck(int n){
        Scanner in = new Scanner(System.in);
        int cnt = 1;
        while (cnt<=n){
            System.out.print("Enter name of person : ");
            String name = in.next();
            System.out.print("Enter age of "+name+" : ");
            double age = in.nextDouble();
            if (age >= 18){
                System.out.println(name + " is eligible to vote.");
            }else{
                System.out.println(name+" is not eligible to vote.");
            }
            cnt++;
        }
    }
}
