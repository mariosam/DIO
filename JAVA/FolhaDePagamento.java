/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) throws IOException {
		    Scanner sc   = new Scanner( System.in );
        int colab    = sc.nextInt();
        int time     = sc.nextInt();
        double value = sc.nextDouble();
        sc.close();
            
        System.out.println("NUMBER = " + colab);
        System.out.println("ALTURA = " + calcSalary( time, value ) );
	  }

    /**
     * Calculate worktime by timevalue.
     */
    public static double calcSalary(int t, double v) {
        return t * v;
    }
}
