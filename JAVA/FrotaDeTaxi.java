/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class FrotaDeTaxi {

    public static void main(String[] args) throws IOException {
		    Scanner sc   = new Scanner( System.in );
        double precoAlcool        = sc.nextDouble();
        double precoGasolina      = sc.nextDouble();
        double rendimentoAlcool   = sc.nextDouble();
        double rendimentoGasolina = sc.nextDouble();
        sc.close();

        System.out.println( moreEconomic( precoAlcool, precoGasolina, rendimentoAlcool, rendimentoGasolina ) );
	}

    /**
     * Return the more economic combustivel.
     */
    public static String moreEconomic(double a, double g, double ra, double rg) {
        String result = "A";
        double precoPorKmAlcool = a / ra;
        double precoPorKmGasolina = g / rg;

        if ( precoPorKmGasolina <= precoPorKmAlcool ) result = "G";
        
        return result;
    }
}
