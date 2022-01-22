<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("QuantidadeNumerosPositivos.php");

class QuantidadeDeNumerosPositivosTest extends TestCase {

    public function testQuantidadeNumerosPositivos() {
        $obj = new QuantidadeNumerosPositivos();
        //Test 1
        $want = 4;
        $got = $obj->sumPositives([7, -5, 6, -3.4, 4.6, 12]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 6;
        $got = $obj->sumPositives([70, 67, 77, 99, 23, 1]);
        $this->assertEquals($want, $got);
    }

}
