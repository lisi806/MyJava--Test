package ÷ÿ‘ÿ”Î∏≤∏«;

import java.util.ArrayList;
import java.util.List;

public class CoverTest extends FatherCover {
	public  List<String> mHeaders = new ArrayList<String>();
	String a = "child";
	/**
	 * @author lcq
	 * @date 2013-1-6
	 * @param args
	 */
	public static void main(String[] args) {
		FatherCover test = new CoverTest();
		test.tt();
		//test.mHeaders.add("c");
		for (String str : test.mHeaders) {
			System.out.println(str);
		}
		System.out.println(".........");
		FatherCover fa = test;
		for (String str : fa.mHeaders) {
		System.out.println(".........");
		
		FatherCover fa = test;
		for (String str : fa.mHeaders) {
			System.out.println(str);
		}
		
		System.out.println(".........");
		fa.test();
	}
	
	@Override
	String tt(){
		super.tt();
		this.mHeaders.add("child tt");
		super.mHeaders.add("father-child tt");
		return null;
	}

	@Override
	public void test(){
		System.out.println("CoverTest test");
	}
	
}
