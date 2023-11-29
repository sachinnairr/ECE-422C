/* EE422C Assignment #2 submission by
 * Replace <...> with your actual data. 
 * <Sachin Nair>
 * <svn343>
 */

package assignment2;

import java.util.ArrayList;

public class verifyGuess{

    private GameConfiguration conf;
    private ArrayList<Integer> black;
    private String colors;

    public verifyGuess(GameConfiguration conf) {
        this.conf = conf;
        for (int j =0; j<conf.colors.length; j++) {
            colors+=conf.colors[j];
        }
    }

    public Boolean checkSyntax(String guess) {
        if(guess.length()!=conf.pegNumber)
            return false;
        for (int i=0; i<guess.length(); i++) {
            char c = guess.charAt(i);
            if(!colors.contains(String.valueOf(c)))
                return false;
        }
        return true;
    }

    private int getNumBlack(String code, char guess, int index) {
        String[]colors = conf.colors;
        int pegs = conf.pegNumber;

        if(code.charAt(index) == guess) {
            black.add(index);
            return 1;
        }

        return 0;
    }

    private int getNumWhite(String code, char guess, int index) {
        String[]colors = conf.colors;
        int pegs = conf.pegNumber;
        if (code.charAt(index)!=guess) {
            for (int i =0; i<code.length(); i++)
            {
                if (guess == code.charAt(i) && !black.contains(i)) {
                    black.add(i);
                    return 1;
                }
            }
        }

        return 0;
    }

    public void checkPegs(int[]b,int[]w,String guess,String code) {
        b[0]=0;
        w[0]=0;
        black = new ArrayList<Integer>();

        for (int i=0; i<guess.length(); i++) {
            char current = guess.charAt(i);
            b[0] += getNumBlack(code,current,i);
        }

        for (int i=0; i<guess.length(); i++) {
            char current = guess.charAt(i);
            w[0] += getNumWhite(code,current,i);
        }
    }

}
