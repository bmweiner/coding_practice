public class Date {
  public static void printAmerican (String day, int date, String month, int year){
    System.out.println("American Format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);    
  }

   public static void printEuropean (String day, int date, String month, int year){
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }

  public static void main (String[] args){
  
      String day;
      int date;
      String month;
      int year;
      
      day = "Thursday";
      date = 16;
      month = "July";
      year = 2015;
      
      printAmerican(day, date, month, year);
      printEuropean(day, date, month, year);
  }
}