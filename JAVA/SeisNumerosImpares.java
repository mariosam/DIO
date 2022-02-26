/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();
    	
        printSixOdd( N );
	  }

    /**
     * Print the next six odd.
     */
    public static void printSixOdd(int x) {
        //if even transform in odd.
        x = x % 2 == 0 ? x : x-1;

        for ( int i=1; i < 12; i=i+2 ) {
            System.out.println( x+i );
        }
    }
}
