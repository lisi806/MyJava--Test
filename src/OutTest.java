import java.io.IOException;

public class OutTest implements Cloneable {
	String aa;
	Object ojb;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String aa = "aaaabbb";
		aa.replace("ab", "xx");
		System.out.println(aa);
	}

}
