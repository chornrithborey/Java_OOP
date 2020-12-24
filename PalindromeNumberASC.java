import java.util.Scanner;
public class PalindromeNumberASC {
  public static void main(String[] args)
  {
	  Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
			int num = scanner.nextInt();
		if(num >=0 && num <= 9)
		{
			for(int i=0; i<=num; i++)
			{
				System.out.print(" i : " + i + "\n");
				if(i < num)
				{
					int total = 9;
					total = total - ( i - 1);
					System.out.print("i : " + i + " = " + total + "\n");
				}
			}
		}
  }

}