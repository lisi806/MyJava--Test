﻿package 多线程与锁;

public class WaitTest {
	public static void main(String[] args){
		ThreadB threadB = new ThreadB();
		threadB.start();
		System.out.println("1-->"+System.currentTimeMillis());
		float result = 1000000000;;
		for(int i = 1; i < 1000000; i++) {
		    result /= i; 
		}
		synchronized (threadB) {
			System.out.println("WaitTest等待threadB完成计算");
			try {
			    System.out.println("2-->"+System.currentTimeMillis());
				threadB.wait();
				System.out.println("3-->"+System.currentTimeMillis());
				System.out.println("waiting over……");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("4-->"+System.currentTimeMillis());
			System.out.println("b的计算结果:"+threadB.result);
		}
	}
}

class ThreadB extends Thread {
	int result = 0;
	@Override
	public void run(){
		System.out.println("5-->"+System.currentTimeMillis());
		synchronized(this){
			System.out.println("6-->开始计算"+System.currentTimeMillis());
			for (int i =0; i < 100; i++) {
				result += i;
			}
			notify();
			try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			System.out.println("ThreadB完成计算");
		}
		System.out.println("7-->"+System.currentTimeMillis());
	}
}