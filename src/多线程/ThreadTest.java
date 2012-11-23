package 多线程;

import javax.swing.plaf.SliderUI;

/**
 * 功能：
 * @author： 传秋
 * @date：2011-7-19
 */

public class ThreadTest implements Runnable {

	private int i;
	static Thread thread;
	boolean flag = true;
	public void run() {
		while(flag){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadTest tt = new ThreadTest();
		thread = new Thread(tt,"test1");
		thread.start();
//		new Thread(tt,"test2").start();
		Thread.currentThread().sleep(1*1000);
		tt.interrup();
	}
	public void interrup(){
		flag = false;
		thread.interrupt();
	}
}
