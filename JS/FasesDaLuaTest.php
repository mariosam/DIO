<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("FasesDaLua.php");

class FasesDaLuaTest extends TestCase {

    public function testFasesDaLua() {
        $obj = new FasesDaLua();
        //Test 1
        $want = "nova";
        $got = $obj->moonFase(0, 2);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "crescente";
        $got = $obj->moonFase(2, 3);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "cheia";
        $got = $obj->moonFase(99, 97);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "minguante";
        $got = $obj->moonFase(97, 94);
        $this->assertEquals($want, $got);
        //Test 5
        $want = "crescente";
        $got = $obj->moonFase(30, 35);
        $this->assertEquals($want, $got);
    }

}
