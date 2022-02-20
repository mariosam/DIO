<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+checkMyList(["laranja", "pera"]);

class ComprasNoSupermercado {

    /**
     * Remove duplicates and organize my list.
     */
    public function checkMyList($items) {
        $result = array();

        foreach ($items as &$item) {
            if (!in_array($item, $result, true)) {
                array_push($result, $item);
            }
        }
    
        sort($result);
        return $result;
    }
}
