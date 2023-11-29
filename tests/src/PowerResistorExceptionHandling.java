
import java.util.Scanner;
import java.util.InputMismatchException;

public class  PowerException{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentLevel;
      int powerResistor;
      int resistorOhms = 1;
 
      try {
         currentLevel = scnr.nextInt();

         powerResistor = currentLevel * currentLevel * resistorOhms;
         
         System.out.println("Power = " + powerResistor + "W");
      }
      catch (InputMismatchException excpt) {
         System.out.println("Error getting input");
      }
   }
}