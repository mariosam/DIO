/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.io.IOException;
import java.util.Scanner;

public class DeQuemEaVez {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner( System.in );
        //prepara array de dados
        int n = sc.nextInt();
        String[][] ops = new String[n][6];

        //armazena dados de entrada em array
        int x = 0;
        while ( sc.hasNext() ) {
            //a entrada vem bugada com linha em branco entre os dados!!!
            String in = sc.nextLine();
            if (! in.trim().isEmpty() ) {
                String[] linha1 = in.split(" ");
                String[] linha2 = sc.nextLine().split(" ");

                ops[x][0] = linha1[0];
                ops[x][1] = linha1[1];
                ops[x][2] = linha1[2];
                ops[x][3] = linha1[3];
                ops[x][4] = linha2[0];
                ops[x][5] = linha2[1];
            
                x++;
            }
        }
		sc.close();

        //imprime resultado
        for (int i = 0; i < n; i++) {
            System.out.println(evenOrOdd(ops[i]));
        }
	}

    /**
     * Identify whos won the game Even or Odd.
     */
    public static String evenOrOdd(String[] ops) {
        //player 1 and player 2: valores somados
        int sum = Integer.parseInt( ops[4] ) + Integer.parseInt( ops[5] );

        String winner = ops[0];

        //se for PAR, verifica quem escolheu par
        if ( sum%2 == 0 ) {
            if ( ops[3].equalsIgnoreCase("PAR") ) {
                winner = ops[2];
            }
        } else {
        //se for impar, verifica quem escolheu impar
            if ( ops[3].equalsIgnoreCase("IMPAR") ) {
                winner = ops[2];
            }
        }

        return winner;
    }
}
