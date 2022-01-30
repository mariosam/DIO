<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("MensagemDoPadreDoBalao.php");

class MensagemDoPadreDoBalaoTest extends TestCase {

    public function testMensagemDoPadreDoBalao() {
        $obj = new MensagemDoPadreDoBalao();
        //Test 1
        $want = "HELP";
        $got = $obj->decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [8, 5, 12, 16]);
        $this->assertEquals($want, $got);
        //Test 2
        $want = "HELLOWORLD";
        $got = $obj->decodeMsg("QWERTYUIOPASDFGHJKLZXCVBNM", [16, 3, 19, 19, 9, 2, 9, 4, 19, 13]);
        $this->assertEquals($want, $got);
        //Test 3
        $want = "PROGRAMMER";
        $got = $obj->decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [16, 18, 15, 7, 18, 1, 13, 13, 5, 18]);
        $this->assertEquals($want, $got);
    }

}
