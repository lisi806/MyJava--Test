package test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Before;
import org.junit.Test;

import 继承.Asuper;

/**
 * Title:
 * Description:
 * Copyright: Copyright (c) 2013
 * Company:深圳彩讯科技有限公司
 *
 * @author licq 2013-6-5
 * @version 1.0
 */
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
