package com.company;

public class GreatestCommonDivisorMethod {
    public static void main(String[] args ){
        int gcd = gcd(6,100);
        System.out.print(gcd);
    }

    public static  int gcd(int num1,int num2)
    {
        int gcd = 1; // Initial GCD is 1
        int k = 2;  // Possible GCD

        while(k <= num1 && k <= num2)
        {
            if(num1 % k == 0 && num2 % k == 0){
                gcd = k; //update GCD
            }
            k++;
        }

        return gcd;
    }
}
