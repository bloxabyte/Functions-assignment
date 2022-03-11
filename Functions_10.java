package Varun;

import java.util.Scanner;

public class Functions_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        boolean ans=isPalindromenum(n);
        System.out.println("The statement that "+n+" is a palindrome number is "+ans);
    }static boolean isPalindromenum(int num){
        int rev,temp;
        rev=0;
        temp=num;
        while (num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=(int)num/10;  //  a single '/' would work as num has been declared as an integer type in the function definition.
        }
        if(temp==rev){
            return true;
        }else {
            return false;
        }
    }
}
