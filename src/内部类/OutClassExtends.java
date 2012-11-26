package 内部类;
/**
 * 功能：
 * @author： 传秋
 * @date：2012-5-17
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
