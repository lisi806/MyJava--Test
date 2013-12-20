package 内部类.静态内部类;

/**
 * @Title:
 * @Description:
 * @Copyright: Copyright (c) 2013
 * @Company:深圳彩讯科技有限公司
 * @author licq 2013-10-23
 * @version 1.0
 */
public class Fa {
	String str;
	static String sStr;

	public static class StaticIn {
		public int a;

		public void a() {
			//			str = "";
			sStr = "";
		}
	}

	public static void main(String arg[]) {
		StaticIn s1 = new StaticIn();
		StaticIn s2 = new StaticIn();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
	}
}
