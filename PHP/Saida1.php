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
       echo "\n".$n1;
	     for ( $i=0; $i < 37; $i++ ) echo $n2;
	     echo $n1."\n";
    }

}
