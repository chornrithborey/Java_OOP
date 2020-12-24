import java.util.Scanner;
// a program to find out the cambodia Zodiac name of the given year 
// based on 12 year cycle with each year 
//Algorithms 
// Year % 12 determine the Zodiac symbol 
//1900 is the year of the Mouse , 1900 % 12 = 4 
public class CambodiaZodiac {
	public static void main(String[] args)
	{

       Scanner scanner = new Scanner(System.in);

	   System.out.print("Enter a year = ");
	   int year = scanner.nextInt();

	   switch(year % 12 )
	   {
		   case 0: System.out.println("Monkey");
		   break;
		   case 1: System.out.println("Chicken");
		   break;
		   case 2: System.out.println("Dog");
		   break;
		   case 3: System.out.println("Pig");
		   break;
		   case 4: System.out.println("Mouse");
		   break;
		   case 5: System.out.println("Cow");
		   break;
		   case 6: System.out.println("Tiger");
		   break;
		   case 7: System.out.println("Rabbit");
		   break;
		   case 8: System.out.println("Dragon");
		   break;
		   case 9: System.out.println("Snack");
		   break;
		   case 10: System.out.println("House");
		   break;
		   case 11: System.out.println("Goat");
		   break;
		   default:

		 
	   }
	}
}