package static�����ʹ�����ִ��˳��;

public class TestStaticOrder {
	
	
	static
	{
		System.out.println("��̬�����");
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