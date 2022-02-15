<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+countDays(40.0);

class Blobs {

    /**
     * How many days do we have available food.
     */
    public function countDays($food): int {
        $result = 0;

        while ( $food > 1.0 ) {
            $result++;
            $food = $food/2;
        }

        return $result;
    }

}
