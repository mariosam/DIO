/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class TesteDeSelecao1 {

    private final static String SIM = "Valores aceitos";
    private final static String NAO = "Valores nao aceitos";

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        
        System.out.println(  checkSequence(a, b, c, d) );
	  }

    /**
     * Check if order of numbers are valid.
     */
    public static String checkSequence(int a, int b, int c, int d) {
        String result = NAO;

        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) result = SIM;

        return result;
    }
}
