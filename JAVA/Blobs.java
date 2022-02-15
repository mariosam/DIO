/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Blobs {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();

        for ( int i=0; i < n; i++ ) {
            double food = sc.nextFloat();
        
            System.out.printf( "%d dias\n", countDays(food) );
        }
        sc.close();
    }

    /**
     * How many days do we have available food.
     */
    public static int countDays(double food) {
        int result = 0;

        while ( food > 1.0 ) {
            result++;
            food = food/2;
        }

        return result;
    }
}
