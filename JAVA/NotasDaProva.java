/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class NotasDaProva {

    private final static String A  = "A";
    private final static String B  = "B";
    private final static String C  = "C";
    private final static String D  = "D";
    private final static String E  = "E";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        int top = sc.nextInt();
		    sc.close();

        System.out.println( takeResult( top ) );
	}

    /**
     * Identify the final score points.
     */
    public static String takeResult(int pos) {
        String result = E;

        if ( pos > 85 ) {
            result = A;
        } else if ( pos > 60 ) {
            result = B;
        } else if ( pos > 35 ) {
            result = C;
        } else if ( pos > 0 ) {
            result = D;
        }

        return result;
    }
}
