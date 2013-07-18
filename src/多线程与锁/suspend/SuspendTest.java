package 多线程与锁.suspend;

public class SuspendTest {

	public static void main(String[] args) {

		TestThreadMethod t1 = new TestThreadMethod("t1");

		TestThreadMethod t2 = new TestThreadMethod("t2");

		t1.start();// 

		 t1.start(); //

//		t2.start();// 

	}

}

class TestThreadMethod extends Thread {

	public static int shareVar = 0;

	public TestThreadMethod(String name) {

		super(name);

	}

	public synchronized void run() {

		if (shareVar == 0) {

			for (int i = 0; i < 5; i++) {

				shareVar++;

				if (shareVar == 5) {

					this.suspend();// 锟斤拷1锟斤拷

				}

			}

		} else {

			System.out.print(Thread.currentThread().getName());

			System.out.println(" shareVar = " + shareVar);

			this.resume();// 锟斤拷2锟斤拷

		}

	}

}