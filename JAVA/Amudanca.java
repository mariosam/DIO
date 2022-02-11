/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class Amudanca {

    private final static String DIA   = "Bom Dia!!";
    private final static String TARDE = "Boa Tarde!!";
    private final static String NOITE = "Boa Noite!!";
    private final static String MADRU = "De Madrugada!!";

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );

        while ( sc.hasNextInt() ) {
            System.out.println( salutation( sc.nextInt() ) );
        }
        sc.close();
	}

    /**
     * Return the best salutation based on sun time.
     */
    public static String salutation(int graus) {
        String result = MADRU;

        if ( graus == 360 || graus >= 0 && graus < 90 ) result = DIA;
        else if ( graus >= 90 && graus < 180 ) result = TARDE;
        else if ( graus >= 180 && graus < 270 ) result = NOITE;

        return result;
    }
}
