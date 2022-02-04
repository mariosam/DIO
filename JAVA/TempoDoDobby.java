/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class TempoDoDobby {

    private final static String HOJE   = "Farei hoje!";
    private final static String AMANHA = "Deixa para amanha!";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
      	int A = sc.nextInt();
        int B = sc.nextInt();
		    sc.close();

        System.out.println( todayOrTomorrow( N, A, B ) );
	  }

    /**
     * Dobby will do the work today or tomorrow.
     */
    public static String todayOrTomorrow(int n, int a, int b) {
        String result = HOJE;

        if ( n < (a+b) ) result = AMANHA;

        return result;
    }
}
