/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Pneu {

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        System.out.println( difPression(x, y) );
	  }

    /**
     * Calculate the difference pression.
     */
    public static int difPression(int x, int y) {
        return x - y;
    }
}
