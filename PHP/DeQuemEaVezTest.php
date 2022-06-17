<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DeQuemEaVez.php");

class DeQuemEaVezTest extends TestCase {

    public function testDeQuemEaVez() {
        $obj = new DeQuemEaVez();
        //Test 1
        $want = "Quico";
        $got = $obj->evenOrOdd(["Quico", "PAR", "Chiquinha", "IMPAR", "9", "7"]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Marcus";
        $got = $obj->evenOrOdd(["Dami", "PAR", "Marcus", "IMPAR", "12", "3"]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "Conrado";
        $got = $obj->evenOrOdd(["Dayran", "PAR", "Conrado", "IMPAR", "3", "1000000000"]);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "Chaves";
        $got = $obj->evenOrOdd(["Popis", "PAR", "Chaves", "IMPAR", "2", "7"]);
        $this->assertEquals($want, $got);
    }

}
