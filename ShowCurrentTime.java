import java.util.Scanner;

public class ShowCurrentTime {
  public static void main(String[] args)
  {
      long currentMilis = System.currentTimeMillis();
      System.out.println("Current currentTimeMilli Second : " + currentMilis);

      for(int i =0; i< 100; i++)
      {
        try {
          Thread.sleep(100);
        }catch (InterruptedException e)
        {
          e.printStackTrace();
        }
      }

  long timeLapse = System.currentTimeMillis() - currentMilis; 

  System.out.println("Process took time : " + timeLapse + " milliseconds."); 


  }  
  }
