import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

//lcq
public class OutTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		File file = new File("D:\\channel.ini");
//		System.out.println(file.exists());
//		try {
//			FileInputStream  fOutputStream = new FileInputStream(file);
//			System.out.println("lcq:"+out(fOutputStream));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Object object = new Object();
		//object = "aa";
		System.out.println((String)object);
	}

	
	private static String out(InputStream paramInputStream)
	  {
	    String localObject = "";
	    String str = null;
	    try
	    {
	      byte[] arrayOfByte = new byte[256];
	      str = new String(arrayOfByte, 0, paramInputStream.read(arrayOfByte));
	    }
	    catch (Exception localException1)
	    {
	      try
	      {
	        paramInputStream.close();
	        localObject = str;
	        return localObject;
	      }
	      catch (Exception localException2)
	      {
	        localObject = str;
	      }
	    }
		return str;
	  }
}
