import java.util.Scanner;
//  1. using `System.out.printf("%10s", i+"*"+j+"="+(i*j));` to align all your display results
//  2. Your code in `main()` method body should be 10 line of code.
//  3. See the out result as attachment file

public class Multi_while {
  public static void main(String[] args)
  {
	  int i = 1,j=1;

	 while(i <= 10 )
	 {
		 j = 1;
		  while (j <= 10 )
		 {
           System.out.printf("%10s", i+"*"+j+"="+(i*j) );
		   j++;
		 }
      i++;
	 }
    
  }
}