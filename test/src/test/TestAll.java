package test;

import junit.framework.TestSuite;

/**
 * Title: Description: Copyright: Copyright (c) 2013 Company:���ڲ�Ѷ�Ƽ����޹�˾
 * 
 * @author licq 2013-6-5
 * @version 1.0
 */
public class TestAll {
	public static TestSuite suite() {
		TestSuite suite = new TestSuite("TestSuite Test");
		suite.addTestSuite(AsuperTest.class);
		return suite;
	}
}
