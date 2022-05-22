/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class SomaDeNumerosNaturais {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

        System.out.println( sumAllNaturals(A, B) );
	}

    /**
     * Sum all natural numbers from A to B
     */
    public static int sumAllNaturals(int a, int b) {
        return (b * (b + 1)) / 2 - (a * (a - 1)) / 2;
    }
}
