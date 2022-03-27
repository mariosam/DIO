<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("BrinquedosDoPapaiNoel.php");

class BrinquedosDoPapaiNoelTest extends TestCase {

    public function testBrinquedosDoPapaiNoel() {
        $obj = new BrinquedosDoPapaiNoel();
        //Test 1
        $want = [2, 3];
        $got = $obj->howManyToys( ["Milena F", "Joao M", "Rafaela F", "Renata F", "Felipe M"] );
        $this->assertEquals($want, $got);
    }

}
