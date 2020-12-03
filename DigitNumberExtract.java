import java.util.Scanner;

public class DigitNumberExtract {
  public static void main(String[] args)
  {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Please input Letters contains digit number : ");
       String input = scanner.next();
        String result = "";
        String digit  = "";
        String letter  = "";
       for(int i=0; i < input.length(); i++)
      {
          char ch = input.charAt(i);

        //   if(Character.isDigit(ch)) //if integer 
        //   {
        //       result += ch; //result = result + ch 
        //   }
        //   if(Character.isSpace(ch))  //space
        //   {
        //       result += ch; //result = result + ch 
        //   }

        // 2nd method 
          if(Character.isDigit(ch)) //if integer 
          {
              digit += ch; //result = result + ch 
          }else{
              letter += ch;
          }

      }
    //   System.out.println("Digit numbers : " + result);
    System.out.println("Digit numbers : " + digit);
    System.out.println("Letters  : " + letter);
    System.out.println("Uppercase letters  : " + letter.toUpperCase());
    System.out.println("Lower letters  : " + letter.toLowerCase());
  }
}