public class ItemManager {
    public static void main(String[] args) {
       Item<Integer> itemInt = new Item<Integer>(26);
       Item<Character> itemChar = new Item<Character>('o');
 
       itemInt.updateCount(46); 
       itemInt.updateCount(9); 
 
       itemChar.updateCount('q'); 
       itemChar.updateCount('o'); 
    }
 }