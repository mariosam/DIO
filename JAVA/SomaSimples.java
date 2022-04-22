/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

        System.out.println( simpleSum(A, B) );
	}

    /**
     * Do the math: SUM two values.
     */
    public static int simpleSum(int a, int b) {
        return a + b;
    }
}
