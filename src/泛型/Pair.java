package 泛型;

/**
 * @Title:Pair.java
 * @Description:
 * @Copyright: Copyright (c) 2013
 * @Company:深圳彩讯科技有限公司
 * @author licq 2014年6月27日
 * @version 1.0
 */
public class Pair<T> {
	private T first = null;
	private T second = null;

	public Pair(T fir, T sec) {
		this.first = fir;
		this.second = sec;
	}

	public T getFirst() {
		return this.first;
	}

	public T getSecond() {
		return this.second;
	}

	public void setFirst(T fir) {
		this.first = fir;
		System.out.println("Pair");
	}
}