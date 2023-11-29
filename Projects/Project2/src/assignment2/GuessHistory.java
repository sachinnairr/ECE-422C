/* EE422C Assignment #2 submission by
 * Replace <...> with your actual data. 
 * <Sachin Nair>
 * <svn343>
 */
package assignment2;
import java.util.ArrayList;

public class GuessHistory{

    private ArrayList<String> guessList;

    public GuessHistory() {
        guessList = new ArrayList<String>();
    }

    public void addGuess(String result) {
        guessList.add(result);
    }

 
    public void printHistory(){
        if(guessList == null){
            System.out.println("NO HISTORY");
        }
        else if(guessList!=null){
            for (String guess:guessList)
                System.out.println(guess);
            System.out.println();
        }
    }







}
