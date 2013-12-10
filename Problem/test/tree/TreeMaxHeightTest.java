package tree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeMaxHeightTest {

	TreeMaxHeight tmh;
	Node a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tmh = new TreeMaxHeight();
		treeCreation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getMaxHeightTest() {
		assertEquals(5, tmh.getMaxHeight(a));
	}

	private void treeCreation() {
		Node g = new NodeImpl("G");
		Node[] gArr = new Node[] { g };
		Node f = new NodeImpl("F", gArr);
		Node[] fArr = new Node[] { f };
		Node e = new NodeImpl("E", fArr);
		Node[] eArr = new Node[] { e };
		Node d = new NodeImpl("D", eArr);
		Node c = new NodeImpl("C");
		Node b = new NodeImpl("B");
		Node[] bcdArr = new Node[] { b, c, d };
		a = new NodeImpl("A", bcdArr);
	}
}
