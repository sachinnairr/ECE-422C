/* EE422C Assignment #2 submission by
 * Replace <...> with your actual data. 
 * <Sachin Nair>
 * <svn343>
 */
package assignment2;

import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Boolean test = false;
        GameConfiguration conf = new GameConfiguration();
        String gen = SecretCodeGenerator.getInstance().getNewSecretCode();
        start(test,conf,gen);
    }
    public static void start(Boolean test, GameConfiguration conf, String gen){
        Game gm = new Game(test,conf,gen);
        gm.runGame();
    }
    
}
