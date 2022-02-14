/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class GuilhermeSuasPipas {

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();
        sc.close();
        
        System.out.println( numberOfTwine(x) );
	  }

    /**
     * Realize how much twine is necessary.
     */
    public static int numberOfTwine(int n) {
        return ((n * n) - (3 * n)) /2;
    }
}
