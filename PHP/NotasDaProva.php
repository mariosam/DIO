<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+takeResult(22);

define("A", "A");
define("B", "B");
define("C", "C");
define("D", "D");
define("E", "E");

class NotasDaProva {

    /**
     * Identify the final score points.
     */
    public function takeResult($pos) {
        $result = E;

        if ( $pos > 85 ) {
            $result = A;
        } else if ( $pos > 60 ) {
            $result = B;
        } else if ( $pos > 35 ) {
            $result = C;
        } else if ( $pos > 0 ) {
            $result = D;
        }

        return $result;
    }

}
