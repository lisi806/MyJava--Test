package 多线程与锁.calculator;

import 多线程与锁.calculator.Calculator;

public class ReaderResult extends Thread {
	Calculator c;

	public ReaderResult(Calculator c) {
		this.c = c;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println(Thread.currentThread() + "");
				c.wait();
				c.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + "" + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		for (int i = 0; i < 5; i++) {
			new ReaderResult(calculator).start();
		}
		calculator.start();
	}
}