public class Item <T extends Comparable<T>> {
    private T value;
    private Integer count;
 
    public Item(T i1) {
       value = i1;
       count = 0;
    }
 
    public void updateCount(T testVal) {
       if (value.compareTo(testVal) > 0) { 
          ++count;
       }
       else if (value.compareTo(testVal) == 0) {
          --count;
       }
       System.out.println(count);
    }
 
    public Integer getCount() {
       return count;
    }
 }