package �ڲ���;
/**
 * ���ܣ�
 * @author�� ����
 * @date��2012-5-17
 */

public class OutClassExtends extends OutClass {
	public class InnerClass {
		{
			System.out.println("InnerClass");
		}
		
		int strIn;
		void printIn(){
			System.out.println("InnerClass:");
		}
	}
}
