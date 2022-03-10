package Varun;

import java.util.Scanner;

public class Functions_6 {
    public static void main(String[] args) {
        //Circumference and area in a single function
        System.out.print("Enter the radius of the circle : ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        circumarea(r);
    }
    static void circumarea(double radius){
        System.out.println("The circumference of the circle = "+(2*Math.PI*radius)+" units.");
        System.out.println("The area of the circle = "+(Math.PI*Math.pow(radius,2))+" square units.");
    }
}
