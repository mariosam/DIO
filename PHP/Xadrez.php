<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving internet code tests: hire me!
 */
namespace PHP;

//echo "The result is "+tableColor(8,8);

class Xadrez {

    /*
     * Do the math for identify if the square is white or black
     */
    public function tableColor($L, $C): int {
        $result = 0;

        if ( $L % 2 == $C % 2 ) {
            $result = 1;
        } 

        return $result;
    }

}
