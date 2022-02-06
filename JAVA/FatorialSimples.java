/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class FatorialSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();

        System.out.println( simpleFactorial(N) );
	}

    /**
     * Return the factorial number.
     */
    public static int simpleFactorial(int N) {
        int result = 1;
        N++;

        while ( N > 1 ) {
            result = result * (N-1); 
            N--;
        } 

        return result;
    }
}
