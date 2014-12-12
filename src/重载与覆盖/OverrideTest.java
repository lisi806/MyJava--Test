package 重载与覆盖;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OverrideTest extends Father {
	public List<String> mHeaders = new ArrayList<String>();
	String a = "child";

	/**
	 * @author lcq
	 * @date 2013-1-6
	 * @param args
	 */
	public static void main(String[] args) {
		Father test = new OverrideTest();
		test.testOverride();
		Map a = new HashMap();
		test.test(a);
		// test.mHeaders.add("c");
		for (String str : test.mHeaders) {
			System.out.println(str);
		}
		System.out.println(".........");

		Father fa = test;
		for (String str : fa.mHeaders) {
			System.out.println(str);
		}

		System.out.println(".........");
		fa.test();
	}

	@Override
	String testOverride() {
		super.testOverride();
		this.mHeaders.add("child tt");
		super.mHeaders.add("father-child tt");
		return null;
	}

	void test(HashMap map) {
		System.out.println("child tt(HashMap)");
	}

	@Override
	public void test() {
		System.out.println("CoverTest test");
	}

}
