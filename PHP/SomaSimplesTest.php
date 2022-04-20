<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("SomaSimples.php");

class SomaSimplesTest extends TestCase {

    public function testSomaSimples() {
        $obj = new SomaSimples();
        //Test 1
        $want = 40;
        $got = $obj->simpleSum(30, 10);
        $this->assertEquals($want, $got);
        //Test 2
        $want = -20;
        $got = $obj->simpleSum(-30, 10);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 0;
        $got = $obj->simpleSum(0, 0);
        $this->assertEquals($want, $got);
    }

}
