<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [8, 5, 12, 16]);

class MensagemDoPadreDoBalao {

    /**
     * Decode the message.
     */
    public function decodeMsg($a, $nums) {
        $result = "";

        foreach ($nums as $n) {
            $result .= $a[(int)$n - 1];
        }

        return $result;
    }

}
