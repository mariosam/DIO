<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+howManyOrdersPerPeople(13);

class ReveillonDeCopacabana {

    /**
     * Cont how many orders will be delivered per people.
     */
    public function howManyOrdersPerPeople($people = 0): int {
        $result = 0;

        if ( $people % 2 !== 0 ) {
            $result = ($people * 2) - 1;
        } else {
            $result = ($people * 2) - 2;
        }

        return $result;
    }

}
