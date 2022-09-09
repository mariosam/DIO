<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+calcTotalToPay({1001, 1005}, {2, 3});

class CalculoSimples {

    /**
     * Multiply product value by quantity and return the total.
     */
    public function calcTotalToPay($pecas1, $pecas2) {
        return ($pecas1[1] * $pecas1[2]) + ($pecas2[1] * $pecas2[2]);
    }

}
