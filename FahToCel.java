import java.util.Scanner;

public class FahToCel {
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Input a degree in fahrenheit:");
      double fahrenheit = input.nextDouble();

      //convert 
      double celsius = (5.0/9) * (fahrenheit - 32);
      System.out.println("Fahrenheit is = " + fahrenheit + " in celsius is " + celsius);
  }
}