/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class NossosDiasNuncaVoltarao {

    private final static String WORD = "LIFE IS NOT A PROBLEM TO BE SOLVED";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
		    sc.close();

        System.out.println( cutWord( N ) );
	  }

    /**
     * Return only part of the word.
     */
    public static String cutWord(int pos) {
        return WORD.substring(0, pos);
    }
}
