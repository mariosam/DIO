<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ContandoNumerosPares.php");

class ContandoNumerosParesTest extends TestCase {

    public function testContandoNumerosPares() {
        $obj = new ContandoNumerosPares();
        //Test 1
        $want = 2;
        $got = $obj->countEven(4);
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = 14;
        $got = $obj->countEven(30);
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
