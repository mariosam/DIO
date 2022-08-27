/**
 * @version JAVA 1.8
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        sc.close();

        System.out.println( reportMinutes( N, 2 ) );
	}

    /**
     * Calculate the minutes based on the distance and the speed.
     */
    public static int reportMinutes(int km, int speed) {
        return km * speed;
    }
}
