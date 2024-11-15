import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Dec2HexTest {

    public Dec2HexTest()
   {}
    Dec2Hex dec2hex;

    @Before
    public void setUp() {
        dec2hex = new Dec2Hex();
    }

    

    @Test
    public void test_validInput() {

        Dec2Hex.Arg1 = 15;
        assertEquals("Converting 15 to hex should work and should show the letter F ", "F", dec2hex.convert_toHexadec());
    }

}
