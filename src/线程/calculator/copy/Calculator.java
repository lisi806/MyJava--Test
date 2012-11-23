package 线程.calculator.copy;

public class Calculator extends Thread 
{
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				total += i;
			}
		}
		// 通知所有在此对象上等待的线程
		notifyAll();
	}
}
