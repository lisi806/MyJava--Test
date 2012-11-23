package ÷∏’Î;

public class PointerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aclass a = new Aclass();
		a.setA(3);
		a.print();
		Aclass b = a;
		b.setA(4);
		a.print();
	}

}
class Aclass{
	private int a;
	public void setA(int a){
		this.a = a;
	}
	public void print(){
		System.out.println("a="+a);
	}
}