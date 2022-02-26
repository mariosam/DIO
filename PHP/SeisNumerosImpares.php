<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+printSixOdd(8);

class SeisNumerosImpares {

    /**
     * Print the next six odd.
     */
    function printSixOdd($x) {
        //if even transform in odd.
        $x = $x % 2 === 0 ? $x : $x-1;

        for ( $i=1; $i < 12; $i=$i+2 ) {
            echo "".$x+$i."\n";
        }
    }

}
