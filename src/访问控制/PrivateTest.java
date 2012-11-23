package ∑√Œ øÿ÷∆;

public class PrivateTest {

	private String priStr;
	protected String proStr;
	public String pubStr;
	String str;
	
	private void add(PrivateTest pTest) {
		this.priStr += pTest.priStr;
		this.proStr += pTest.proStr;
		this.pubStr += pTest.pubStr;
		this.str += pTest.str;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrivateTest tt = new PrivateTest();
		tt.priStr = "private";
		tt.proStr = "protected";
		tt.pubStr = "public";
		tt.str = "package";
		
		PrivateTest ta = new PrivateTest();
		System.out.println(ta.priStr);
		ta.add(tt);
		System.out.println(tt.priStr);
		System.out.println(ta.priStr);
	}

}
