<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("AndandoNoTempo.php");

class AndandoNoTempoTest extends TestCase {

    public function testAndandoNoTempo() {
        $obj = new AndandoNoTempo();
        //Test 1
        $want = "S";
        $got = $obj->possibleTravel(22, 5, 22);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "S";
        $got = $obj->possibleTravel(31, 110, 79);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "N";
        $got = $obj->possibleTravel(45, 8, 7);
        $this->assertEquals($want, $got);
    }

}
