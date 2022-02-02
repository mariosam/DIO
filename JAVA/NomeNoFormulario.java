/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class NomeNoFormulario {

    private final static String YES = "YES";
    private final static String NO  = "NO";

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        String palavra = sc.nextLine();
        sc.close();
        
        System.out.println(  checkNameSize( palavra ) );
	  }

    /**
     * Check if the size of name is valid.
     */
    public static String checkNameSize(String name) {
        String result = NO;

        if ( name.trim().length() < 81 ) result = YES;

        return result;
    }
}
