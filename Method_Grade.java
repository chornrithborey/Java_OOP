package com.company;

public class Method_Grade {
    public static  void main(String[] args){
        System.out.printf("Your Grade is : ");
        printGrade(80);
    }

    public static void printGrade(double score)
    {
        if(score < 0 || score > 100){
            System.out.println("Invalid Score ! ");
            return;
        }

        if(score >= 90)
            System.out.print("A");
        else
        if(score >= 80)
            System.out.print("B");
        else
        if(score >= 70)
            System.out.print("C");
        else
        if(score >= 60)
            System.out.print("D");
        else
            System.out.print("E");

    }


}
