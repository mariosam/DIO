<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("CoxinhaDeBueno.php");

class CoxinhaDeBuenoTest extends TestCase {

    public function testCoxinhaDeBueno() {
        $obj = new CoxinhaDeBueno();
        //Test 1
        $want = "0.11";
        $got = $obj->calcCoxinha(10, 90);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "76.36";
        $got = $obj->calcCoxinha(840, 11);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "0.02";
        $got = $obj->calcCoxinha(1, 50);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "0.10";
        $got = $obj->calcCoxinha(9, 90);
        $this->assertEquals($want, $got);
    }

}
