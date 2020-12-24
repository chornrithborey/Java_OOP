package com.company;

public class Factorial {
    public static void main(String[] args)
    {
        System.out.println("Factorial of 5 is : " + factorial(5));
    }
    static int factorial(int n) {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if(n > 1)
        {
            return (n * factorial(n - 1));
        }
        else
            throw  new IllegalArgumentException("Don't talk about it here ! ");
    }
}
