/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;

public class ArraysPares {

    public static void main(String[] args) throws IOException {
        int[] array = { 2, 3, 5, 7, 11, 13, 18, 34 };

        array = returnOnlyEven( array );
        for (int num : array) {
            System.out.println(num);
        }
	}

    /**
     * Return only even numbers from an array.
     */
    public static int[] returnOnlyEven(int[] inputs) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] % 2 == 0) {
                ar.add(inputs[i]);
            }
        }

        return ar.stream().mapToInt(Integer::intValue).toArray();
    }
}
