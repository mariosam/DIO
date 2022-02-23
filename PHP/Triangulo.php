<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+calcArea(1.20, 2.30, 10.00);

class Triangulo {

    /**
     * Calculate area or perimeter.
     */
    public function calcArea($a, $b, $c) {
        $result = "";
        $maior = $c;
        $soma = $b + $a;
    
        if ( $a > $b && $a > $c ) $maior = $a;
        else if ( $b > $c ) $maior = $b;
    
        if ( $maior == $a ) $soma = $b + $c;
        else if ( $maior == $b ) $soma = $a + $c;
    
        if ( $soma > $maior ) {
            $result = "Perimetro = ". number_format(($a + $b + $c), 1);
        } else {
            $result = "Area = ". number_format(((($a + $b) * $c)/2), 1);
        }

        return $result;
    }

}
