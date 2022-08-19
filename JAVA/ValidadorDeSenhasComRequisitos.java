/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ValidadorDeSenhasComRequisitos {

    private final static String VALIDO = "Senha valida.";
    private final static String INVALIDO = "Senha invalida.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass = sc.next();
        while ( pass != "" ) {
            System.out.println( passwordValidator( pass ) ); 
            pass = sc.next();
        }
		sc.close();
	}

    /**
     * Check if password is valid.
     */
    public static String passwordValidator(String pwd) {
        String result = VALIDO;

        //valida o tamanho
        if ( pwd.length() < 6 || pwd.length() > 32 ) {
            result = INVALIDO;
        //valida se possui espacos ou caracteres nao alphanumericos
        } else if ( pwd.matches(".*\\s.*") || !pwd.matches("[a-zA-Z0-9]+") ) {
            result = INVALIDO;
        //valida se possui elementos obrigatorios (maiusculas, minusculas, e numeros)
        } else if (!pwd.matches(".*[A-Z].*") || !pwd.matches(".*[a-z].*") || !pwd.matches(".*[0-9].*") ) {
            result = INVALIDO;
        }

        return result;
    }
}
