<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//printBox("|", " ");

class Saida1 {

    /**
     * Print the sysmbols.
     */
    public function printBox($n1, $n2) {
        $result = "\n".$n1;
	    for ( $i=0; $i < 37; $i++ ) $result .= $n2;
	    $result .= $n1."\n";

        echo $result;
    }

}
