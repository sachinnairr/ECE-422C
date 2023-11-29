 /* Student Name: Sachin Nair, Lab Section: 17400 */
package assignment1;

import java.util.Scanner;

public class Problem2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        dollarWords(s);
        scan.close();
    }

    public static void dollarWords(String s){
        String[] split = s.split(" ");

        for(int i = 0; i < split.length; i++){
            int value = 0;
            for(int j = 0; j < split[i].length(); j++){
                char letter = split[i].charAt(j);
                if((letter >= 97 && letter <= 122) || (letter >= 65 && letter <= 90)){
                    letter = Character.toLowerCase(letter);
                    value += (int) letter - 96;
                }
            }
            if(value == 100)
                System.out.println(split[i]);
        }
    }

}