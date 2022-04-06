/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();

        int[] ar = countEve( N );
        for (int eve : ar) {
            System.out.println( eve ); 
        }
	}

    /**
     * Show only the eve numbers.
     */
    public static int[] countEve(int n) {
        List<Integer> results = new ArrayList<Integer>();

        for ( int i=2; i <= n; i+=2 ) results.add( i );
        
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}
