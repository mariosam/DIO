<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+minTriangules(4);

class TriangulosPoligonosRegulares {

    /**
     * Return the number of necessary triangules to compose a poligono.
     */
    public function minTriangules($x): int {
        return $x - 2;
    }

}
