// SortTools.java
/*
 * EE422C Project 1 submission by
 * Replace <...> with your actual data.
 * <Student Name>
 * <Student EID>
 * <5-digit Unique No.>
 * Spring 2023
 * Slip days used:
 */

package assignment1;

import java.util.ArrayList;

public class SortTools {
    /**
      * Return whether the first n elements of x are sorted in non-decreasing
      * order.
      * @param x is the array
      * @param n is the size of the input to be checked
      * @return true if array is sorted
      */
    public static boolean isSorted(int[] x, int n) {
        // stub only, you write this!
        // TODO: complete it
        for(int i = 0; i < n-1; i++){
            if(x[i] > x[i+1]){
                return false;
            }
        }
        return true;
    }

    /**
     * Return an index of value v within the first n elements of x.
     * @param x is the array
     * @param n is the size of the input to be checked
     * @param v is the value to be searched for
     * @return any index k such that k < n and x[k] == v, or -1 if no such k exists
     */
    public static int find(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it
        for(int i = 0; i < n; i++){
            if (x[i] == v){
                return i;
            }

        }
        return -1;
    }

    /**
     * Return a sorted, newly created array containing the first n elements of x
     * and ensuring that v is in the new array.
     * @param x is the array
     * @param n is the number of elements to be copied from x
     * @param v is the value to be added to the new array if necessary
     * @return a new array containing the first n elements of x as well as v
     */
    public static int[] copyAndInsert(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it
        
        int[] newarr = new int[n+1];
        for(int i = 0; i < n+1){
            newarr[i] = x[i];
        }
        newarr[n+1] = v;
        return newarr;
    }

    /**
     * Insert the value v in the first n elements of x if it is not already
     * there, ensuring those elements are still sorted.
     * @param x is the array
     * @param n is the number of elements in the array
     * @param v is the value to be added
     * @return n if v is already in x, otherwise returns n+1
     */
    public static int insertInPlace(int[] x, int n, int v) {
        // stub only, you write this!
        // TODO: complete it
        if(find(x,n,v) != -1)
            int[] newarr = new int[n]
            for(int i = 0; i < n; i++){
                
            }
        return -1;
    }

    /**
     * Sort the first n elements of x in-place in non-decreasing order using
     * insertion sort.
     * @param x is the array to be sorted
     * @param n is the number of elements of the array to be sorted
     */
    public static void insertSort(int[] x, int n) {
        // stub only, you write this!
        // TODO: complete it
    }
}
