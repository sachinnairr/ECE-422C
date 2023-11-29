import java.util.*;

public class code {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Apple");
        names.add("Melon");
        names.add("Pear");
        names.add("Grape");
        names.add("Lemon");
        names.add("Mango");
        names.add("Avacado");
        names.add("Peach");
        int len = 5;
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            if(((String)it.next()).length() == len){
                System.out.println(it.next());
            }
        }
    }
}