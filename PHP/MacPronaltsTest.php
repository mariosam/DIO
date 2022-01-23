<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("MacPronalts.php");

class MacPronaltsTest extends TestCase {

    public function testMacPronalts() {
        $obj = new MacPronalts();
        //Test 1
        $want = 19.50;
        $got = $obj->shopValue([1001, 1005], [2, 3]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 1750.00;
        $got = $obj->shopValue([1003], [500]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 2808.50;
        $got = $obj->shopValue([1001, 1005, 1003, 1002, 1004], [500, 300, 23, 52, 44]);
        $this->assertEquals($want, $got);
    }

}
