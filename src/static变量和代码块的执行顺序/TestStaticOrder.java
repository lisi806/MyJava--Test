package static变量和代码块的执行顺序;

public class TestStaticOrder {
	
	
	static
	{
		System.out.println("初始化");
	}
	
	private static ClassA classA = new ClassA();
	private static ClassB classB = new ClassB();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
class ClassA{
	public ClassA(){
		System.out.println("classA");
	}
}
class ClassB{
	public ClassB(){
		System.out.println("classB");
	}
}