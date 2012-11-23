package string测试;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 功能：
 * @author： 传秋
 * @date：2011-4-27
 */

public class StringEncode {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String test = "abcdefg我";
		String encodeString = new String (test.getBytes("UTF-8"),"ISO8859-1");
		
		System.out.println(encodeString);
		
	}

}
