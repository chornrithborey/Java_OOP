import java.util.Scanner;

public class Body_Mass_Cal {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter weight in Kg : ");
		double weight = scanner.nextDouble();

		System.out.print("Enter height in metre :");
		double height = scanner.nextDouble();

		double bmi = weight / (height * height);

		if(bmi < 18.5)
		{
			System.out.println("Underweight");
		}else if(bmi < 25)
		{
			System.out.println("Normal");
		}else if (bmi < 30 )
		{
			System.out.println("Overweight");
		}else{
			System.out.println("Obesity");
		}


	}
}