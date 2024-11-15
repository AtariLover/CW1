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

      @Test
      public void test_nonInteger() {

           ByteArrayOutputStream Output = new ByteArrayOutputStream();
           System.setOut(new PrintStream(Output)); 
        
           dec2hex.main(new String[]{"A"});

           String expectedError = "Error. The input was in an invalid format. \n";

           assertEquals("Non-integer value should create the expected error message.", Output.toString().equals(expectedError));

	   System.setOut(System.out);

      }


      @Test
      public void test_noInput(){

          ByteArrayOutputStream Output = new ByteArrayOutputStream();
          System.setOut(new PrintStream(Output)); 
        
          dec2hex.main(new String[]{});

          String expectedError = "Error. There has not been any input provided. \n";

          assertEquals("No input should create the expected error message.", Output.toString().equals(expectedError));

          System.setOut(System.out);

      }



}
