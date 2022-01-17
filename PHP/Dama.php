<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+minMoviments(4, 4, 6, 2);

class Dama {

    /**
     * Inform the minimun of moviments required.
     */
    public function minMoviments($x1, $y1, $x2, $y2): int {
        $result = 2;

        if ($x1 == $x2 && $y1 == $y2) {
            $result = 0;
        } else if ($x1 == $x2 || $y1 == $y2 || abs($x1-$x2) == abs($y1-$y2)) {
            $result = 1;
        }

        return $result;
    }

}
