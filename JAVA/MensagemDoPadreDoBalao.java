/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class MensagemDoPadreDoBalao {

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );

        while ( sc.hasNext() ) {
            String alpha = sc.next();
            int letters = sc.nextInt();

            int[] codes  = new int[letters];
            for ( int i=0; i < letters; i++ ) {
                codes[i] = sc.nextInt();
            }

            System.out.println( decodeMsg( alpha, codes ) );
        }
		    sc.close();
	}

    /**
     * Decode the message.
     */
    public static String decodeMsg(String a, int[] nums) {
        String result = "";

        for ( int n : nums ) {
            result += a.charAt( n-1 );
        }

        return result;
    }
}
