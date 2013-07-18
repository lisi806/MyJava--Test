package 多线程与锁.顺序;

import javax.naming.ldap.StartTlsRequest;

public class ThreadOrderMain {
	static OrderClass orderClass = new OrderClass();
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
//			orderClass.update(i);
//			Thread.currentThread().sleep(2L);
			new Thread1(i,orderClass).start();
		}
	}

}

class Thread1 extends Thread {
	OrderClass orderClass;
	int i;
	public Thread1(int i,OrderClass orderClass){
		this.i = i;
		this.orderClass = orderClass;
	}
	@Override
	public void run(){
		orderClass.update(i);
	}
}
