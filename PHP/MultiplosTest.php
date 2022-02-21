<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Multiplos.php");

class MultiplosTest extends TestCase {

    public function testMultiplos() {
        $obj = new Multiplos();
        //Test 1
        $want = "Sao Multiplos";
        $got = $obj->areTheyMulti(6, 24);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Nao sao Multiplos";
        $got = $obj->areTheyMulti(6, 25);
        $this->assertEquals($want, $got);
    }

}
