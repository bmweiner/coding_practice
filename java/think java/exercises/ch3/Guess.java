import java.util.Random;
import java.util.Scanner;

public class Guess{
  public static void main(String[] args){
    int numberIn;
    int numberRand;
    
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    
    numberRand = random.nextInt(100) + 1;
    
    System.out.println("I'm thinking of a number between 1 and 100 " +
                       "(including both). Can you guess what it is?");
    System.out.println("Type a number: ");
    numberIn = in.nextInt();
    System.out.printf("Your guess is: %d\n", numberIn);
    System.out.printf("The number I was thinking of is: %d\n", numberRand);
    System.out.printf("You were off by: %d\n", Math.abs(numberIn - numberRand));
  }
}