/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> ages = new ArrayList<Integer>();
		Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();

        while ( n > 0 ) {
            ages.add( n );
            n = sc.nextInt();
        }
		sc.close();

        int[] agesArray = new int[ages.size()];
        for (int i = 0; i < ages.size(); i++) {
            agesArray[i] = ages.get(i);
        }
        System.out.printf( "%.2f", calcAverage( agesArray ) );
	}

    /**
     * Calculate and return the average of ages.
     */
    public static double calcAverage(int[] ages) {
        double result = 0;

        for (int i = 0; i < ages.length; i++) {
            result += ages[i];
        }

        return result / ages.length;
    }
}
