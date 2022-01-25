<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+calcSalary(3, 200);

class FolhaDePagamento {

    /**
     * Calculate worktime by timevalue.
     */
    public function calcSalary($t, $v) {
        return round(($t * $v), 2);
    }

}
