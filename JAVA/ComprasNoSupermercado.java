/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComprasNoSupermercado {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner( System.in );
        int nCasos = sc.nextInt();

        for (int i=0; i < nCasos; i++) {
            List<String> line = new ArrayList<String>( Arrays.asList( sc.nextLine().split(" ") ) );

            System.out.println( checkMyList( line ) );
        }
        sc.close();
    }

    /**
     * Remove duplicates and organize my list.
     */
    public static String[] checkMyList(List<String> items) {
        List<String> result = new ArrayList<String>();

        for (String item : items) {
            if (!result.contains(item)) {
                result.add( item );
            }
        }
    
        Collections.sort( result );
        return result.toArray(new String[0]);
    }
}
