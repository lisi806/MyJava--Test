package ���߳�����.calculator;

import ���߳�����.calculator.Calculator;

public class ReaderResult extends Thread {
	Calculator c;

	public ReaderResult(Calculator c) {
		this.c = c;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println(Thread.currentThread() + "�ȴ�������������");
				c.wait();
				c.notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + "������Ϊ��" + c.total);
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// ����10���̣߳��ֱ��ȡ������
		for (int i = 0; i < 5; i++) {
			new ReaderResult(calculator).start();
		}
		// ���������߳�
		calculator.start();
	}
}