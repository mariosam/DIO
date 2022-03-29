/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class BrinquedosDoPapaiNoel {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int N = sc.nextInt();
        String[] inputs = new String[N];
        for ( int i=0; i < N; i++ ) {
            inputs[i] = sc.next();
        }
        sc.close();

        int[] ar = howManyToys( inputs );
        System.out.printf( "$d carrinhos\n$d bonecas", ar[0], ar[1] ); 
	}

    /**
     * Count how many boys and girls do we have to count each toys.
     */
    public static int[] howManyToys(String[] inputs) {
        int boys = 0;

        for ( int i=0; i < inputs.length; i++ ) {
            if ( inputs[i].charAt( inputs[i].length()-1 ) == 'M' ) boys++;
        }

        return new int[] { boys, inputs.length-boys };
    }
}
