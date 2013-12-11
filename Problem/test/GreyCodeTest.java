import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreyCodeTest {
	GreyCode gc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		gc = new GreyCode();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calculateCodeRecursivelyTest() {
		List<String> l = gc.calculateCodeRecursively(3);
		assertEquals(8, l.size());
		assertEquals("000", l.get(0));
		assertEquals("001", l.get(1));
		assertEquals("011", l.get(2));
		assertEquals("010", l.get(3));
		assertEquals("110", l.get(4));
		assertEquals("111", l.get(5));
		assertEquals("101", l.get(6));
		assertEquals("100", l.get(7));
	}

	@Test
	public void calculateCodeIterativelyTest() {
		List<String> l = gc.calculateCodeIteratively(3);
		assertEquals(8, l.size());
		assertEquals("000", l.get(0));
		assertEquals("001", l.get(1));
		assertEquals("011", l.get(2));
		assertEquals("010", l.get(3));
		assertEquals("110", l.get(4));
		assertEquals("111", l.get(5));
		assertEquals("101", l.get(6));
		assertEquals("100", l.get(7));
	}

	@Test
	public void calculateEquality() {
		List<String> l1 = gc.calculateCodeIteratively(15);
		List<String> l2 = gc.calculateCodeRecursively(15);
		assertArrayEquals(l1.toArray(), l2.toArray());
	}
}
