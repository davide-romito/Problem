import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringPermutationTest {

	StringPermutation sp;
	String string1 = "ab";
	String string2 = "abc";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sp = new StringPermutation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calculatePermutationsTest() {
		Set<String> s1 = sp.calculatePermutations(string1);
		assertEquals(2, s1.size());
		assertTrue(s1.contains("ab"));
		assertTrue(s1.contains("ba"));

		Set<String> s2 = sp.calculatePermutations(string2);
		assertEquals(6, s2.size());
		assertTrue(s2.contains("cab"));
		assertTrue(s2.contains("abc"));
		assertTrue(s2.contains("cba"));
		assertTrue(s2.contains("bca"));
		assertTrue(s2.contains("acb"));
		assertTrue(s2.contains("bac"));
	}

}
