<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ContagemDePartidasNoTorneio.php");

class ContagemDePartidasNoTorneioTest extends TestCase {

    public function testContagemDePartidasNoTorneio() {
        $obj = new ContagemDePartidasNoTorneio();
        //Test 1
        $want = 6;
        $got = $obj->numberOfGames(7);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 13;
        $got = $obj->numberOfGames(14);
        $this->assertEquals($want, $got);
    }

}
