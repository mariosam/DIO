/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ReservatorioDeMel {

    private final static double PI = 3.14;

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );
    	  DecimalFormat df = new DecimalFormat("0.00");

        while ( sc.hasNextDouble() ) {
            double volume   = sc.nextDouble();
            double diametro = sc.nextDouble();
            
            System.out.println("ALTURA = " + df.format( getHigh( volume, diametro ) ));
    		    System.out.println("AREA = " + df.format( getArea( diametro ) ));
        }
		    sc.close();
	}

    /**
     * Calculate and return the high of object.
     */
    public static double getHigh(double v, double d) {
        return v / (PI * ((d / 2) * (d / 2)));
    }

    /**
     * Calculate and return the area of object.
     */
    public static double getArea(double d) {
        return PI * ((d / 2) * (d / 2));
    }
}
