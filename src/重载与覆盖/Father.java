package 重载与覆盖;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Father {
	final protected ArrayList<String> mHeaders = new ArrayList<String>();
	String a = "father";

	// static {
	// mHeaders.add("a");
	// }

	void test() {
		System.out.println("FatherCover test");
	}

	Object testOverride() {
		this.mHeaders.add("father tt");
		return null;
	}

	void test(Map map) {
		System.out.println("father tt(Map)");
	}

	final String test(int a) {
		System.out.println("father overload");
		return null;
	}
}

class A {
	int b;
}
