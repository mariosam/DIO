<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+maxDevices(6, 6, 6, 6);

class Tomadas {

    /**
     * Calculate the number max of devices can be pluged.
     */
    public function maxDevices($t1, $t2, $t3, $t4): int {
        return ($t1 + $t2 + $t3 + $t4) - 3;
    }

}
