/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class CoxinhaDeBueno {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        String[] line = sc.nextLine().split(" ");
        sc.close();

        System.out.println( calcCoxinha( Integer.parseInt(line[0]), Integer.parseInt(line[1]) ) );
	}

    /**
     * Do the math: DIV two values.
     */
    public static String calcCoxinha(float h, float p) {
        return String.format("%.2f", (h / p) ).replace(",", ".");
    }
}
