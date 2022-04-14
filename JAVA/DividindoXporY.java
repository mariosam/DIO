/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class DividindoXporY {

    private final static String IMPOSSIVEL = "divisao impossivel";

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();

        for ( int i=0; i < N; i++ ) {
            String[] line = sc.nextLine().split(" ");

            System.out.println( divTwoValues( Integer.parseInt(line[0]), Integer.parseInt(line[1]) ) );
        }
        sc.close();
	}

    /**
     * Do the math: DIV two values.
     */
    public static String divTwoValues(float x, float y) {
        String result = IMPOSSIVEL;

        if ( y != 0 ) {
            float value = (x / y);
            
            result = String.format("%.1f", value).replace(",", ".");
        }

        return result;
    }
}
