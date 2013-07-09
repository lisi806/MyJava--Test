package test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;

import 继承.Asuper;


public class AsuperTest extends TestCase{
	static Asuper su = new Asuper();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoSome() {
		assertTrue("aa", 1 == 1);
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite("TestSuite Test");
		suite.addTestSuite(AsuperTest.class);
		return suite;
		
	}

}
