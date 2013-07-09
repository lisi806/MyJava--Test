package 重载与覆盖;

public class OverloadTest {
	public static void test(int a, float b){
		System.out.println("int");
	}
	public static void test(float a, int b){
		System.out.println("float");
	}
	public static void main(String[] args) {
		test(1F,2);
	}
	
	public static void main(Object[] args) {
		System.out.println("aa");
	}
	
	private void test(int a){
		
	}
//	private void test (int a) throws Exception{
//		
//	}
}
