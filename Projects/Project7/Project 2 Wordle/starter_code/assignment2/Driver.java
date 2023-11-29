package assignment2;

import java.util.Scanner;

public class Driver {

    public void start(GameConfiguration config) {
        // TODO: complete this method
        // We will call this method from our JUnit test cases.
        Scanner scan = new Scanner(System.in());
        String input;
        Game = new Game(config,Sca)
        while(input != "y"){
            System.out.println("Would you like to play the game? (y/n)");
            input = scan.nextLine();
            if(input == "n"){
                break;
            }
        }
    }

    public void start_hardmode(GameConfiguration config) {
        // TODO: complete this method for extra credit
        // We will call this method from our JUnit test cases.
    }

    public static void main(String[] args) {
        // Use this for your testing.  We will not be calling this method.
    }
}
