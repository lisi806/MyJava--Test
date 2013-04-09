package 多线程与锁;

public class ThreadExtendsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ttExtends = new Thread(new MyThreadExtends());
		ttExtends.start();
	}

}
class MyThreadExtends extends Thread implements Runnable{

	
}
