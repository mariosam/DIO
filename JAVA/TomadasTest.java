/** 
 * @version JAVA
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ mvn clean test -Dtest=your.package.TestClassName
 */
package JAVA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TomadasTest {

    @Test
    public void testTomadas() throws Exception {
      //Test 1
      int want = 8;
      int got = Tomadas.maxDevices(2, 4, 3, 2);
      assertEquals(want, got);
      //Test 2
      want = 21;
      got = Tomadas.maxDevices(6, 6, 6, 6);
      assertEquals(want, got);
      //Test 3
      want = 5;
      got = Tomadas.maxDevices(2, 2, 2, 2);
      assertEquals(want, got);
    }
}
