package �ڲ���;

import �ڲ���.OutClass.InnerClass;
import �ڲ���.OutClass.InnerStaticClass;

/**
 * ���ܣ�
 * @author�� ����
 * @date��2012-5-16
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
