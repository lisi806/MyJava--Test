package instanceof测试;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import javax.management.AttributeList;

public class InstanceOfTest_1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "123";
		Object obj = new String("123");
		Object obj1 = new Object();
		String str = new String("a");
		HashSet set = new HashSet<String>();
		List list = new ArrayList<String>();
		System.out.println(obj instanceof Object);
		System.out.println(str instanceof Object);
		System.out.println(obj1 instanceof String);
		System.out.println(set instanceof LinkedHashSet);
		System.out.println(set instanceof Collection);
		System.out.println(list instanceof AttributeList);
	}

}
