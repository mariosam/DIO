<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TopN.php");

class TopNTest extends TestCase {

    public function testTopN() {
        $obj = new TopN();
        //Test 1
        $want = "Top 10";
        $got = $obj->topRange(7);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Top 25";
        $got = $obj->topRange(25);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Top 50";
        $got = $obj->topRange(26);
        $this->assertEquals($want, $got);
    }

}
