<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("MultiplicacaoSimples.php");

class MultiplicacaoSimplesTest extends TestCase {

    public function testMultiplicacaoSimples() {
        $obj = new MultiplicacaoSimples();
        //Test 1
        $want = 27;
        $got = $obj->getMulti(3, 9);
        $this->assertEquals($want, $got);
        //Test 2
        $want = -300;
        $got = $obj->getMulti(-30, 10);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 0;
        $got = $obj->getMulti(0, 9);
        $this->assertEquals($want, $got);
    }

}
