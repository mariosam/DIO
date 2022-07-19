<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ConsumoMedioDoAutomovel.php");

class ConsumoMedioDoAutomovelTest extends TestCase {

    public function testConsumoMedioDoAutomovel() {
        $obj = new ConsumoMedioDoAutomovel();
        //Test 1
        $want = 14.286;
        $got = $obj->averageConsumption(500, 35.0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 18.119;
        $got = $obj->averageConsumption(2254, 124.4);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 9.802;
        $got = $obj->averageConsumption(4554, 464.6);
        $this->assertEquals($want, $got);
    }

}
