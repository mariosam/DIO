/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoDeVetor2 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner( System.in );
    	int N = sc.nextInt();
    	sc.close();

        printAllVector2( N );
    }

    /**
     * Print all values of vector.
     */
    public static void printAllVector2(int x) {
        for ( int i=0, j=0; i < 1000; i++, j++ ) {
            System.out.println("N[" + i + "] = "+ j);
            
            if ( j == (x-1) ) j = -1;
        }
    }
}
