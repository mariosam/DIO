/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Patinhos {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        
        while ( n != - 1 ) {
            System.out.println( returnedDucks( n ) );

            n = sc.nextInt();
        }
        sc.close();
	}

    /**
     * Calculate how many ducks are returned.
     */
    public static int returnedDucks(int ducks) {
        if ( ducks > 0 ) ducks--;
        
        return ducks;
    }
}
