/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class VisitaNaFeira {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.printf( "X = %d\n", totalPeppers(a, b) );
	}

    /**
     * Calculate the numbers of peppers.
     */
    public static int totalPeppers(int a, int b) {
        return a + b;
    }
}
