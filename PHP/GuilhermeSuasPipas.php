<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+numberOfTwine(4);

class GuilhermeSuasPipas {

    /**
     * Realize how much twine is necessary.
     */
    public function numberOfTwine($n): int {
        return (($n * $n) - (3 * $n)) /2;
    }

}
