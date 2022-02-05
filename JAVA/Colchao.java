/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Colchao {

    private final static String SIM = "S";
    private final static String NAO = "N";

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();
        sc.close();
        
        System.out.println( checkSize(A, B, C, H, L) );
	}

    /**
     * Check if mattress pass through the door.
     */
    public static String checkSize(int A, int B, int C, int H, int L) {
        String result = NAO;

        if  ((A <= H && B <= L) || (A <= H && C <= L) || (B <= H && A <= L) || (B <= H && C <= L) || (C <= H && A <= L) || (C <= H && B <= L)) 
            result = SIM;

        return result;
    }
}
