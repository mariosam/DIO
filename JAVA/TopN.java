/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class TopN {

    private final static String TOP1   = "Top 1";
    private final static String TOP3   = "Top 3";
    private final static String TOP5   = "Top 5";
    private final static String TOP10  = "Top 10";
    private final static String TOP25  = "Top 25";
    private final static String TOP50  = "Top 50";
    private final static String TOP100 = "Top 100";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        int top = sc.nextInt();
		    sc.close();

        System.out.println( topRange( top ) );
	}

    /**
     * Identify the range of position.
     */
    public static String topRange(int pos) {
        String result = TOP100;

        if ( pos < 2 ) {
            result = TOP1;
        } else if ( pos < 4 ) {
            result = TOP3;
        } else if ( pos < 6 ) {
            result = TOP5;
        } else if ( pos < 11 ) {
            result = TOP10;
        } else if ( pos < 26 ) {
            result = TOP25;
        } else if ( pos < 51 ) {
            result = TOP50;
        }

        return result;
    }
}
