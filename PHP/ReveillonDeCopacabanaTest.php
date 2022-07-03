<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ReveillonDeCopacabana.php");

class ReveillonDeCopacabanaTest extends TestCase {

    public function testReveillonDeCopacabana() {
        $obj = new ReveillonDeCopacabana();
        //Test 1
        $want = 25;
        $got = $obj->howManyOrdersPerPeople(13);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 73;
        $got = $obj->howManyOrdersPerPeople(37);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 97;
        $got = $obj->howManyOrdersPerPeople(49);
        $this->assertEquals($want, $got);
        //Test 4
        $want = 21;
        $got = $obj->howManyOrdersPerPeople(11);
        $this->assertEquals($want, $got);
        //Test 5
        $want = 17;
        $got = $obj->howManyOrdersPerPeople(9);
        $this->assertEquals($want, $got);
        //Test 6
        $want = 9;
        $got = $obj->howManyOrdersPerPeople(5);
        $this->assertEquals($want, $got);
        //Test 7
        $want = 33;
        $got = $obj->howManyOrdersPerPeople(17);
        $this->assertEquals($want, $got);
    }

}
