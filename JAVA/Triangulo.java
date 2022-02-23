/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) throws IOException {
		    Scanner sc   = new Scanner( System.in );
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
            
        System.out.println( calcArea( a, b, c ) );
	}

    /**
     * Calculate area or perimeter.
     */
    public static String calcArea(double a, double b, double c) {
        String result = "";
        double maior = c;
        double soma = b + a;

        if ( a > b && a > c ) maior = a;
        else if ( b > c ) maior = b;

        if ( maior == a ) soma = b + c;
        else if ( maior == b ) soma = a + c;

        if ( soma > maior ) {
            result = "Perimetro = " + (a + b + c);
        } else {
            result = "Area = " + (((a + b) * c)/2);
        }

        return result;
    }
}
