package matrix;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixVerticalPathTest {

	MatrixVerticalPath mvp;
	int[][] matrix;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mvp = new MatrixVerticalPath();
		matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void calculatePathTest() {
		List<String> list = mvp.calculatePath(matrix);
		assertEquals(17, list.size());

		assertTrue(list.contains("147"));
		assertTrue(list.contains("148"));

		assertTrue(list.contains("157"));
		assertTrue(list.contains("158"));
		assertTrue(list.contains("159"));

		assertTrue(list.contains("247"));
		assertTrue(list.contains("248"));

		assertTrue(list.contains("257"));
		assertTrue(list.contains("258"));
		assertTrue(list.contains("259"));

		assertTrue(list.contains("268"));
		assertTrue(list.contains("269"));

		assertTrue(list.contains("357"));
		assertTrue(list.contains("358"));
		assertTrue(list.contains("359"));

		assertTrue(list.contains("368"));
		assertTrue(list.contains("369"));

	}

}
