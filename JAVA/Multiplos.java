/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Multiplos {

    private final static String SIM = "Sao Multiplos";
    private final static String NAO = "Nao sao Multiplos";

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        System.out.println(  areTheyMulti(x, y) );
	  }

    /**
     * Check if the numers are multiply.
     */
    public static String areTheyMulti(int x, int y) {
        String result = NAO;

        if ( x%y == 0 || y%x == 0 ) result = SIM;

        return result;
    }
}
