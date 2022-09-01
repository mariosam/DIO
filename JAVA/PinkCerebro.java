/**
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PinkCerebro {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        String[] line = sc.next().split(" ");
        int[] lineInt = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        sc.close();

        int[] ar = getMultiples( lineInt );
        for (int x=0; x < n; x++) {
            System.out.printf( "%d Multiplo(s) de %d", ar[x], x+2 ); 
        }
	}

    /**
     * Get the multiples of array numbers.
     */
    public static int[] getMultiples(int[] ar) {
        int[] result = {0,0,0,0};

        for (int i=0; i < ar.length; i++) {
            if ( ar[i] % 2 == 0 ) result[0]++;
            if ( ar[i] % 3 == 0 ) result[1]++;
            if ( ar[i] % 4 == 0 ) result[2]++;
            if ( ar[i] % 5 == 0 ) result[3]++;
        }

        return result;
    }
}
