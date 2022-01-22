/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {
	
	public static void main(String[] args) throws IOException {
    	  Scanner sc = new Scanner( System.in );
        ArrayList<Double> ar = new ArrayList<>();
        while (sc.hasNextDouble()) {
            ar.add( sc.nextDouble() );
        }
    	  sc.close();
    	
        System.out.printf( "%d valores positivos", sumPositives( ar ) );
	}

    /**
     * Count positives numbers.
     */
    public static int sumPositives(ArrayList<Double> ar) {
        int result = 0;

        for ( double num : ar ) {
            if ( num > 0 ) result++;
        }

        return result;
    }
}
