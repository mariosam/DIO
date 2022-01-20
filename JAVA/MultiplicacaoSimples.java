/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        
        System.out.println("PROD = " + getMulti(x, y));
	  }

    /**
     * Multiply two numbers.
     */
    public static int getMulti(int x, int y) {
        return x * y;
    }
}
