/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas {

    private final static int[] NOTAS = {100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
        int valor = sc.nextInt();
        sc.close();

        System.out.println( valor );

        int[] ar = countNotes( valor );
        for (int i=0; i < ar.length; i++) {
            System.out.println( ar[i]+" nota(s) de R$ "+NOTAS[i]+",00" );
        }
	}

    /**
     * Count the number of cedules to each note.
     */
    public static int[] countNotes(double total) {
        int[] arResult = new int[7];

        for (int i=0; i < arResult.length; i++ ) {
            if ( total >= NOTAS[i] ) {
                arResult[ i ] = (int) Math.floor( total / NOTAS[i] );

                total = total % NOTAS[i];
            } else {
                arResult[ i ] = 0;
            }
        }
        
        return arResult;
    }
}
