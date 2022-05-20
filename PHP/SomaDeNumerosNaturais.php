<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+sumAllNaturals(8,8);

class SomaDeNumerosNaturais {

    /**
     * Sum all natural numbers from A to B
     */
    public function sumAllNaturals($a = 0, $b = 0): int {
        return ($b - $a + 1) * ($a + $b)/2;
    }

}
