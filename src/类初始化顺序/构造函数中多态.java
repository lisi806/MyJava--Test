package 类初始化顺序;
/**
 * 构造函数中多态 会引发初始化异常等信息，因为此时动态绑定时，属性可能还未初始化
 * @author Administrator
 *
 */
public class 构造函数中多态 {

	/**
	 * @author lcq
	 * @date 2013-1-7
	 * @param args
	 */
	public static void main(String[] args) {
		new ChildB();

	}

}
class SuperA {
	void draw() {
		System.out.println("SuperA draw");
	}
	SuperA(){
		draw();
	}
}
class ChildB extends SuperA{
	int a = 1;
	ChildB() {
		a = 2;
	}
	void draw() {
		System.out.println("ChildB draw:" + a);
	}
}