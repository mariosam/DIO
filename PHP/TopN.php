<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+topRange(22);

define("TOP1", "Top 1");
define("TOP3", "Top 3");
define("TOP5", "Top 5");
define("TOP10", "Top 10");
define("TOP25", "Top 25");
define("TOP50", "Top 50");
define("TOP100", "Top 100");

class TopN {

    /**
     * Identify the range of position.
     */
    public function topRange($pos) {
        $result = TOP100;

        if ( $pos < 2 ) {
            $result = TOP1;
        } else if ( $pos < 4 ) {
            $result = TOP3;
        } else if ( $pos < 6 ) {
            $result = TOP5;
        } else if ( $pos < 11 ) {
            $result = TOP10;
        } else if ( $pos < 26 ) {
            $result = TOP25;
        } else if ( $pos < 51 ) {
            $result = TOP50;
        }

        return $result;
    }

}
