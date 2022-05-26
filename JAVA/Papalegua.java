/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Papalegua {
	
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner( System.in );
        ArrayList<Double> ar = new ArrayList<>();
        while (sc.hasNextDouble()) {
            ar.add( sc.nextDouble() );
        }
    	sc.close();
    	
        System.out.print( theFaster( ar ) );
	}

    /**
     * Get values and return the minor value, the faster one.
     */
    public static double theFaster(ArrayList<Double> arr) {
        double faster = 999;

        for ( double value : arr ) {
            if ( value < faster ) faster = value;
        }

        return faster;
    }
}
