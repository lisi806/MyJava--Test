package 枚举;

/**
 * @Title:
 * @Description:
 * @Copyright: Copyright (c) 2013
 * @Company:深圳彩讯科技有限公司
 * @author licq 2013-12-19
 * @version 1.0
 */
public enum TestEnum {
	FIRST(aNum.A),
	SECOND(aNum.B),
	THIRD(aNum.C);
	public aNum str;
	TestEnum(aNum t) {
		str = t;
	}
	enum aNum {A,B,C;};
	public static void main(String args[]) {
		System.out.println(TestEnum.FIRST.toString());
		System.out.println(TestEnum.FIRST.name());
	}
}
