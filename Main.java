/*
 * @author Rowena
 */

public class Main {
	
    public static void main (String[] args) {
    	
    	Symmetric Check = new Symmetric();
    	
    	int[] A = {1, 4, 5, 5, 4, 1};
    	int[] B = {2, 3, 4};
    	
    	if(Check.isSymmetric(A, 6)) {
    		System.out.println("A is symmetric.");
    	}
    	else {
    		System.out.println("A is not symmetric.");
    	}
    	
    	if(Check.isSymmetric(B, 3)) {
    		System.out.println("B is symmetric.");
    	}
    	else {
    		System.out.println("B is not symmetric.");
    	}
    }

}
