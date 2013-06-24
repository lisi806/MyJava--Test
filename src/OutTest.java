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
		
		System.out.println(String.format("[F:%s(%s)][url:%s][%s][step:%s]",
				"subcribeRelationCheck", Integer.toHexString(new Object().hashCode()),
				"http://test", "", "a->b"));
	}

}
