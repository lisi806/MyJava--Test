package ÖØÔØÓë¸²¸Ç;

import java.util.ArrayList;
import java.util.List;

public class CoverTest extends FatherCover {
	public  List<String> mHeaders = new ArrayList<String>();
	int a = 2;
	/**
	 * @author lcq
	 * @date 2013-1-6
	 * @param args
	 */
	public static void main(String[] args) {
		CoverTest test = new CoverTest();
		test.mHeaders = new ArrayList<String>();
		test.tt();
		test.mHeaders.add("c");
		for (String str : test.mHeaders) {
			System.out.println(str);
		}
		System.out.println("........."+ test.a);
		FatherCover fa = (CoverTest)test;
		for (String str : fa.mHeaders) {
			System.out.println(str);
		}
		System.out.println("........."+ fa.a);
		//fa.test();
	}
	
	void tt(){
		super.tt();
		this.mHeaders.add("child tt");
		super.mHeaders.add("father-child tt");
	}

	@Override
	public void test(){
		System.out.println("CoverTest test");
	}
	
}
