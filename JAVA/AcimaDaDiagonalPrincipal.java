/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AcimaDaDiagonalPrincipal {

    private final static String MEDIA = "M";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        String ope = sc.next(); //get first line (operation = M or S)

        //save numbers to calculate after inside method
        ArrayList<Double> arr = new ArrayList<>();
        while ( sc.hasNextDouble() ) {
            arr.add( sc.nextDouble() );
        }
		    sc.close();

        System.out.println( String.format( "%.1f", mathResult(ope, arr) ));
	}

    /**
     * Get only numbers above the line and check if is sum or average.
     */
    public static double mathResult(String ope, ArrayList<Double> nums) {
        double result = 0;
        int i = 0;

        for ( int x = 0; x < 12; ++x ) {
        	for ( int y = 0; y < 12; ++y ) {
        		double num = nums.get(i); i++;

        		if ( y > x ) result += num;
        	}
        }

        return ope.equals( MEDIA ) ? result/=66.0 : result;
    }
}
