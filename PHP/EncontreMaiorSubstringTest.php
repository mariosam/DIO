<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("EncontreMaiorSubstring.php");

class EncontreMaiorSubstringTest extends TestCase {

    public function testEncontreMaiorSubstring() {
        $obj = new EncontreMaiorSubstring();
        //Test 1
        $want = 2;
        $got = $obj->findTheBiggestSubstring("abcdef", "cdofhij");
        echo "\nTest 1: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 2
        $want = 1;
        $got = $obj->findTheBiggestSubstring("TWO", "FOUR");
        echo "\nTest 2: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 3
        $want = 0;
        $got = $obj->findTheBiggestSubstring("abracadabra", "open");
        echo "\nTest 3: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
        //Test 4
        $want = 7;
        $got = $obj->findTheBiggestSubstring("Hey This java is hot", "Java is a new paradigm");
        echo "\nTest 4: retornou " . $got . " == esperado: " . $want;
        $this->assertEquals($want, $got);
    }

}
