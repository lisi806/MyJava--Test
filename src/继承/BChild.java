package ผฬณะ;

public class BChild extends Asuper {
	
	public void a(){
		System.out.println("b!!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BChild bChild = new BChild();
		((Asuper)bChild).a();
	}

}
