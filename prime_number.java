package com.company;

public class prime_number {
    public static  void main(String[] args) {
        boolean p = isPrime(7);

        System.out.println(p);

        printPrimeNum(50);

    }

    public static  boolean isPrime(int num)
    {
        for(int div = 2; div <= num / 2; div++)
        {
            if(num % div == 0)
                return false;
        }
        return true; // Number is prime
    }

    public static void printPrimeNum(int number_of_prime)
    {
        final int NUMBER_of_PRIME_PER_LINE = 10;

        int count =0; //count prime num
        int num = 2; // a number to be tested for primeness

        //Repeatedly find prime num

        while(count < number_of_prime)
        {
            //print the prime num and increase the count
            if(isPrime(num))
            {
                count++;  //increase count
            }
            if(count % NUMBER_of_PRIME_PER_LINE == 0)
            {
                System.out.printf("%-5d%n",num);
            }else{
                System.out.printf("%-5d%n",num);
            }
            //check whether the next number is prime or not
            num++;
        }
    }
}
