package string;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcwwwbaiducomwww.baidu.com";
		String result = a.replaceAll("www", "*");
		String result1 = a.replaceAll("www\\.", "*");
		System.out.println(result);
		System.out.println(result1);
	}

}
