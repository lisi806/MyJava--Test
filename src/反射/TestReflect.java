package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 功能：
 * @author： 传秋
 * @date：2012-3-1
 */
class Father {
	public Father(){
		super();
	}
	public int add (int a, int b) {
		System.out.println("a+b:"+ (a + b));
		return a + b;
	}
}

public class TestReflect extends Father{
	
	public TestReflect(){
		super();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReflect test = new TestReflect();
		try {
			Method method = test.getClass().getSuperclass().getDeclaredMethod("add", int.class, int.class);
			method.invoke(test, 1,2);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
