<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("CalculoSimples.php");

class CalculoSimplesTest extends TestCase {

    public function testCalculoSimples() {
        $obj = new CalculoSimples();
        //Test 1
        $want = 15.50;
        $got = $obj->calcTotalToPay([12, 1, 5.30], [16, 2, 5.10]);
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = 51.40;
        $got = $obj->calcTotalToPay([13, 2, 15.30], [161, 4, 5.20]);
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 3
        $want = 30.20;
        $got = $obj->calcTotalToPay([1, 1, 15.10], [2, 1, 15.10]);
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
