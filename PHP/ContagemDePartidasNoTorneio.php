<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+numberOfGames(4);

class ContagemDePartidasNoTorneio {

    /**
     * Based on the number of teams, returns the number of games.
     */
    public function numberOfGames($teams = 0): int {
        $games = 0;

        while ( $teams > 1 ) {
            if ( $teams%2 == 0 ) {
                $teams = $teams/2; 
                $games += $teams;
            } else {
                $teams = ($teams-1)/2;
                $games += $teams;
                $teams++;
            }
        }
    
        return $games;
    }

}
