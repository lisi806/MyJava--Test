package 多线程与锁.calculator;

public class Calculator extends Thread 
{
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total += i;
			}
		}
		// 通知锟斤拷锟斤拷锟节此讹拷锟斤拷锟较等达拷锟斤拷叱锟?
		notifyAll();
	}
}
