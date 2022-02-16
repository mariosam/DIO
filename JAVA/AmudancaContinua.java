/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AmudancaContinua {

    private final static String DIA   = "Bom Dia!!";
    private final static String TARDE = "Boa Tarde!!";
    private final static String NOITE = "Boa Noite!!";
    private final static String MADRU = "De Madrugada!!";

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );

        while ( sc.hasNextDouble() ) {
            double graus = sc.nextDouble();
            
            if ( graus <= 360 ) {
                String[] ar = salutationTime( graus );

                System.out.println( ar[0] );
                System.out.printf("%s:%s:%s%n", ar[1], ar[2], ar[3]);
            }
        }
        sc.close();
	  }

    /**
     * Return the best salutation and timezone based on sun time.
     */
    public static String[] salutationTime(double graus) {
        DecimalFormat df = new DecimalFormat("00");
        String salut = MADRU;
        double hour = 0.0, min = 0.0, sec = 0.0;

        if ( graus == 360 || graus >= 0 && graus < 90 ) salut = DIA;
        else if ( graus >= 90 && graus < 180 ) salut = TARDE;
        else if ( graus >= 180 && graus < 270 ) salut = NOITE;

        hour = ((graus * 4.0) / 60.0) + 6.0;
        if ( graus >= 270 ) hour = ((graus - 270.0) * 4.0) / 60.0;

        min = (hour * 60.0) % 60.0;
	      sec = (min * 60.0) % 60.0;

        if ( sec > 59 ) {
            sec = 0.0;
            min += 1.0;
        }

        return new String[] { salut, df.format( Math.floor(hour) ), df.format( min ), df.format( sec ) };
    }
}
