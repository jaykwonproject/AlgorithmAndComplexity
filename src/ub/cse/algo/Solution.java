package ub.cse.algo;

import java.util.Arrays;
import java.util.Vector;
import java.util.ArrayList;

/**
 * For use in CSE 331
 * Template for Homework 3
 */
public class Solution {
    
    private ArrayList<Integer> in_vector;
    
    /**
     * The constructor simply sets up the necessary data structures.
     * The grader for the homework will first call this class and pass the necessary variables.
     * There is no need to edit this constructor.
     *
     * @param in_vector the vector used to multiply against the matrix
     */
    public Solution(ArrayList<Integer> in_vector) {
        this.in_vector = in_vector;
    }
    
    /**
     * This method must be filled in by you. You may add other methods and subclasses as you see fit,
     * but they must remain within the Solution class.
     * @return Your resulting vector.
     */
    public ArrayList<Integer> outputVector() {
        ArrayList<Integer> output = new ArrayList<>();
        int filesize = in_vector.size();
        int sum = 0;
        for(int i=0; i<filesize; i++){
            sum = in_vector.get(i) + sum;
        }
        for(int j=0; j<filesize; j++){
            output.add(sum);
            sum = sum-in_vector.get(j);
        }
        return output;
    }
}
