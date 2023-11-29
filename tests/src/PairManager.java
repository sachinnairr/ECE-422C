public class PairManager {
    public static void main(String[] args) {
       Pair<Integer> twoInts = new Pair<Integer>(31, 49); 
       Pair<Double> twoDbls = new Pair<Double>(29.9, 43.4);
       Pair<Character> twoChars = new Pair<Character>('f', 'a');
 
       System.out.println(twoInts.chooseItem());
       System.out.println(twoDbls.chooseItem());
       System.out.println(twoChars.chooseItem());
    }
 }