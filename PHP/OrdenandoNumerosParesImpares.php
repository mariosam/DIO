<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+orderOddsEvenNumbers( [4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98] );

class OrdenandoNumerosParesImpares {

    /**
     * Return numbers even asc and odd desc.
     */
    public function orderOddsEvenNumbers($inputs = array()) {
        $evens = array();
        $odds = array();
        
        //separate odd and even numbers
        foreach ( $inputs as $input ) {
            if ($input % 2 == 0) {
                $evens[] = $input;
            } else {
                $odds[] = $input;
            }
        }

        //put odd numbers in ascending order
        sort($evens);
        //put even numbers in descending order
        rsort($odds);

        return array_merge($evens, $odds);
    }

}
