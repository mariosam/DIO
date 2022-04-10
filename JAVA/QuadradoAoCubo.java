/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class QuadradoAoCubo {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();

        int[][] ar = loadSquareAndCumbe( N );
        for (int[] ops : ar) {
            System.out.printf( "%d %d %d", ops[0], ops[1], ops[2] );
        }
	}

    /**
     * Load all square and cumbe numbers.
     */
    public static int[][] loadSquareAndCumbe(int n) {
        int[][] results = new int[n][3];

        for ( int i=1; i <= n; i++ ) {
            results[i-1][0] = i;
            results[i-1][1] = (int) Math.pow(i, 2);
            results[i-1][2] = (int) Math.pow(i, 3);
        }
        
        return results;
    }
}
