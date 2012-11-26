package 内部类;

import 内部类.OutClass.InnerClass;
import 内部类.OutClass.InnerStaticClass;

/**
 * 功能：
 * @author： 传秋
 * @date：2012-5-16
 */

public class InnerClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass out = new OutClass();
		//InnerClass in = out.new InnerClass();
		//in.strIn = 1;
		//System.out.println(in.strIn);
		InnerStaticClass inStatic = new OutClass.InnerStaticClass();
		System.out.println(out.a);
	}

}
