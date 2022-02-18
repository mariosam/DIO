/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.printf("%.1f\n", binetFormule( n ));
	  }

    /**
     * Fibonacci value using Binet formule.
     */
    public static double binetFormule(int N) {
        return (Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5);
    }
}
