import java.util.Scanner;
public class PalindromeNumberVerticleHorizontal {
  public static void main(String[] args)
  {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = input.nextInt();
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = i; j > 0; j--) {
                System.out.print(j );
            }
            for (j = 2; j < i + 1; j++) {
                System.out.print(j );
            }
            System.out.println("");
        }

        for (i = num - 1; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print(j );
            }
            for (j = 2; j < i + 1; j++) {
                System.out.print(j );
            }
            System.out.println("");
        }
			
  }

}