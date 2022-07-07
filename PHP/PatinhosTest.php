<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Patinhos.php");

class PatinhosTest extends TestCase {

    public function testPatinhos() {
        $obj = new Patinhos();
        //Test 1
        $want = 0;
        $got = $obj->returnedDucks(0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 0;
        $got = $obj->returnedDucks(1);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 9;
        $got = $obj->returnedDucks(10);
        $this->assertEquals($want, $got);
    }

}
