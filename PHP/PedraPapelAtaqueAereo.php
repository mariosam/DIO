<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+jokenpoWinner(4, 4);

define("ATAQUE", "ataque");
define("PAPEL", "papel");
define("PEDRA", "pedra");
define("P1_WIN", "Jogador 1 venceu");
define("P2_WIN", "Jogador 2 venceu");
define("BOTH_WIN", "Ambos venceram");
define("NO_WINNER", "Sem ganhador");
define("ANIQUILATION", "Aniquilacao mutua");

class PedraPapelAtaqueAereo {

    /**
     * Check who is the winner of the game Jokenpo.
     */
    public function jokenpoWinner($p1 = "", $p2 = "") {
        $result = P2_WIN;
        $p1 = strtolower($p1);
        $p2 = strtolower($p2);

        if ( $p1 === ATAQUE && $p2 === ATAQUE ) {
            $result = ANIQUILATION;
        } else if ( $p1 === PEDRA && $p2 === PEDRA ) {
            $result = NO_WINNER;
        } else if ( $p1 === PAPEL && $p2 === PAPEL ) {
            $result = BOTH_WIN;
        } else if ( $p1 === ATAQUE && $p2 === PEDRA || $p2 === PAPEL ) {
            $result = P1_WIN;
        } else if ( $p1 === PEDRA && $p2 === PAPEL ) {
            $result = P1_WIN;
        }

        return $result;
    }

}
