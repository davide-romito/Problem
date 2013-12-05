import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SpaceInsertionTest {
	String stringToTest;
	String[] dictionary1;
	String[] dictionary2;
	SpaceInsertion siDic1;
	SpaceInsertion siDic2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String[] dictionary1={"that","race","is","faster","than","me","racer"};
		String[] dictionary2={"that","race","is","faster","than","me"};
		this.dictionary1 = dictionary1;
		this.dictionary2 = dictionary2;
		stringToTest="thatracerisfasterthanme";
		siDic1 = new SpaceInsertion(dictionary1);
		siDic2 = new SpaceInsertion(dictionary2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertSpaceTest() {
		assertEquals("that racer is faster than me", siDic1.insertSpace(stringToTest));
		assertNull(siDic2.insertSpace(stringToTest));
	}

}
