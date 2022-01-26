/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class DDD {

    private final static String NONE = "DDD nao cadastrado";
    private final static String BRASILIA = "Brasilia";
    private final static String SALVADOR = "Salvador";
    private final static String SAOPAULO = "Sao Paulo";
    private final static String RIODEJANEIRO = "Rio de Janeiro";
    private final static String JUIZDEFORA = "Juiz de Fora";
    private final static String CAMPINAS = "Campinas";
    private final static String VITORIA = "Vitoria";
    private final static String BELOHORIZONTE = "Belo Horizonte";

    public static void main(String[] args) {
		    Scanner sc = new Scanner( System.in );
        int cod = sc.nextInt();
        sc.close();
        
        System.out.printf( dddCity(cod) );
	  }

    /**
     * Return the name of the city using DDD reference.
     */
    public static String dddCity(int cod) {
        String result = NONE;

        switch (cod) {
            case 61:
                result = BRASILIA;
                break;
            case 71:
                result = SALVADOR;
                break;
            case 11:
                result = SAOPAULO;
                break;
            case 21:
                result = RIODEJANEIRO;
                break;
            case 32:
                result = JUIZDEFORA;
                break;
            case 19:
                result = CAMPINAS;
                break;
            case 27:
                result = VITORIA;
                break;
            case 31:
                result = BELOHORIZONTE;
                break;
        }

        return result;
    }
}
