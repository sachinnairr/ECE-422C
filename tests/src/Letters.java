
import java.util.LinkedList;

public class Letters {
   public static void main(String[] args) {
      LinkedList<Character> letters = new LinkedList<Character>();
      Character letter;
      int i;

      letters.add('c');
      letters.add('d');
      letters.add('e');
      letters.add('f');

      letters.add(2, 'g');
      letters.set(1, 'h');
      letters.remove(4);

      for (i = 0; i < letters.size(); ++i) {
         letter = letters.get(i);
         System.out.print(letter);
      }
      System.out.println();
   }
}