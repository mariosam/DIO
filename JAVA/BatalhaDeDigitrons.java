/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class BatalhaDeDigitrons {

    private final static String EMPATE = "Empate";
    private final static String BRUNO  = "Bruno";
    private final static String GUARTE = "Guarte";

    public static void main(String[] args) {
      Scanner sc = new Scanner( System.in );
      int n = sc.nextInt();

      for (int i=0; i < n; i++) {
          int bonus = sc.nextInt();
          int[] player1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
          int[] player2 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

          System.out.println( winnerBattle(bonus, player1, player2) );
      }
      sc.close();
    }

    /**
     * Sum attacks defenses bonus and pick a winner.
     */
    public static String winnerBattle(int B, int[] P1, int[] P2) {
        String result = EMPATE;

        //dont need these vars, it is just to you read the logic easyst.
        int Ai1 = P1[0];
        int Ai2 = P2[0];
        int Di1 = P1[1];
        int Di2 = P2[1];
        int Li1 = P1[2];
        int Li2 = P2[2];

        int Points1 = ( (Ai1+Di1)/2 ) + (Li1 % 2 == 0 ? B : 0);
        int Points2 = ( (Ai2+Di2)/2 ) + (Li2 % 2 == 0 ? B : 0);

        if ( Points1 > Points2 ) result = BRUNO;
    	  else if ( Points1 < Points2 ) result = GUARTE;

        return result;
    }
}
