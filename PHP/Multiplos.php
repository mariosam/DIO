<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+areTheyMulti(4, 26);

define("SIM", "Sao Multiplos");
define("NAO", "Nao sao Multiplos");

class Multiplos {

    /**
     * Check if the numers are multiply.
     */
    public function areTheyMulti($x, $y) {
        $result = NAO;

        if ( $x%$y == 0 || $y%$x == 0 ) $result = SIM;

        return $result;
    }

}
