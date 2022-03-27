<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+howManyToys( ["Milena F", "Joao M", "Rafaela F", "Renata F", "Felipe M"] );

class BrinquedosDoPapaiNoel {

    /**
     * Count how many boys and girls do we have to count each toys.
     */
    public function howManyToys($inputs = array()) {
        $boys = 0;

        for ( $i=0; $i < sizeof($inputs); $i++ ) {
            if ( strtoupper( substr($inputs[$i], -1) ) == 'M' ) $boys++;
        }
        
        return [ $boys, sizeof($inputs)-$boys ];
    }

}
