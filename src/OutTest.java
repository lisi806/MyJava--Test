import java.io.IOException;

public class OutTest implements Cloneable {
	String aa;
	Object ojb;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		OutTest out = new OutTest();
		out.aa = "aa";
		OutTest t1 = null;
		try {
			t1 = (OutTest) out.clone();
			t1.aa = "bb";
			System.out.println("t1:"+t1.aa);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(out);
		System.out.println(t1);
		
	}

}
