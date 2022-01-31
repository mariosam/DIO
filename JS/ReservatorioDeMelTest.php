<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ReservatorioDeMel.php");

class ReservatorioDeMelTest extends TestCase {

    public function testReservatorioDeMel() {
        $obj = new ReservatorioDeMel();
        //Test 1
        $want = 2.96;
        $got = $obj->getHigh(1450.00, 25.00);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 0.61;
        $got = $obj->getHigh(760.00, 40.00);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 42.46;
        $got = $obj->getHigh(7500.00, 15.00);
        $this->assertEquals($want, $got);

        //Test 1
        $want = 490.62;
        $got = $obj->getArea(25.00);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 1256.00;
        $got = $obj->getArea(40.00);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 176.62;
        $got = $obj->getArea(15.00);
        $this->assertEquals($want, $got);
    }

}
