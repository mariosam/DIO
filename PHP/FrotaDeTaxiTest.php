<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FrotaDeTaxi.php");

class FrotaDeTaxiTest extends TestCase {

    public function testFrotaDeTaxi() {
        $obj = new FrotaDeTaxi();
        //Test 1
        $want = "A";
        $got = $obj->moreEconomic(1.20, 2.30, 10.00, 15.00);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "G";
        $got = $obj->moreEconomic(1.00, 1.00, 9.00, 9.01);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "G";
        $got = $obj->moreEconomic(1.00, 1.00, 11.00, 11.00);
        $this->assertEquals($want, $got);
    }

}
