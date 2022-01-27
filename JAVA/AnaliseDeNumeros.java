/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int[] ops = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();
        
        int[] ret = numberAnalysis( ops );

        System.out.printf( "%d par(es)\n", ret[0] );
        System.out.printf( "%d impar(es)\n", ret[1] );
        System.out.printf( "%d positivo(s)\n", ret[2] );
        System.out.printf( "%d negativo(s)", ret[3] );
    }

    /**
     * Count number of positives negatives odd and even.
     */
    public static int[] numberAnalysis(int[] nums) {
        int pos = 0, neg = 0, odd = 0, eve = 0;

        for ( int i = 0; i < nums.length; i++ ) {
            int n = nums[i];

            //check if odd or even
            if ( n % 2 == 0 ) {
        	    eve++;
            } else {
                odd++;
            }
            
            //check if positive or negative
            if ( n != 0 ) {
                if ( n > 0 ) {
                    pos++;
                } else {
                    neg++;
                }
            }
        }

        return new int[] { eve, odd, pos, neg };
    }
}
