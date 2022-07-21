/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
		int A = sc.nextInt();
		double B = sc.nextDouble();
		sc.close();

        System.out.println( averageConsumption(A, B) + " km/l");
	}

    /**
     * Return the average consumption of the car.
     */
    public static double averageConsumption(int a, double b) {
        return (a / b);
    }
}
