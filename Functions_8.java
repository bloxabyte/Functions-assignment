package Varun;

import java.util.Scanner;

public class Functions_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int num = in.nextInt();
        grades(num);
    }

    static void grades(int n) {
        Scanner in = new Scanner(System.in);
        int c = 1;
        while (c <= n) {
            System.out.print("Enter name of subject : ");
            String subject = in.next();
            System.out.print("Enter the marks in " + subject + " out of 100 : ");
            int mks = in.nextInt();
            if (mks <= 40) {
                System.out.println("Fail.");
            } else if ((mks <= 50) && (mks >= 41)) {
                System.out.println("Grade in "+subject+" is "+"DD");
            } else if ((mks >= 51 && (mks <= 60))) {
                System.out.println("Grade in "+subject+" is "+"CD");
            } else if ((mks >= 61) && (mks <= 70)) {
                System.out.println("Grade in "+subject+" is "+"BC");
            } else if ((71 <= mks) && (mks <= 80)) {
                System.out.println("Grade in "+subject+" is "+"BB");
            } else if ((81 <= mks) && (mks <= 90)) {
                System.out.println("Grade in "+subject+" is "+"AB");
            } else if ((91 <= mks) && (mks <= 100)) {
                System.out.println("Grade in "+subject+" is "+"AA");
            } else {
                System.out.println("Invalid marks entered.");
            }
            c++;
        }
        System.out.println("Program terminated.");
    }
}

