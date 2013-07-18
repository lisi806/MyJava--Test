package string测试;

public class StringEqualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = new String("a");
		String b = new String("a");
		
		System.out.println("lcq:"+(a.equals(b)));
		System.out.println(a.hashCode() + ":" + b.hashCode() );
	}

}
