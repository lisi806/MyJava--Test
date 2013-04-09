package 多线程与锁.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


public class FixedThreadPoolMain {
	static ExecutorService service = new MyExecutor(2, 2,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i= 0 ;i< 3; i++){
			service.execute(new MyThread1(i));
		}
			
		
			
	}

}
class MyThread1 implements Runnable {
	int i;
	public MyThread1(int i){
		this.i = i;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(i);
		System.out.println("threadId:"+Thread.currentThread().getId());
		//		try {
//			Thread.currentThread().sleep(500L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}