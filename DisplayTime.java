import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args)
  {
    Scanner Scanner = new Scanner(System.in);

    System.out.print("Enter Seconds : ");
    int second = Scanner.nextInt();

    int mn = second/60;
    int remainSecond = second % 60;

    System.out.println("Minute : "+ mn + " & " + remainSecond + " seconds ");
  }
}