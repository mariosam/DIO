/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class TriangulosPoligonosRegulares {

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        sc.close();
        
        System.out.println( minTriangules(x) );
	  }

    /**
     * Return the number of necessary triangules to compose a poligono.
     */
    public static int minTriangules(int x) {
        return x - 2;
    }
}
