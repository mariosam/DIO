<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+findTheBiggestSubstring(5, 6);

class EncontreMaiorSubstring {

    /**
     * Compare two strings and return the biggest substring that is common to both words.
     */
    public function findTheBiggestSubstring($w1 = "", $w2 = ""): int {
        for ($size = strlen($w1); $size >= 0; $size--) {
            for ($i = 0; $i <= strlen($w1) - $size; $i++) {
                $sub = substr($w1, $i, $size);

                if (!empty($sub) && strpos($w2, $sub) !== false) {
                    return $size;
                }
            }
        }
    
        return 0;
    }

}
