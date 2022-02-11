<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Amudanca.php");

class AmudancaTest extends TestCase {

    public function testAmudanca() {
        $obj = new Amudanca();
        //Test 1
        $want = "Bom Dia!!";
        $got = $obj->salutation(0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Bom Dia!!";
        $got = $obj->salutation(45);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Bom Dia!!";
        $got = $obj->salutation(360);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "Boa Tarde!!";
        $got = $obj->salutation(90);
        $this->assertEquals($want, $got);
        //Test 5
        $want = "Boa Noite!!";
        $got = $obj->salutation(180);
        $this->assertEquals($want, $got);
    }

}
