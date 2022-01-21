/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class FasesDaLua {

    private final static String NOVA        = "nova";
    private final static String CRESCENTE   = "crescente";
    private final static String CHEIA       = "cheia";
    private final static String MINGUANTE   = "minguante";

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
		    sc.close();

        System.out.println( moonFase(d1, d2) );
	}

    /**
     * Check the fase of the Moon.
     */
    public static String moonFase(int day1, int day2) {
        String result = CHEIA;

        if (day1 >= 0 && day2 <= 2) {
            result = NOVA;
        } else if (day2 > day1 && day2 <= 96) {
            result = CRESCENTE;
        } else if (day1 >= day2 && day2 <= 96) {
            result = MINGUANTE;
        } 

        return result;
    }
}
