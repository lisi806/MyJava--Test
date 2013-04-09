package 多线程与锁.线程顺序;

public class ThreadOrderTest {
	UpdateClass updateThread;
	boolean mPendingUpdate;
	ThreadOrderTest test;
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		UpdateClass test = new UpdateClass();
		// TODO Auto-generated method stub
		test.test();
	}

}
