package ผฬณะ;

public class Child extends Asuper {
	private int[] a ;
	
	public static void main(String[] arg){
		Child child = new Child();
		child.doSome();
	}
	public void test(){
		setA(new String[]{"a","b","c"});
		for (CharSequence string : getA()) {
			System.out.println(string);
		}
	}
}
