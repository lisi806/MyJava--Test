package 重载与覆盖;

import java.util.ArrayList;

public class FatherCover {
	final protected ArrayList<String> mHeaders = new ArrayList<String>();
	String a = "father";

	// static {
	// mHeaders.add("a");
	// }

	void test() {
		System.out.println("FatherCover test");
	}

	Object tt() {
		this.mHeaders.add("father tt");
		return "tt in father";
	}

	final String tt(int a) {
		System.out.println("father overload");
		return null;
	}
}

class A {
	int b;
}
