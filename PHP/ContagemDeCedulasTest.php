<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("ContagemDeCedulas.php");

class ContagemDeCedulasTest extends TestCase {

    public function testContagemDeCedulas() {
        $obj = new ContagemDeCedulas();
        //Test 1
        $want = [5, 1, 1, 0, 1, 0, 1];
        $got = $obj->countNotes( 576 );
        $this->assertEquals($want, $got);
        //Test 2
        $want = [112, 1, 0, 0, 1, 1, 0];
        $got = $obj->countNotes( 11257 );
        $this->assertEquals($want, $got);
        //Test 3
        $want = [5, 0, 0, 0, 0, 1, 1];
        $got = $obj->countNotes( 503 );
        $this->assertEquals($want, $got);
    }

}
