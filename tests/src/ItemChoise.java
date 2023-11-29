public class ItemChoise {
   public static <T extends Comparable<T>>
   T chooseItem(T item1, T item2, T item3) {
      T chosenItem = item1;

      if (item2.compareTo(chosenItem) < 0) {
         chosenItem = item2;
      }
      if (item3.compareTo(chosenItem) < 0) {
         chosenItem = item3;
      }
      return chosenItem;
   }

   public static void main(String[] args) {
      Integer i1 = 8;
      Integer i2 = 7;
      Integer i3 = 6;

      Character c1 = 'v';
      Character c2 = 'e';
      Character c3 = 'b';

      String s1 = "aqua";
      String s2 = "lime";
      String s3 = "purple";

      System.out.println(chooseItem(i1, i2, i3));
      System.out.println(chooseItem(c1, c2, c3));
      System.out.println(chooseItem(s1, s2, s3));
   }
}