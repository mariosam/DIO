<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+resultOfSum( [3, 11, 7, 18] );

class QuemPagaraConta {

    /**
     * Return the result of sum of all numbers in the array
     */
    public function resultOfSum($inputs = array()) {
        $outputs = array();

        foreach ( $inputs as $input ) {
            $outputs[] = $input%2;
        }

        return $outputs;
    }

}
