package ¼¯ºÏ;

import java.util.ArrayList;

public class ArrayListAddTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> array = new ArrayList <String>();
		String aString = "aa";
		array.add(aString);
		for(String a : array){
			System.out.println(a);
		}
		String bString = "aa";
		System.out.println(array.remove(bString));
		for(String a : array){
			System.out.println(a);
		}
		
	}

	static class A {
		public A(String str){
			this.aString = str;
		}
		public String aString;
	}
}
