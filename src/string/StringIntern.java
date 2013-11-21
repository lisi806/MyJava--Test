package string;

/**
 * @Title:
 * @Description:
 * @Copyright: Copyright (c) 2013
 * @Company:深圳彩讯科技有限公司
 * @author licq 2013-10-23
 * @version 1.0
 */
public class StringIntern {

	/**
	 * @param args
	 * @author licq 2013-10-23
	 */
	public static void main(String[] args) {
		String s1 = new String("kvill");
		s1.intern();
		String s2 = new String("kvill").intern();
		//		String s2=s1.intern();   
		System.out.println(s2 == s1);
	}

}
