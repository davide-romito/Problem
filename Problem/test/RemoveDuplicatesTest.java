import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RemoveDuplicatesTest {
	String stringToTest = "aaaaabbbbbcccccdddddcccccbbbbbaaaaa";
	String exectedString = "abcdcba";
	RemoveDuplicates rd;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		rd = new RemoveDuplicates();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(exectedString,	rd.removeDuplicateCharIteratively(stringToTest));
		assertEquals(exectedString,	rd.removeDuplicateCharRecursively(stringToTest, 0));
		assertEquals(rd.removeDuplicateCharIteratively(stringToTest),
				rd.removeDuplicateCharRecursively(stringToTest, 0));
	}

}
