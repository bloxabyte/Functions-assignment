package Functions_assignment_codes;

import java.util.Scanner;

public class Functions_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 'n' : ");
        int n = in.nextInt();
        int ans=sum_first_N(n);
        System.out.println("The sum of first "+n+" natural numbers = "+ans);
    }static int sum_first_N(int num){
        int sum = (((num)*(num+1))/2);
        return sum;
    }
}
