/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ReduzindoUmNumeroZero {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		sc.close();

        System.out.println( reduceNumber( num ) );
	}

    /**
     * Get a number and reduce to zero.
     */
    public static int reduceNumber(int num) {
        int times = 0;

        while ( num > 0 ) {
            times++;

            //se for par
            if ( num%2 == 0 ) {
                num = num / 2; 
            } else {
                num = num - 1;
            }
        }

        return times;
    }
}
