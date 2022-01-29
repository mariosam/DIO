/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {

    private final static String BLOCKED = "Senha Invalida";
    private final static String GRANTED = "Acesso Permitido";
    private final static int SWORDFISH  = 2002;

    public static void main(String[] args) throws IOException {
		    Scanner sc = new Scanner( System.in );

        String back = "";
        while ( sc.hasNextInt() && !back.equals( GRANTED ) ) {
            back = checkPass( sc.nextInt() );
            System.out.println( back );
        }
		    sc.close();
	  }

    /**
     * Check if the password is valid.
     */
    public static String checkPass(int pass) {
        String result = BLOCKED;

        if ( pass == SWORDFISH ) result = GRANTED;

        return result;
    }
}
