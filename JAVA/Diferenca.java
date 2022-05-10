/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
        sc.close();
        
        System.out.printf( "DIFERENCA = %d", showDifference(A, B, C, D) );
	}

    /**
     * Do the Math to show the difference between the numbers.
     */
    public static int showDifference(int A, int B, int C, int D) {
        return (A * B) - (C * D);
    }
}
