/*
 * @author Rowena
 * This class contains a method that checks whether an integer array is symmetric.
 */

public class Symmetric {

    public boolean isSymmetric(int[] A, int n){
    // Input: Array A storing n >= 1 integer values
    // Output: true if A is symmetric; false otherwise
    	boolean output = false;
    	if(A.length <= 1) {
    		output = true;
    	}
    	else {
    		int index = 0;
    		while(index < n) {
    			index++;
    		}
    		if(A[0] == A[n-1]) { // checks if first and last elements of array are equivalent
    			int[] B = new int[n-2]; // creates a new array
    			for(int j=0; j<(n-2); j++) {
    				B[j] = A[j+1]; // copies entries from A to B excluding the first and last entries
    			}
    			n = n - 2;
    			return isSymmetric(B, n); // recursive call for with the new array
    		}
    		else { 
    			output = false;
    		}
    	}
    	return output;
    } 
}