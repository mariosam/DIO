/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenandoNumerosParesImpares {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        
        array = orderOddsEvenNumbers( array );
        for (int num : array) { System.out.println( num ); }
	}

    /**
     * Return numbers even asc and odd desc.
     */
    public static int[] orderOddsEvenNumbers(int[] inputs) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();

        //separate odd and even numbers
        for (int num : inputs) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        //put even numbers in ascending order
        Collections.sort(evens);       

        //put odd numbers in descending order
        Collections.sort(odds, Collections.reverseOrder());

        //merge odd and even numbers
        evens.addAll(odds);

        //convert ArrayList to int[]
        return evens.stream().mapToInt(Integer::intValue).toArray();
    }
}
