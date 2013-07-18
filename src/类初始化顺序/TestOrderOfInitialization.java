package 类初始化顺序;
/**
 * 功能：
 * @author： 传秋
 * @date：2011-5-8
 */

class Window{
	Window(int marker){
		System.out.println("Window"+marker);
	}
}
class House{
	Window w1 = new Window(1);
	House(){
		System.out.println("House initialize");
		Window w3 = new Window(33);
	}
	void f(){
		System.out.println("f() function");
	}
	Window w2 = new Window(2);
	Window w3 = new Window(3);
}

public class TestOrderOfInitialization {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h = new House();
		h.f();
		TestOrderOfInitialization test = new TestOrderOfInitialization();
		
	}

}
