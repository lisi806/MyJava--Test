package string测试;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringEncode {

    /**
     * @param args
     * @throws UnsupportedEncodingException 
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        String test = "abcdefg我?";
        String encodeString = new String(test.getBytes("UTF-8"),"ISO8859-1");
        String encodeStrUTF8 = new String(test.getBytes(),"utf-8");
        
        System.out.println(encodeString);
        System.out.println(encodeStrUTF8);
        String csn = Charset.defaultCharset().name();
        System.out.println(Charset.forName("utf-8"));
    }

}
