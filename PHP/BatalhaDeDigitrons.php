<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+winnerBattle(5, {12, 23, 15}, {42, 12, 20});

define("EMPATE", "Empate");
define("GUARTE", "Guarte");
define("BRUNO",  "Bruno");

class BatalhaDeDigitrons {

    /**
     * Sum attacks defenses bonus and pick a winner.
     */
    public function winnerBattle($B, $P1, $P2) {
        $result = EMPATE;

        //dont need these vars, it is just to you read the logic easyst.
        $Ai1 = $P1[0];
        $Ai2 = $P2[0];
        $Di1 = $P1[1];
        $Di2 = $P2[1];
        $Li1 = $P1[2];
        $Li2 = $P2[2];

        $Points1 = ( ($Ai1+$Di1)/2 ) + ($Li1 % 2 == 0 ? $B : 0);
        $Points2 = ( ($Ai2+$Di2)/2 ) + ($Li2 % 2 == 0 ? $B : 0);

        if ( $Points1 > $Points2 ) $result = BRUNO;
    	  else if ( $Points1 < $Points2 ) $result = GUARTE;

        return $result;
    }

}
