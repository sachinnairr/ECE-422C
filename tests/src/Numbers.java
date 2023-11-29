import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Numbers {
   public static void main(String[] args) {
      LinkedList<Integer> numbers = new LinkedList<Integer>();
      ListIterator<Integer> numIter;
      int nextNum;

      numbers.add(10);
      numbers.add(11);
      numbers.add(9);

      numIter = numbers.listIterator();
      while (numIter.hasNext()) {
         numIter.next();
      }

      numIter.remove();
      if (numIter.hasPrevious()) {
         numIter.previous();
      }
      numIter.set(8);

      numIter = numbers.listIterator();
      while (numIter.hasNext()) {
         nextNum = numIter.next();
         System.out.println(nextNum);
      }
   }
}