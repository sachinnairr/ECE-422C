 /* Student Name: Sachin Nair, Lab Section: 17400 */
package assignment1;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.util.Scanner;

public class Problem3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        problem3(s);
        scan.close();
    }
    public static void problem3(String s){
    try{
        MaxentTagger tagger = new MaxentTagger("assignment1/taggers/english-left3words-distsim.tagger");
        System.out.println(tagger.tagString(s));
    }
    catch(Exception e){
        try{
            MaxentTagger tagger = new MaxentTagger("src/assignment1/taggers/english-left3words-distsim.tagger");
            System.out.println(tagger.tagString(s));
        }
        catch(Exception ex){
            try{
                MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
                System.out.println(tagger.tagString(s)); 
            }
            catch(Exception exc){
                System.out.println("Need to run file from src level for it to work");
            }
        }
    }
    }



}
