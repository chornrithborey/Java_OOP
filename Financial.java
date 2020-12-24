import java.util.Scanner;

public class Financial {
  public static void main(String[] args)
  {
	//   Scanner input = new Scanner(System.in);
	//  System.out.print("The amount invested : ");
	//    double invest = input.nextDouble();
	//    System.out.print("Annual Interest Rate : ");
	//    double Interest = input.nextDouble();
	//    int numberOfYears; 

	
		double f =  futureInvestmentValue(400.0,5.9,15);
		for(int i=0; i<=15; i++)
		{
		System.out.println(i);
		System.out.println(f);

		}

  }

  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears)
  {  
	   futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
  }
}