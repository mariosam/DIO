/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class MacPronalts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
            int[] prods = new int[N];
        int[] qtds  = new int[N];

        for ( int i=0; i < N; i++ ) {
            prods[i] = sc.nextInt();
			      qtds[i]  = sc.nextInt();
        }
		    sc.close();

        System.out.printf("%.2f\n", shopValue( prods, qtds ));
	}

    /**
     * Multiply product value by quantity and return the total.
     */
    public static double shopValue(int[] prods, int[] qtds) {
        double result = 0;

        for ( int i=0; i < prods.length; i++ ) {
          switch ( prods[i] ) {
            case 1001:
              result += 1.50 * qtds[i];
              break;
            case 1002:
              result += 2.50 * qtds[i];
              break;
            case 1003:
              result += 3.50 * qtds[i];
              break;
            case 1004:
              result += 4.50 * qtds[i];
              break;
            case 1005:
              result += 5.50 * qtds[i];
              break;
          }
        }

        return result;
    }
}
