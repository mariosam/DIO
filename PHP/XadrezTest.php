<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Xadrez.php");

class XadrezTest extends TestCase {

    public function testXadrez() {
        $obj = new Xadrez();
        //Test 1
        $want = 1;
        $got = $obj->tableColor(8, 8);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 1;
        $got = $obj->tableColor(5, 91);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 0;
        $got = $obj->tableColor(6, 9);
        $this->assertEquals($want, $got);
    }

}
