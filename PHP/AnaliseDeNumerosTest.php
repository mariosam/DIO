<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("AnaliseDeNumeros.php");

class AnaliseDeNumerosTest extends TestCase {

    public function testAnaliseDeNumeros() {
        $obj = new AnaliseDeNumeros();
        //Test 1
        $want = [3, 2, 1, 3];
        $got = $obj->numberAnalysis([-5, 0, -3, -4, 12]);
        $this->assertEquals($want, $got);
    }
}
