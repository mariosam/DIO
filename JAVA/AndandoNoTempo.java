/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class AndandoNoTempo {

    private final static String N = "N";
    private final static String S = "S";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		    sc.close();

        System.out.println( possibleTravel(a, b, c) );
	}

    /**
     * Check if is possible to travel in time.
     */
    public static String possibleTravel(int a, int b, int c) {
        String result = N;

        if ( a == b || b == c || a == c || a+b==c || a+c==b || b+c ==a ) result = S;

        return result;
    }
}
