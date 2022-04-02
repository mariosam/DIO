/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class TeoremaDaDivisaoEuclidiana {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        String[] line = sc.next().split(" ");
        sc.close();

        int[] ar = getQuoAndRest( Integer.parseInt(line[0]), Integer.parseInt(line[1]) );
        System.out.printf( "%s %s", ar[0], ar[1] ); 
	}

    /**
     * Get the quocient and rest of the division.
     */
    public static int[] getQuoAndRest(int a, int b) {
        int q = a / b;
        int r = a % b;

        if ( r < 0 ) {
            r += Math.abs( b );

            q = ( a - r ) / b; 
        }

        return new int[] { q, r };
    }
}
