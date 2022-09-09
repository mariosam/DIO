/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] line1 = sc.nextLine().split(" ");
		double[] p1 = { Double.parseDouble(line1[0]), Double.parseDouble(line1[1]), Double.parseDouble(line1[2]) };

		String[] line2 = sc.nextLine().split(" ");
		double[] p2 = { Double.parseDouble(line2[0]), Double.parseDouble(line2[1]), Double.parseDouble(line2[2]) };
		sc.close();

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", calcTotalToPay( p1, p2 ) ));
	}

    /**
     * Multiply product value by quantity and return the total.
     */
    public static double calcTotalToPay(double[] pecas1, double[] pecas2) {
        return (pecas1[1] * pecas1[2]) + (pecas2[1] * pecas2[2]);
    }
}
