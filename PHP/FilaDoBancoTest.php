<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FilaDoBanco.php");

class FilaDoBancoTest extends TestCase {

    public function testFilaDoBanco() {
        $obj = new FilaDoBanco();
        //Test 1
        $want = 1;
        $got = $obj->changingPlaces([100, 80, 90]);
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want . "\n";
        $this->assertEquals($want, $got);
        //Test 2
        $want = 0;
        $got = $obj->changingPlaces([100, 120, 30, 50]);
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want . "\n";
        $this->assertEquals($want, $got);
        //Test 3
        $want = 4;
        $got = $obj->changingPlaces([100, 90, 30, 25]);
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want . "\n";
        $this->assertEquals($want, $got);
    }

}
