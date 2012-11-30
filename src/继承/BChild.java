package ผฬณะ;

public class BChild extends Asuper {
	int a;
	@Override
	public void doSome(){
		System.out.println("BChild!!");
	}

	public void print(){
		
		this.doSome();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Asuper asuper = (Asuper)new BChild();
		asuper.doSome();
	}
	class Inner {
		public void test () {
		}
	}
}
