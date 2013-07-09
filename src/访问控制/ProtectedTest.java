package 访问控制;

class ProtectedTest {
	static final String[] PROJECTION = new String[] {
		"aa",
		"ab",
		"ac",
		"ad",
	};
	protected int a;
	ProtectedTest(){
		super();
		a = 0;
	}
	protected class A {
		
	}
	void test(){
		System.out.println(" ?");
	}
	
}
