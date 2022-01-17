<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Dama.php");

class DamaTest extends TestCase {

    public function testDama() {
        $obj = new Dama();
        //Test 1
        $want = 1;
        $got = $obj->minMoviments(4, 4, 6, 2);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 0;
        $got = $obj->minMoviments(3, 5, 3, 5);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 2;
        $got = $obj->minMoviments(5, 5, 4, 3);
        $this->assertEquals($want, $got);
    }

}
