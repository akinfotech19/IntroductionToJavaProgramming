import java.util.Scanner;

public class DisplayTime
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter the time in seconds. ");

    long seconds = scannerObject.nextLong();
    long minutes = seconds / 60;
    seconds = seconds % 60;

    System.out.println("Minutes: " + minutes + ", Seconds: " +seconds);
  }
}
