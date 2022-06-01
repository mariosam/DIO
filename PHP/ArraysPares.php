<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+returnOnlyEven( [2, 3, 5, 7, 11, 13, 18, 34] );

class ArraysPares {

    /**
     * Return only even numbers from an array.
     */
    public function returnOnlyEven($inputs = array()) {
        $outputs = array();

        foreach ( $inputs as $input ) {
            if ( $input % 2 == 0 ) {
                $outputs[] = $input;
            }
        }

        return $outputs;
    }

}
