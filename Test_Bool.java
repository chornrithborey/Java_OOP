import java.util.Scanner;

public class test_bool {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an Integer : ");
		int number = scanner.nextInt();

		if(number %2 == 0 && number %3 == 0 )
		{
			System.out.println(number + " is divisible by 2 & 3 ");
		}

		if(number % 2 == 0 || number % 3 == 0)
		{
			System.out.println(number + " is divisible by 2 Or 3 ");
		}

		if(number % 2 == 0 ^ number % 3 == 0)
		{
			System.out.println(number + " is divisible in 2 Or 3 , Not both");
		}
	}
}