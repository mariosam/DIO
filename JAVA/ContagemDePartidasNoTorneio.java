/**
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package JAVA;

import java.util.Scanner;

public class ContagemDePartidasNoTorneio {

    public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int teams = sc.nextInt();
		sc.close();

        System.out.println( numberOfGames(teams) );
	}

    /**
     * Based on the number of teams, returns the number of games.
     */
    public static int numberOfGames(int teams) {
        int games = 0;

        while ( teams > 1 ) {
            if ( teams%2 == 0 ) {
                teams = teams/2; 
                games += teams;
            } else {
                teams = (teams-1)/2;
                games += teams;
                teams++;
            }
        }

        return games;
    }
}
