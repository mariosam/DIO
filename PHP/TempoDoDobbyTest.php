<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("TempoDoDobby.php");

class TempoDoDobbyTest extends TestCase {

    public function testTempoDoDobby() {
        $obj = new TempoDoDobby();
        //Test 1
        $want = "Deixa para amanha!";
        $got = $obj->todayOrTomorrow(20, 15, 6);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "Farei hoje!";
        $got = $obj->todayOrTomorrow(20, 10, 10);
        $this->assertEquals($want, $got);
    }

}
