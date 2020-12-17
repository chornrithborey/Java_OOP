package com.company;

public class OverloadingMax {
    public static  void main(String[] args)
    {
        int max = max(7,9);
        System.out.println(max);

        double maxDB = max(9.9,4.9);
        System.out.println(maxDB);

        double maxDB2 = max(9.3,8.7,7.5);
        System.out.println(maxDB2);

    }

    public static int max(int num1, int num2)
    {
        int result;

        if(num1 > num2) {
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }
    public static double max(double num1, double num2)
    {
        double  result;

        if(num1 > num2) {
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }
    public static double max(double num1, double num2, double num3)
    {
        double result = 0;

        if(num1 > num2 && num1 > num3) {
            result = num1;
        }else if(num2 > num1 && num2 > num3){
            result = num2;
        }else if(num3 > num1 && num3 > num2){
            result = num3;
        }

        return result;
    }
}
