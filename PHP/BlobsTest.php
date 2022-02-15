<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ ./vendor/bin/phpunit NomeDaClasseTest.php
 */
namespace PHP;

use PHPUnit\Framework\TestCase;
require ("Blobs.php");

class BlobsTest extends TestCase {

    public function testBlobs() {
        $obj = new Blobs();
        //Test 1
        $want = 6;
        $got = $obj->countDays(40.0);
        $this->assertEquals($want, $got);
        //Test 2
        $want = 8;
        $got = $obj->countDays(200.0);
        $this->assertEquals($want, $got);
        //Test 3
        $want = 9;
        $got = $obj->countDays(300.0);
        $this->assertEquals($want, $got);
    }

}
