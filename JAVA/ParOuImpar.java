/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();

        for (int i=0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println( typeNumberMsg(x) );
            //System.out.println( typeNumberMsg(-8) );
        }
		sc.close();
	}

    /**
     * Check if number is positive negative even and/or odd
     */
    public static String typeNumberMsg(int x) {
        String result = "NULL";

        if ( x != 0 ) {
            //even or odd?
            if ( x%2 == 0 ) {
                result = "EVEN ";
            } else {
                result = "ODD ";
            }
            //positive or negative?
            if ( x > 0 ) {
                result += "POSITIVE";
            } else {
                result += "NEGATIVE";
            }
        }

        return result;
    }
}
