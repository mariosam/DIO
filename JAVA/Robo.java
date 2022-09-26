/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class Robo {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
		sc.close();

        System.out.println( originPosition( in ) ); 
	}

    /**
     * Compare two commands and return the original position of robot.
     */
    public static boolean originPosition(String in) {
        //separa os 2 comandos
        char start = in.charAt(0);
        char end = in.charAt(1);

        //se os comandos forem iguais
        if ( start == end ) return false;

        //se for subir e descer
        if ( (start == 'W' && end == 'S') || (start == 'S' && end == 'W') ) return true;

        //se for esquerda e direita
        if ( (start == 'A' && end != 'W' && end != 'S') || (end == 'A' && end != 'W' && end != 'S') ) return true;
    
        //outras combinacoes sao invaldias
        return false;
    }
}
