package 内部类;

import 内部类.OutClass.InnerClass;
import 内部类.OutClass.InnerStaticClass;

public class StaticInner {
	int a;
	static int b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InnerClass innerClass = new OutClass.InnerClass();
		OutClass outClass = new OutClass();
//		InnerStaticClass innerStaticClass = outClass.new InnerStaticClass();
//		System.out.println(innerStaticClass.aInnerStatic);
//		innerStaticClass.print();
	}

}
