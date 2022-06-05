<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+forbidenUnder18( [4, 18, 22, 15, 50] );

class ProibidoEntradaDeMenores {

    /**
     * Forbiden to enter less than 18 years old.
     */
    public function forbidenUnder18($ages = []) {
        $forbiden = [];

        foreach ($ages as $age) {
            if ($age < 18) $forbiden[] = $age;
        }

        return $forbiden;
    }

}
