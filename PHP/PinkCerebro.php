<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+getMultiples( [7, 3] );

class PinkCerebro {

    /**
     * Get the multiples of array numbers.
     */
    public function getMultiples($ar = []) {
        $result = [0,0,0,0];

        for ($i=0; $i < count($ar); $i++) {
            if ( $ar[$i] % 2 == 0 ) $result[0]++;
            if ( $ar[$i] % 3 == 0 ) $result[1]++;
            if ( $ar[$i] % 4 == 0 ) $result[2]++;
            if ( $ar[$i] % 5 == 0 ) $result[3]++;
        }

        return $result;
    }

}
