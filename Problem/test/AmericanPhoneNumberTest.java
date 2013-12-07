import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AmericanPhoneNumberTest {

	AmericanPhoneNumber apn;
	String stringToTest1;
	String reverseOfStringToTest1;
	String stringToTest2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		apn = new AmericanPhoneNumber();
		stringToTest1 = "25";
		reverseOfStringToTest1 = "52";
		stringToTest2="642539066873";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void componeWordsTest() {
		List<String> s1 = apn.componeWords(stringToTest1);
		assertTrue(s1.contains("aj"));
		assertTrue(s1.contains("ak"));
		assertTrue(s1.contains("al"));
		assertTrue(s1.contains("bj"));
		assertTrue(s1.contains("bk"));
		assertTrue(s1.contains("bl"));
		assertTrue(s1.contains("cj"));
		assertTrue(s1.contains("ck"));
		assertTrue(s1.contains("cl"));
		
		assertNotEquals(apn.componeWords(stringToTest1),
				apn.componeWords(reverseOfStringToTest1));
		
		List<String> s2 = apn.componeWords(stringToTest2);
		assertTrue(s2.contains("mickey mouse"));
	}

}
