/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Dama {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;

        while (true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada

            System.out.println( minMoviments(x1, y1, x2, y2) );
        }
        sc.close();
	  }

    /**
     * Inform the minimun of moviments required.
     */
    public static int minMoviments(int x1, int y1, int x2, int y2) {
        int result = 2;

        if (x1 == x2 && y1 == y2) {
            result = 0;
        } else if (x1 == x2 || y1 == y2 || Math.abs(x1-x2) == Math.abs(y1-y2)) {
            result = 1;
        }

        return result;
    }
}
