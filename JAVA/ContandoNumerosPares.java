/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ContandoNumerosPares {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int num = sc.nextInt();
		sc.close();

        System.out.println( countEven( num ) );
	}

    /**
     * Get a number and sum all even digits. 
     */
    public static int countEven(int num) {
        int count = 0;

        for ( int i=1; i <= num; i++ ) {
            //controle para 1 digito
            if ( String.valueOf(i).length() == 1 ) {
                //se for par
                if (i%2 == 0) count++;
                continue;
            }
            
            //controle para multiplos digitos
            char[] multi = String.valueOf(i).toCharArray();
            int sum = 0;
            for ( int x=0; x < multi.length; x++ ) {
                sum += (int) Character.getNumericValue(multi[x]);
            }

            //se for par
            if (sum%2 == 0) count++;
        }

        return count;
    }
}
