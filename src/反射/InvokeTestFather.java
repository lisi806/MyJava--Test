package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeTestFather {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son();
		son.go();
	}

}

class  Father1{
	public Father1() {
		// TODO Auto-generated constructor stub
	}

	public int add (int a, int b) {
		System.out.println("a+b="+(a+b));
		return a+b;
	}
}

class Son extends Father1{
	public Son(){
		super();
	}
	public void go() {
		try {
			Method method = this.getClass().getSuperclass().getDeclaredMethod("add", int.class, int.class);
			method.invoke(this, 1,2);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}