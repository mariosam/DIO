/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ProgramaValidacaoDeNotas {

    private final static String NOTAINVALIDA = "nota invalida";
    private final static String MEDIA = "media = ";
    private final static String NOVOCALCULO = "novo calculo (1-sim 2-nao)";

    private static double n1 = -1.0, n2 = -1.0;
    private static Stack<String> arr = new Stack<String>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );

        //fullfill with entries data
        String[] lines = new String[]{};
        int i = 0;
        while ( sc.hasNext() ) {
            String v = sc.nextLine();
            lines[i] = v;
            i++;
        }
        sc.close();
         
        //fullfill with output data
        String[] res = startSystem( lines );
        //print result
        for (String s : res) {
            System.out.println( s );
        }
    }

    /**
     * Control the calls to the systems checks.
     */
    public static String[] startSystem(String[] nums) {
        for ( int i=0; i < nums.length; i++ ) {
            if ( checkNumber( nums[i] ) == false ) {
                if ( Integer.parseInt( nums[i] ) == 2 ) break;
    
                if ( checkSystem( Integer.parseInt( nums[i] ) ) == false ) {
                    arr.push( NOVOCALCULO );
                    continue;
                }
                i++;
            }
            scoreValidate( Double.parseDouble( nums[i] ) );
        }

        String[] saida = new String[arr.size()];
        for (int i=0; i < arr.size(); i++) {
            saida[i] = arr.elementAt(i);
        }
    
        return saida;
    }

    /**
     * Check if is a valida score to sum.
     */
    private static boolean checkNumber(String num) {
        return num.contains(".");
    }
    
    /**
     * Check if must continue or stop.
     */
    private static boolean checkSystem(int num) {
        return num == 1 ? true : false;
    }

    /**
     * Check the entry and do the math to score.
     */
    private static void scoreValidate(double num) {
        if ( num >= 0 && num <= 10 ) {
            if ( n1 > -1 ) {
                n2 = num;
            } else {
                n1 = num;
            }
    
            if ( n2 > -1 ) {
                double average = ((n1+n2) / 2);
    
                arr.push( (MEDIA+ String.format("%.2f", average).replaceAll(",", ".")) );
                arr.push( NOVOCALCULO );
    
                n1 = -1; n2 = -1;
            }
        } else {
            arr.push( NOTAINVALIDA );
        }
    }
}
