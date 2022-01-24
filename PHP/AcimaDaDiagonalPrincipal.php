<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+mathResult("S", {-19,0,-7,13,-4,46,...});

define("MEDIA", "M");

class AcimaDaDiagonalPrincipal {

    /**
     * Get only numbers above the line and check if is sum or average.
     */
    public function mathResult($ope, $nums) {
        $result = 0;
        $i = 0;

        for ( $x = 0; $x < 12; $x++ ) {
        	for ( $y = 0; $y < 12; $y++ ) {
        		$num = $nums[$i]; $i++;

        		if ( $y > $x ) $result += $num;
        	}
        }

        return round($ope === MEDIA ? $result/=66.0 : $result, 1);
    }

}
