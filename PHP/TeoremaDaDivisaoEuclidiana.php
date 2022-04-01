<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+getQuoAndRest( 7, 3 );

class TeoremaDaDivisaoEuclidiana {

    /**
     * Get the quocient and rest of the division.
     */
    public function getQuoAndRest($a = 0, $b = 0) {
        $q = $a / $b;
        $r = $a % $b;

        if ( $r < 0 ) {
            $r += abs($b);

            $q = ($a - $r) / $b;
        }

        return [round($q,0), round($r,0)];
    }

}
