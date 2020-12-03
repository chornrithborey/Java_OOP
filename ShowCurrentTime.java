import java.util.Scanner;

public class ShowCurrentTime {
  public static void main(String[] args)
  {
      long currentMilis = System.currentTimeMillis();
      System.out.println("Current currentTimeMilli Second : " + currentMilis);

//       for(int i =0; i< 100; i++)
//       {
//         try {
//           Thread.sleep(100);
//         }catch (InterruptedException e)
//         {
//           e.printStackTrace();
//         }
//       }

        //   long timeLapse = System.currentTimeMillis() - currentMilis; 

        // System.out.println("Process took time : " + timeLapse + " milliseconds."); 

        // obtain the total 
        long totalSecond = currentMilis / 1000;

        //Obtain the current seconds in the minutes in the hour
        long second = totalSecond  % 60;

        //obtain the current seconds in mn in the hour
        long totalMinutes = totalSecond / 60;

        //Obtain the current minutes in the hour 
        long minutes = totalMinutes % 60;

        //Obtain the total hours from midnight, jan 1, 1970
        long totalHours = totalMinutes / 60;

        //Obtain the current hours in the day 
        long hours = totalHours % 24;

        //output
        System.out.println("current time : "+ hours +":"+ minutes + ":" + second + " GMT+00:00");

        System.out.println("Current time: "+ (hours + 7) + ":" + minutes + ":" + second + " GMT+07:00 Phnom Penh");
  }  
  }
