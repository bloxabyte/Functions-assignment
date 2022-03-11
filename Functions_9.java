package Varun;

import java.util.Scanner;

public class Functions_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial of : ");
        int n = in.nextInt();
        factorial(n);
    }
    static void factorial(int num){
        int fact = 1;
        for (int cnt=1;cnt<=num;cnt++){
            fact*=cnt;
        }//can use while loop also
        System.out.println("The factorial of "+num+" is = "+fact);
    }
}
