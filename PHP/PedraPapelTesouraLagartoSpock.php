<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+jokenpoSpock(4, 4);

define("EMPATE", "empate");
define("MARCIA", "Marcia");
define("FERNANDA", "Fernanda");

class PedraPapelTesouraLagartoSpock {

    const dicionario = array(
        "pedra" => array("tesoura", "lagarto"),
        "papel" => array("pedra", "spock"),
        "tesoura" => array("papel", "lagarto"),
        "lagarto" => array("spock", "papel"),
        "spock" => array("pedra", "tesoura")
    );

    /**
     * Check who is the winner of the game Jokenpo Spock.
     */
    public function jokenpoSpock($p1 = "", $p2 = "") {
        $result = EMPATE;

        if (in_array($p1, self::dicionario[$p2])) {
            $result = MARCIA;
        } elseif (in_array($p2, self::dicionario[$p1])) {
            $result = FERNANDA;
        }

        return $result;
    }

}
