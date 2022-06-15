/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuemPagaraConta {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n+1];
        array[0] = n;

        for (int i = 1; i <= n; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        
        array = resultOfSum( array );
        for (int num : array) {
            System.out.println( num );
        }
	}

    /**
     * Return the result of sum of all numbers in the array
     */
    public static int[] resultOfSum(int[] inputs) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < inputs.length; i++) {
            ar.add( inputs[i]%2 );
        }

        return ar.stream().mapToInt(Integer::intValue).toArray();
    }
}
