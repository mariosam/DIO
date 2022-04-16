<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("IdadeEmDias.php");

class IdadeEmDiasTest extends TestCase {

    public function testIdadeEmDias() {
        $obj = new IdadeEmDias();
        //Test 1
        $want = [1, 1, 5];
        $got = $obj->splitAgeDays( 400 );
        $this->assertEquals($want, $got);
        //Test 2
        $want = [2, 2, 10];
        $got = $obj->splitAgeDays( 800 );
        $this->assertEquals($want, $got);
        //Test 3
        $want = [0, 1, 0];
        $got = $obj->splitAgeDays( 30 );
        $this->assertEquals($want, $got);
    }

}
