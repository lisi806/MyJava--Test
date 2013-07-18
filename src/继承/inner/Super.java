package 继承.inner;

public class Super {
	private CharSequence[] a ;
	int b;

	public CharSequence[] getA() {
		return a;
	}

	public void setA(CharSequence[] a) {
		this.a = a;
	}
	protected void doSome(){
        System.out.println("Super!!");
    }
	
}
