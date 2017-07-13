import java.util.Scanner;

public class ConvertHMS{
  public static void main(String[] args){
    int totalSeconds, hours, minutes, seconds;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Provide total seconds:");
    totalSeconds = in.nextInt();
    
    hours = totalSeconds / (60 * 60);
    minutes = (totalSeconds / 60) % 60;
    seconds = totalSeconds % 60;
    
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", totalSeconds,
                      hours, minutes, seconds);
  }
}