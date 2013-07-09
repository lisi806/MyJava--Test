
package 多线程与锁;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SynchroizedThread {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            doPost(new MyThread111());
        }
    }

    public synchronized static void doNext(Thread thread) {
        thread.start();
    }
    
    public synchronized static void doPost(Runnable command){
        Executor workExecutor = Executors.newFixedThreadPool(2);
        workExecutor.execute(command);
    }
}

class MyThread111 extends Thread {
    @Override
    public void run() {
        long current = System.currentTimeMillis();
        System.out.println(getId() + "开始运行");
        while (System.currentTimeMillis() - current < Integer.MAX_VALUE) {
            
        }
        System.out.println("do complete...");
    }
}