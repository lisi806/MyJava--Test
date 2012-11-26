package innerClass;

import javax.swing.JApplet;

import innerClass.InnerClass.Inner1;

/**
 * ¹¦ÄÜ£º
 * @author£º ´«Çï
 * @date£º2011-8-14
 */
class InnerClass{
	public InnerClass (){
		System.out.println("father initialized¡­¡­");
	}
	private class Inner{
		private  int in =2;
		public Inner(){
			System.out.println("child initialized¡­¡­");
		}
		public void test () {
			System.out.println("a");
		}
	}
	class Inner1{
		private int in1;
		public Inner1 () {
		}
		public void test1() {
			Inner inner = new Inner();
			inner.in = 2;
			inner.test();
			System.out.println(inner.in);
		}
		
	}

	public void test2() {
//		in1 = 2;
	}
}

public class InnerClassTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inCls = new InnerClass();
		Inner1 inner = inCls.new Inner1();
		inner.test1();
	}

}
