package 多线程;

public class ThreadJoin extends Thread{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t = new ThreadJoin(); 
		MyThread1 t1 = new MyThread1();
		t.start();
		t.join();
	}

	public void run() {
        for (int i = 0; i < 100; i++) { 
            if ((i) % 10 == 0) { 
                System.out.println("-------" + i); 
            } 
            System.out.print(i); 
            try { 
                Thread.sleep(1); 
                System.out.print("    线程睡眠1毫秒！\n"); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
	}

}

class MyThread1 extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 100; i++){
			System.out.println("test"+i);
		}
	}
}