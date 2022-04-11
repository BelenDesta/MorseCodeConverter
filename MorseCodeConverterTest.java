import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Belen Desta
 *
 */

public class MorseCodeConverterTest {
	File fileStudent;
@Before
public void setUp() throws Exception{
		
	}
@After
public void tearDown() throws Exception{
	
}
@Test
public void testConvertToEnglishString() {
String code = MorseCodeConverter.convertToEnglish("- --- -.. .- -.-- / .. ... / -- --- -. -.. .- -.--" );
assertEquals("today is monday", code);
String code2 = MorseCodeConverter.convertToEnglish(".-/-... .. --./- .-. . ." );
assertEquals("a big tree", code2);
}
@Test
public void testConvertToEnglishFile() throws FileNotFoundException{
	File file = new File("src/LoveLooksNot.txt"); 
	try {
		assertEquals("love looks not with the eyes but with the mind", MorseCodeConverter.convertToEnglish(file));
	} catch (FileNotFoundException e) {
		assertTrue("An unwanted exception was caught", false);
	}
}

}
