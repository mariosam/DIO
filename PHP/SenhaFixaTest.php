<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("SenhaFixa.php");

class SenhaFixaTest extends TestCase {

    public function testSenhaFixa() {
        $obj = new SenhaFixa();
        //Test 1
        $want = "Senha Invalida";
        $got = $obj->checkPass(2200);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Senha Invalida";
        $got = $obj->checkPass(1020);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Senha Invalida";
        $got = $obj->checkPass(2022);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "Acesso Permitido";
        $got = $obj->checkPass(2002);
        $this->assertEquals($want, $got);
    }

}
