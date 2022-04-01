<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TeoremaDaDivisaoEuclidiana.php");

class TeoremaDaDivisaoEuclidianaTest extends TestCase {

    public function testTeoremaDaDivisaoEuclidiana() {
        $obj = new TeoremaDaDivisaoEuclidiana();
        //Test 1
        $want = [2, 1];
        $got = $obj->getQuoAndRest( 7, 3 );
        $this->assertEquals($want, $got);
        //Test 2
        $want = [-2, 1];
        $got = $obj->getQuoAndRest( 7, -3 );
        $this->assertEquals($want, $got);
        //Test 3
        $want = [3, 2];
        $got = $obj->getQuoAndRest( -7, -3 );
        $this->assertEquals($want, $got);
    }

}
