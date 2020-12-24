import java.util.Scanner;
public class PalindromeNumberDSC {
  public static void main(String[] args)
  {
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number : ");
			int num = scanner.nextInt();

			if(num >= 0 && num <= 9 )
			{
				for(int i = 1; i <=num; i++)
				{
					System.out.print(i+ "\n");
				}
				for(int i = num-1; i>0; i--)
				{
					System.out.print(i+ "\n");
				}
				
			}
  }

}