package string²âÊÔ;

public class StringMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcÎÒ£¬Äãdef";
		char [] ch = {'a','b','c','ÎÒ','Äã','£Ô'};
		System.out.println(String.copyValueOf(ch));
		System.out.println(str.getBytes()[0]);
		
		String string = "test.cc.tt:9000";
		string.replace("test.cc.tt", "192.168.10.5");
		System.out.println(string);
	}

}
