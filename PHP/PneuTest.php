<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Pneu.php");

class PneuTest extends TestCase {

    public function testPneu() {
        $obj = new Pneu();
        //Test 1
        $want = 12;
        $got = $obj->difPression(30, 18);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 0;
        $got = $obj->difPression(27, 27);
        $this->assertEquals($want, $got);
        //Test 3
        $want = -3;
        $got = $obj->difPression(27, 30);
        $this->assertEquals($want, $got);
    }

}
