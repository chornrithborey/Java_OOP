import java.util.Scanner;
//  1. using `System.out.printf("%10s", i+"*"+j+"="+(i*j));` to align all your display results
//  2. Your code in `main()` method body should be 10 line of code.
//  3. See the out result as attachment file

public class Multi_For {
  public static void main(String[] args)
  {
	 for(int i=1; i<= 10; i++ )
	 {
		  for (int j=1; j <= 10; j++ )
		 {
           System.out.printf("%10s", i+"*"+j+"="+(i*j) );
		 }
	 }
  }
}