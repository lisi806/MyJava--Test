package 内部类;
/**
 * 功能：
 * @author： 传秋
 * @date：2012-5-16
 */

class OutClass {
	static int a;
	public String strPub;
	String strNo;
	private static  String strPri;
	static {
		System.out.println("OutClass");
	}
	public class InnerClass {
		{
			System.out.println("InnerClass");
		}
		
		int strIn;
		void printIn(){
			System.out.println("InnerClass:"+strPri);
		}
	}
	static class InnerStaticClass {
		static {
			System.out.println("InnerStaticClass"+a);
		}
		static int strInSta;
		void printInSta(){
			System.out.println("InnerStaticClass:"+a);
		}
	}
	static void printOut(){
		System.out.println("OutClass:"+InnerStaticClass.strInSta);
	}
}
