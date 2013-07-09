package 重写重载;


public class BChild extends ASuper{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ASuper testASuper = new BChild();
		System.out.println(testASuper.getObj());
	}

	@Override
	public String getObj(){
		return "child getObj method";
	}
}
