import java.io.IOException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class OutTest implements Cloneable {
    String aa;
    Object ojb;


	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String str = null;
		String a = "asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfaaaaaaaaaaaaaaaaaaaaaaaa" +
				"asdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffasdf" +
				"asdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
				"asdfffffffffffffffffffffffffffffffffffffffff";
		System.out.println(a.getBytes().length);
	}

}
