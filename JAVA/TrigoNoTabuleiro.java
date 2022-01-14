/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;
import java.math.*;

public class TrigoNoTabuleiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();

		for ( int i=0 ; i<n ; i++ ) {
			System.out.printf("%d kg\n", cornToReceive( sc.nextInt() ) );
		}
		sc.close();
	}

    /**
     * Calculate the amount of corn to delivery.
     */
    public static BigInteger cornToReceive(int x) {
        BigInteger base = BigInteger.valueOf(2);
        BigInteger amount = base.pow(x);

        return amount.divide(BigInteger.valueOf(12000));
    }
}
