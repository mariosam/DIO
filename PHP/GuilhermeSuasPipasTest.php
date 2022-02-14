<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("GuilhermeSuasPipas.php");

class GuilhermeSuasPipasTest extends TestCase {

    public function testGuilhermeSuasPipas() {
        $obj = new GuilhermeSuasPipas();
        //Test 1
        $want = 2;
        $got = $obj->numberOfTwine(4);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 35;
        $got = $obj->numberOfTwine(10);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 44;
        $got = $obj->numberOfTwine(11);
        $this->assertEquals($want, $got);
    }

}
