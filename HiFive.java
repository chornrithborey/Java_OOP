import java.util.Scanner;
public class hifive {
    public static void main(String[] args){
            Scanner Scanner = new Scanner(System.in);

            System.out.print("Enter an Integer :");
            int number = Scanner.nextInt();

            if(number % 5 == 0)
            {
                System.out.print("hi five");
            }

            if(number % 2 == 0)
            {
                System.out.print("Hi Even");
            }
            if(number % 2 == 1 )
            {
                System.out.print("Hi Odd");
            }






    }



}