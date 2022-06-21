<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DuasNotas.php");

class DuasNotasTest extends TestCase {

    public function testDuasNotas() {
        $obj = new DuasNotas();
        //Test 1
        $want = "possible";
        $got = $obj->hasTwoNotesChange(11, 23);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "possible";
        $got = $obj->hasTwoNotesChange(500, 650);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "impossible";
        $got = $obj->hasTwoNotesChange(100, 600);
        $this->assertEquals($want, $got);
        //Test 4
        $want = "possible";
        $got = $obj->hasTwoNotesChange(9948, 9963);
        $this->assertEquals($want, $got);
        //Test 5
        $want = "impossible";
        $got = $obj->hasTwoNotesChange(1, 2);
        $this->assertEquals($want, $got);
        //Test 6
        $want = "impossible";
        $got = $obj->hasTwoNotesChange(2, 4);
        $this->assertEquals($want, $got);
    }

}
