import java.util.Scanner;
// leap year had 366 days. Only Febuary has 29 days
public class LeapYear {
  public static void main(String[] args)
  {
	  	Scanner scanner = new Scanner(System.in);

	  	System.out.print("Enter a year : ");
		int year = scanner.nextInt();

		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		//Display Result 
		System.out.println(year + " is a leap year?" + " It is " + isLeapYear);


  }
}