<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+shopValue({1001, 1005}, {2, 3});

class MacPronalts {

    /**
     * Multiply product value by quantity and return the total.
     */
    public function shopValue($prods, $qtds) {
        $result = 0;

        for ( $i=0; $i < count($prods); $i++ ) {
          switch ( $prods[$i] ) {
            case 1001:
              $result += 1.50 * $qtds[$i];
              break;
            case 1002:
              $result += 2.50 * $qtds[$i];
              break;
            case 1003:
              $result += 3.50 * $qtds[$i];
              break;
            case 1004:
              $result += 4.50 * $qtds[$i];
              break;
            case 1005:
              $result += 5.50 * $qtds[$i];
              break;
          }
        }

        return $result;
    }

}
