<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("AmudancaContinua.php");

class AmudancaContinuaTest extends TestCase {

    public function testAmudancaContinua() {
        $obj = new AmudancaContinua();
        //Test 1
        $want = ["Bom Dia!!","06","06","00"];
        $got = $obj->salutationTime( 1.50 );
        $this->assertEquals($want, $got);
        //Test 2
        $want = ["Boa Tarde!!","12","22","00"];
        $got = $obj->salutationTime( 95.5 );
        $this->assertEquals($want, $got);
        //Test 3
        $want = ["Boa Noite!!","18","30","00"];
        $got = $obj->salutationTime( 187.5 );
        $this->assertEquals($want, $got);
        //Test 4
        $want = ["De Madrugada!!","00","38","00"];
        $got = $obj->salutationTime( 279.5 );
        $this->assertEquals($want, $got);
    }

}
