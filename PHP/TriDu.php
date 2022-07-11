<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+greatestCard(2, 2);

class TriDu {

    /**
     * Check what it is the greatest card.
     */
    public function greatestCard($A = 0, $B = 0): int {
        $result = $A;

        if ($B > $A) {
            $result = $B;
        }

        return $result;
    }

}
