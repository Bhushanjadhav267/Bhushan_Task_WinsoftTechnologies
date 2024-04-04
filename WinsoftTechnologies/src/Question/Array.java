package Question;
import java.util.Arrays;
public class Array {

	
	public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move all non-zero elements of X to the beginning
        int i = m - 1;
        int j = m - 1;
        while (i >= 0) {
            if (X[i] != 0) {
                X[j] = X[i];
                j--;
            }
            i--;
        }
        
        // Merge Y[] into X[]
        i = j + 1;
        j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k] = X[i];
                i++;
            } else {
                X[k] = Y[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[k] = Y[j];
            j++;
            k++;
        }
    }

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
	        int[] Y = { 1, 8, 9, 10, 15 };
	        
	        mergeArrays(X, Y);
	        
	        System.out.println("Merged Array: " + Arrays.toString(X));

	}

}
