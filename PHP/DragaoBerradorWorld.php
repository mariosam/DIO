<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+numberOfGuests([8, 160, 182], [160, 182, 183, 159, 250, 170, 172, 173]);

class DragaoBerradorWorld {

    /**
     * Put in the guesst list only people higher than MIN and lower than MAX size.
     */
    public function numberOfGuests( $inp = [], $ops = []) {
        $conta = 0;

        foreach ($ops as $op) {
            if ($op >= $inp[1] && $op <= $inp[2]) $conta++;
        }

        return $conta;
    }

}
