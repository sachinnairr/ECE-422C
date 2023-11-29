/* EE422C Assignment #2 submission by
 * Replace <...> with your actual data. 
 * <Sachin Nair>
 * <svn343>
 */
package assignment2;

import java.util.Scanner;

public class Game {

    private int remainingGuesses;
    private Boolean test;
    private GameConfiguration conf;
    private String gen;
    private Scanner scan;
    private Boolean run;

    public Game(Boolean test, GameConfiguration conf, String gen) {
        this.test=test;
        this.conf=conf;
        this.gen=gen;
        scan = new Scanner(System.in);
        run=true;
        System.out.println("Welcome to Mastermind.");
    }
    public void runGame() {
        while(run) {
            System.out.println("Do you want to play a new game? (Y/N):");
            if (scan.nextLine().equals("Y")) {
                gameLoop();
            } else {
                run =false;
            }

        }
    }

    public void gameLoop() {
        String secretCode;
        remainingGuesses = conf.guessNumber;
        secretCode = SecretCodeGenerator.getInstance().getNewSecretCode();

        if (test)
            System.out.println("Secret Code: "+secretCode);
        GuessHistory gh = new GuessHistory();
        while (remainingGuesses>0) {
            System.out.println("You have "+remainingGuesses+" guess(es) left.");
            System.out.println("Enter guess:");
            System.out.println();
            String guess = scan.nextLine();

            if(guess.equals("HISTORY")) {
                gh.printHistory();
                continue;
            }


            verifyGuess gv = new verifyGuess(conf);
            if(!gv.checkSyntax(guess)) {
                System.out.println("INVALID_GUESS");
                System.out.println();
                continue;
            }

            int []b = new int[1];
            int []w = new int[1];
            gv.checkPegs(b,w,guess,secretCode);
            gh.addGuess(guess+" -> "+b[0] +"b_"+w[0]+"w");
            System.out.println(guess+" -> "+b[0] +"b_"+w[0]+"w");
            System.out.println();
            if(b[0]==secretCode.length()) {
                System.out.println("You win!");
                System.out.println();
                return;
            }
            remainingGuesses--;
        }
        System.out.println("You lose! The pattern was "+secretCode);
        System.out.println();
    }

}
