import java.io.IOException;

public class OutTest implements Cloneable {
	String aa;
	Object ojb;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	    int a = 2;
	    test(a++);
	    System.out.println(a);
	}

	public static void test(int a) {
	    System.out.println(a);
	    System.out.println(a);
	}
}
