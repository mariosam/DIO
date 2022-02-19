<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+possibleTravel(2, 4, 3);

define("N", "N");
define("S", "S");

class AndandoNoTempo {

    /**
     * Check if is possible to travel in time.
     */
    public function possibleTravel($a, $b, $c) {
        $result = N;

        if ( $a == $b || $b == $c || $a == $c || $a+$b==$c || $a+$c==$b || $b+$c ==$a ) $result = S;

        return $result;
    }

}
