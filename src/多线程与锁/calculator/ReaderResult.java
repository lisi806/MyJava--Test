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
				System.out.println(Thread.currentThread() + "等待计算结果。。。");
				c.wait();
				c.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + "计算结果为：" + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// 启动10个线程，分别获取计算结果
		for (int i = 0; i < 5; i++) {
			new ReaderResult(calculator).start();
		}
		// 启动计算线程
		calculator.start();
	}
}