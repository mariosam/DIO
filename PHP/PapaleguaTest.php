<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Papalegua.php");

class PapaleguaTest extends TestCase {

    public function testPapalegua() {
        $obj = new Papalegua();
        //Test 1
        $want = 9.71;
        $got = $obj->theFaster([9.81, 9.71]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 9.72;
        $got = $obj->theFaster([9.82, 9.72, 9.92]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 9.23;
        $got = $obj->theFaster([9.75, 9.55, 9.23]); 
        $this->assertEquals($want, $got);
        //Test 4
        $want = 9.10;
        $got = $obj->theFaster([9.82, 9.92, 9.1]);
        $this->assertEquals($want, $got);
    }
}
