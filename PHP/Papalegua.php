<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+theFaster([9.81, 9.71]);

class Papalegua {

    /**
     * Get values and return the minor value, the faster one.
     */
    public function theFaster($arr) {
        $faster = 999;

        foreach ($arr as $value) {
            if ( $value < $faster ) $faster = $value;
        }

        return $faster;
    }

}
