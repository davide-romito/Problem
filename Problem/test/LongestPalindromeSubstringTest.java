import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LongestPalindromeSubstringTest {
	LongestPalindromeSubstring lps;
	
	@Before
	public void setUp() throws Exception {
		lps = new LongestPalindromeSubstring();
	}

	@Test
	public void isPalindromeTest() {
		assertNotNull(lps);
		assertTrue(lps.isPalindrome("radar"));
		assertFalse(lps.isPalindrome("davide"));
	}

	
	@Test
	public void findLongestPalindromeSubstringTest() {
		assertNotNull(lps);
		assertEquals("radar", lps.findLongestPalindromeSubstring("radar"));
		assertEquals("ava", lps.findLongestPalindromeSubstring("java"));
		assertEquals("oo", lps.findLongestPalindromeSubstring("cook"));
		assertEquals("fghihgf", lps.findLongestPalindromeSubstring("abcdefghihgf"));
		assertNull(lps.findLongestPalindromeSubstring("davide"));
	}

}
