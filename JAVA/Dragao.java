/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class Dragao {

    private final static String MAISDE8000  = "Mais de 8000!";
    private final static String INSETO      = "Inseto!";

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        int input = sc.nextInt();

        for ( int i = 0; i < input; i++ ) {
            int nivelEnergia = sc.nextInt();

            System.out.println( checkEnergyLevel( nivelEnergia ) );    
        }
        sc.close();
	}

    /**
     * Return the drogon message about the energy level identified.
     */
    public static String checkEnergyLevel(int energy) {
        String result = INSETO;

        if ( energy > 8000 ) result = MAISDE8000;

        return result;
    }
}
