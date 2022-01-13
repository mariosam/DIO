/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int L = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        System.out.println( tableColor(L,C) );
	}

    /**
     * Do the math for identify if the square is white or black
     */
    public static int tableColor(int L, int C) {
        int result = 0;

        if ( L % 2 == C % 2 ) {
            result = 1;
        } 

        return result;
    }
}
