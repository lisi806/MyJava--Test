package 泛型;

/**
 * @Title:TestPair.java
 * @Description:
 * @Copyright: Copyright (c) 2013
 * @Company:深圳彩讯科技有限公司
 * @author licq 2014年6月27日
 * @version 1.0
 */
public class TestPair extends Pair<String> {

	public TestPair(String fir, String sec) {
		super(fir, sec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFirst(String fir) {
		//super.setFirst(fir);
		System.out.println("TestPair");
	}
	
	public static void main(String[] arg) {
		Pair<String> test = new TestPair("a", "b");
		test.setFirst("a");
	}
}
