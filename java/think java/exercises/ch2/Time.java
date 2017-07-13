public class Time {
  public static void main (String[] args){
    int hour;
    int minute;
    int second;
    int total;
    
    hour = 7;
    minute = 19;
    second = 30;
    
    total = hour * 60 * 60 + minute * 60 + second;
    
    System.out.println("Elapsed seconds: " + total);
    System.out.println("Seconds remaining: " + (24 * 60 * 60 - total));
    System.out.println("Percentage Elapsed: " + 100 * total / (24 * 60 * 60));
  }
}