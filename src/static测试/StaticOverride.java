package static²âÊÔ;



/**
 * ¹¦ÄÜ£º
 * @author£º ´«Çï
 * @date£º2011-5-8
 */
class Window{
	static void f(){
		System.out.println("Window");
	}
	void f1(){
		f();
	}
}

class House extends Window{
	static void f(){
		System.out.println("House");
	}
	void f1(){
		f();
	}
	
}

public class StaticOverride {
	int i = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window w1 = new House();
		w1.f();
		w1.f1();
	}

}
