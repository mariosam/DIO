<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ValidadorDeSenhasComRequisitos.php");

class ValidadorDeSenhasComRequisitosTest extends TestCase {

    public function testValidadorDeSenhasComRequisitos() {
        $obj = new ValidadorDeSenhasComRequisitos();
        //Test 1
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("Digital Innovation One");
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Senha valida.";
        $got = $obj->passwordValidator("AbcdEfgh99");
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Senha valida.";
        $got = $obj->passwordValidator("DigitalInnovationOne123");
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 4
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("Digital Innovation One 123");
        echo "\nTest 4: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 5
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("Aass9");
        echo "\nTest 5: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 6
        $want = "Senha valida.";
        $got = $obj->passwordValidator("Aassd9");
        echo "\nTest 6: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 7
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("Aa@ssd9!");
        echo "\nTest 7: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 8
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("DIO123456");
        echo "\nTest 8: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 9
        $want = "Senha valida.";
        $got = $obj->passwordValidator("Ano2020");
        echo "\nTest 9: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 10
        $want = "Senha invalida.";
        $got = $obj->passwordValidator("Digita!123");
        echo "\nTest 10: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
