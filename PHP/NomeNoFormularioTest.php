<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("NomeNoFormulario.php");

class NomeNoFormularioTest extends TestCase {

    public function testNomeNoFormulario() {
        $obj = new NomeNoFormulario();
        //Test 1
        $want = "YES";
        $got = $obj->checkNameSize("Fulano de Tal");
        $this->assertEquals($want, $got);
        //Test 2
        $want = "NO";
        $got = $obj->checkNameSize("Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim");
        $this->assertEquals($want, $got);
    }

}
