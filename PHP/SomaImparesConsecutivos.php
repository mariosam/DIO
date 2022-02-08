<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+oddsBetween(8,8);

class SomaImparesConsecutivos {

    /**
     * How many odds do we have between two numbers.
     */
    public function oddsBetween($X, $Y): int {
        $result = 0;

        if ( $X < $Y ) {
          for ($i=$X+1; $i<$Y; $i++) {
            if ($i % 2 != 0) {
              $result += $i;
            }
          }
        } else {
          for ($i=$Y+1; $i<$X; $i++) {
            if ($i % 2 != 0) {
              $result += $i;
            }
          }
        }

        return $result;
    }

}
