/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int days = sc.nextInt();
        sc.close();

        int[] out = splitAgeDays( days );
        System.out.printf( "%d ano(s)\n%d mes(es)\n%d dia(s)\n", out[0], out[1], out[2] );
	}

    /**
     * Split age in days, month and year
     */
    public static int[] splitAgeDays(int days) {
        int year = (int) Math.floor(days / 365);
        int month = (int) Math.floor((days % 365) / 30);
        int day = days % 365 % 30;

        return new int[] {year, month, day};
    }
}
