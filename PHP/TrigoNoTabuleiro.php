<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+cornToReceive(8);

class TrigoNoTabuleiro {

    /**
     * Calculate the amount of corn to delivery.
     */
    public function cornToReceive($x): int {
        $amount = pow(2, $x);

        return $amount / 12000;
    }

}
