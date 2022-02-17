/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class Resto2 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();
    	
        printAllRest2( N );
	  }

    /**
     * Print all values where rest is equals 2.
     */
    public static void printAllRest2(int x) {
        for ( int i=1; i < 10000; i++ ) {
            if ( i % x == 2 ) System.out.println( i );
        }
    }
}
