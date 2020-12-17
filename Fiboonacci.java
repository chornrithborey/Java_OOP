package com.company;

public class Fiboonacci {
    public  static  void main(String[] args)
    {
            System.out.println(fiboonacci(8));
    }

    static int fiboonacci(int term)
    {
        if(term < 0)
        {
            throw  new IllegalArgumentException("Term must be greater than 0 ");
        }
        if(term == 1 || term == 0)
        {
            return term;
        }
        return fiboonacci(term - 1) + fiboonacci(term - 2);
    }
}
