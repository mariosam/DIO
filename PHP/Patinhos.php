<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+returnedDucks(4);

class Patinhos {

    /**
     * Calculate how many ducks are returned.
     */
    public function returnedDucks($ducks = 0): int {
        if ( $ducks > 0 ) $ducks--;
        
        return $ducks;
    }

}
