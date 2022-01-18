<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Lanche.php");

class LancheTest extends TestCase {

    public function testLanche() {
        $obj = new Lanche();
        //Test 1
        $want = 10.00;
        $got = $obj->totalToPay(3, 2);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 6.00;
        $got = $obj->totalToPay(4, 3);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 13.50;
        $got = $obj->totalToPay(2, 3);
        $this->assertEquals($want, $got);
    }

}
