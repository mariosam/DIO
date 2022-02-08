/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class SomaImparesConsecutivos {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        System.out.println( oddsBetween(X, Y) );
	  }

    /**
     * How many odds do we have between two numbers.
     */
    public static int oddsBetween(int X, int Y) {
        int result = 0;

        if ( X < Y ) {
          for (int i=X+1; i<Y; i++) {
            if (i % 2 != 0) {
              result += i;
            }
          }
        } else {
          for (int i=Y+1; i<X; i++) {
            if (i % 2 != 0) {
              result += i;
            }
          }
        }

        return result;
    }
}
