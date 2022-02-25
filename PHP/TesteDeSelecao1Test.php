<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TesteDeSelecao1.php");

class TesteDeSelecao1Test extends TestCase {

    public function testTesteDeSelecao1() {
        $obj = new TesteDeSelecao1();
        //Test 1
        $want = "Valores nao aceitos";
        $got = $obj->checkSequence(5, 6, 7, 8);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Valores aceitos";
        $got = $obj->checkSequence(2, 3, 2, 6);
        $this->assertEquals($want, $got);
    }

}
