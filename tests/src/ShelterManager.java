import java.util.ArrayList;

public class ShelterManager {
   public static void main(String[] args) {
      ArrayList<String> shelterPets = new ArrayList<String>();

      shelterPets.add("Whiskers");
      shelterPets.add("Moby");
      shelterPets.add("Spot");

      System.out.println("Pets:");

      for (String petName : shelterPets) {
         System.out.println(petName);
      }
   }
}