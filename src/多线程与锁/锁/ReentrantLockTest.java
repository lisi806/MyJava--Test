package 多线程与锁.锁;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    /**
     * @author lcq 2013-1-11
     * @param args
     */
    public static void main(String[] args) {
        final ExecutorService exec = Executors.newFixedThreadPool(4);
        final ReentrantLock lock = new ReentrantLock();
        final Condition con = lock.newCondition();
        final int time = 5;
        
        class MyThread extends Thread {

            public void run() {
                System.out.println(this.getId()+"Pre " + lock);
                lock.lock();
                try {
                    int i =0;
                    while(i < 5) {
                        System.out.println(this.getId()+"获取锁");
                        con.await(time, TimeUnit.SECONDS);
                        System.out.println(this.getId()+"continue次数:"+i);
                        i ++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(this.getId()+"Post " + lock.toString());
                    lock.unlock();
                }
            }
        };

        for (int index = 0; index < 2; index++)
            exec.submit(new MyThread());
        exec.shutdown();
    }

}
