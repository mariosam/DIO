<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ReduzindoUmNumeroZero.php");

class ReduzindoUmNumeroZeroTest extends TestCase {

    public function testReduzindoUmNumeroZero() {
        $obj = new ReduzindoUmNumeroZero();
        //Test 1
        $want = 6;
        $got = $obj->reduceNumber(14);
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = 4;
        $got = $obj->reduceNumber(8);
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
