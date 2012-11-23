package жиди;

public class OverloadTest {
	public static void test(int a){
		System.out.println("int");
	}
	public static void test(double a){
		System.out.println("double");
	}
	public static void main(String[] args) {
		test(4d);
	}
}
