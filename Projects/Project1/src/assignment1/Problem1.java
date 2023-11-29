 /* Student Name: Sachin Nair, Lab Section: 17400 */
package assignment1;

import java.util.Scanner;

public class Problem1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        System.out.println(problem1(n, s));
        scan.close();
    }

    public static int problem1(int n, String s){   
        int max = Integer.MIN_VALUE;
    
        for(int i = 0; i < s.length() - (n-1); i++){
            int product = Character.getNumericValue(s.charAt(i));
            int j = 1;
            while((i + j) < s.length() && j < n){
                int temp = Character.getNumericValue(s.charAt(i+j));
                product *= temp;
                j++;
            }
            if((i + j) < s.length() + 1){
                if(max < product)
                    max = product;
                
            }
        }
        return max;
    }

}