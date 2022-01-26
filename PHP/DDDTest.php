<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DDD.php");

class DDDTest extends TestCase {

    public function testDDD() {
        $obj = new DDD();
        //Test 1
        $want = "Sao Paulo";
        $got = $obj->dddCity(11);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "DDD nao cadastrado";
        $got = $obj->dddCity(13);
        $this->assertEquals($want, $got);
    }

}
