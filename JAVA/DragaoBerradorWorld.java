/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class DragaoBerradorWorld {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int[] inp = new int[]{Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])};
        int[] ops = new int[n];

        for (int i = 0; i < n; i++) {
            ops[i] = sc.nextInt();
        }
        sc.close();

        System.out.println( numberOfGuests(inp, ops) );
	}

    /**
     * Put in the guesst list only people higher than MIN and lower than MAX size.
     */
    public static int numberOfGuests(int[] inp, int[] ops) {
        int conta = 0;

        for (int op : ops) {
            if ( op >= inp[1] && op <= inp[2] ) conta++;
        }

        return conta;
    }
}
