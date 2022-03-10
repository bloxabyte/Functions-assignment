package Varun;

import java.util.Scanner;

public class Functions_2 {
    //odd or even function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a whole number : ");
        int num = in.nextInt();
        String ans = EorO(num);
        System.out.println(num + " is an "+ans+" number.");
    }
    static String EorO(int number){
        if (number%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
}
