<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+evenOrOdd(["Quico", "PAR", "Chiquinha", "IMPAR", "9", "7"]);

class DeQuemEaVez {

    /**
     * Identify whos won the game Even or Odd.
     */
    public function evenOrOdd( $ops = [] ) {
        //player 1 and player 2: valores somados
        $sum = $ops[4] + $ops[5];
        $winner = $ops[0];

        //se for PAR, verifica quem escolheu par
        if ($sum % 2 == 0) {
            if ( $ops[3] == "PAR" ) {
                $winner = $ops[2];
            } 
        } else {
        //se for impar, verifica quem escolheu impar
            if ( $ops[3] == "IMPAR" ) {
                $winner = $ops[2];
            }
        }

        return $winner;
    }
}
