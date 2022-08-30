<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("PinkCerebro.php");

class PinkCerebroTest extends TestCase {

    public function testPinkCerebro() {
        $obj = new PinkCerebro();
        //Test 1
        $want = [4, 0, 2, 3];
        $got = $obj->getMultiples( [2, 5, 4, 20, 10] );
        echo "\nTest 1: retornou " . json_encode($got) . " == esperado: " . json_encode($want);
        $this->assertEquals($want, $got);
        //Test 2
        $want = [1, 0, 1, 1];
        $got = $obj->getMultiples( [100] );
        echo "\nTest 2: retornou " . json_encode($got) . " == esperado: " . json_encode($want);
        $this->assertEquals($want, $got);
        //Test 3
        $want = [1, 1, 1, 1];
        $got = $obj->getMultiples( [3, 4, 5] );
        echo "\nTest 3: retornou " . json_encode($got) . " == esperado: " . json_encode($want);
        $this->assertEquals($want, $got);
    }

}
