package Varun;

import java.util.Scanner;

public class Functions_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number : ");
        int n = in.nextInt();
        isPrime(n);
    }
    static void isPrime(int num) {
        int c = 2;
        int cnt = 1;
        if (num<1){
            System.out.println(num+" is neither prime nor composite.");
        }
        while (c * c <= num) {
            if (num % c == 0) {
                System.out.println(num + " is not a prime number.");
                cnt++;
            }
            c++;
        }
        if (cnt == 1) {
            System.out.println(num + " is a prime number.");
        }
    }
}