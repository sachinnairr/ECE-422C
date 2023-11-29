public class Pair <T extends Comparable<T>> {
    private T item1;
    private T item2;
 
    public Pair(T i1, T i2) {
       item1 = i1;
       item2 = i2;
    }
 
    public T chooseItem() {
       T chosenItem;
 
       if (item1.compareTo(item2) < 0) { 
          chosenItem = item1;
       }
       else {
          chosenItem = item2;
       }
       return chosenItem;
    }
 }