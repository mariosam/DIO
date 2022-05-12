<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+calcAverage([34, 56, 44, 23]);

class Idades {

    /**
     * Calculate and return the average of ages.
     */
    public function calcAverage( $ages = [] ) {
        $result = 0;

        if ( !empty( $ages ) ) {
            $result = array_sum( $ages ) / count( $ages );
        }

        return $result;
    }
}
