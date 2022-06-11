/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        String[] lineX = sc.nextLine().split(" ");
        String[] lineY = sc.nextLine().split(" ");
        sc.close();

        System.out.println( getDistance( Float.parseFloat(lineX[0]), Float.parseFloat(lineX[1]), Float.parseFloat(lineY[0]), Float.parseFloat(lineY[1]) ) );
	}

    /**
     * Do the math: Calculate the distance between two points.
     */
    public static String getDistance(float x1, float y1, float x2, float y2) {
        return String.format("%.4f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))).replace(',', '.');
    }
}
