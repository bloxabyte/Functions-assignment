package Functions_assignment_codes;

import java.util.Scanner;

public class Functions_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a =in.nextInt();
        System.out.print("Enter number 2 : ");
        int b = in.nextInt();
        givePrime(a,b);
    }static void givePrime(int num_1,int num_2){
        int n=Math.min(num_1,num_2);
        int N=Math.max(num_1,num_2);
        if ((Math.abs(num_2-num_1))==1){
            System.out.println("No prime number exists between "+n+" and "+N+".");
        }else if ((n<0)||(N<0)){
            System.out.println("One or both of the numbers you have entered are invalid as one or both of them aare less than zero.");
        }else if (n==1){
            int __cnt__=0;
            for(int a=n+1;a<N;a++){
                int cnt=0;
                int temp=2;
                while (temp<a){
                    if (a%temp==0){
                        temp++;
                        cnt++;
                        break;
                    }else{
                        temp++;
                    }
                }if (cnt==0){
                    System.out.print(a+" ");
                    __cnt__++;
                }
            }if (__cnt__==0){
                System.out.println("There is no prime number between "+n+" and "+N);
            }
        }else{
            int __cnt__=0;
            for(int a=n+1;a<N;a++){
                int cnt=0;
                int temp=2;
                while (temp<a){
                    if (a%temp==0){
                        temp++;
                        cnt++;
                        break;
                    }else{
                        temp++;
                    }
                }if (cnt==0){
                    System.out.print(a+" ");
                    __cnt__++;
                }
    }if (__cnt__==0){
                System.out.println("There is no prime number between "+n+" "+N);
            }
}}}

