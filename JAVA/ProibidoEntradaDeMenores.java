/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProibidoEntradaDeMenores {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        //obtem tamanho do array
        int N = sc.nextInt();
        int[] ages = new int[N];
        //guarda os dados de entrada no array
        int x = 0;
        while ( sc.hasNext() ) {
            String in = sc.nextLine();
            //se nao for um espaco em branco (temos um numero)
            if (! in.trim().isEmpty() ) {
                ages[x] = Integer.parseInt(in);
                x++;
            }
        }
        sc.close();

        //imprime resultado
        int[] ar = forbidenUnder18( ages );
        System.out.println("Nao poderao entrar as idades: ");
        for (int result : ar) {
            System.out.println( result );
        }
	}

    /**
     * Forbiden to enter less than 18 years old.
     */
    public static int[] forbidenUnder18(int[] ages) {
        ArrayList <Integer> forbiden = new ArrayList<Integer>();

        for (int i = 0; i < ages.length; i++) {
            if ( ages[i] < 18 ) {
                forbiden.add( ages[i] );
            }
        }

        return forbiden.stream().mapToInt(Integer::intValue).toArray();
    }
}
