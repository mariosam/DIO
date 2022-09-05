/**
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class EntradaSaidaLendoPulandoNomes {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        String[] input = new String[10];
        for (int x=0; x < 10; x++) {
            input[x] = sc.next();
        }
        sc.close();

        String[] ar = giveMe379( input );
        for (int x=0; x < ar.length; x++) {
            System.out.printf( ar[x] ); 
        }
	}
    
    /**
     * Return the names of position 3, 7 and 9.
     */
    public static String[] giveMe379(String[] ar) {
        return new String[] {ar[2], ar[6], ar[8]};
    }
}
