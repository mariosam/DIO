<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("DragaoBerradorWorld.php");

class DragaoBerradorWorldTest extends TestCase {

    public function testDragaoBerradorWorld() {
        $obj = new DragaoBerradorWorld();
        //Test 1
        $want = 5;
        $inp = [8, 160, 182];
        $ops = [160, 182, 183, 159, 250, 170, 172, 173];
        $got = $obj->numberOfGuests( $inp, $ops );
        $this->assertEquals($want, $got);
        //Test 2
        $want = 2;
        $inp = [5, 155, 176];
        $ops = [149, 154, 172, 182, 167];
        $got = $obj->numberOfGuests( $inp, $ops );
        $this->assertEquals($want, $got);
    }

}
