public class Date {  
  
  public static void main (String[] args){
  
      String day;
      int date;
      String month;
      int year;
      
      day = "Thursday";
      date = 16;
      month = "July";
      year = 2015;

    System.out.println("American Format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);
    
  }
}