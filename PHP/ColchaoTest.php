<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Colchao.php");

class ColchaoTest extends TestCase {

    public function testColchao() {
        $obj = new Colchao();
        //Test 1
        $want = "S";
        $got = $obj->checkSize(25, 120, 220, 200, 100);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "N";
        $got = $obj->checkSize(25, 205, 220, 200, 100);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "S";
        $got = $obj->checkSize(25, 200, 220, 200, 100);
        $this->assertEquals($want, $got);
    }

}
