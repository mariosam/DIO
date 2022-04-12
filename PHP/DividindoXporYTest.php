<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DividindoXporY.php");

class DividindoXporYTest extends TestCase {

    public function testDividindoXporY() {
        $obj = new DividindoXporY();
        //Test 1
        $want = "-1.5";
        $got = $obj->divTwoValues(3, -2);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "divisao impossivel";
        $got = $obj->divTwoValues(-8, 0);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "0.0";
        $got = $obj->divTwoValues(0, -8);
        $this->assertEquals($want, $got);
    }

}
