package 多线程与锁;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class synchronouQueue_Thread {

    public static void main(String[] args) {
        // 定义一个Semaphore对象，他就相当于一把锁一样。
        final Semaphore sema = new Semaphore(1);
        // 长生一个阻塞的队列，这个队列很特殊，当插入一个数据的时候，必须等待另外一个线程进行曲数据操作，当要取数据的时候也要等待另外一个线程插入数据，
        // 它实现的就是很短的时间内在队列中存放数据，实际上队列中是没有任何一个元素的额、
        // 当插入一个数据就会立即被另外一个线程取走，后者当取走一个数据后，另外一个线程立即插入数据。
        final SynchronousQueue<String> queue = new SynchronousQueue<String>();
        for (int i = 0; i < 10; i++)
        {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    String str;
                    try {
                        sema.acquire();
                        str = queue.take();
                        String s = test.dosomething(str);
                        System.out.println(Thread.currentThread().getName() + ":--" + s);
                        sema.release();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        for (int i = 0; i < 10; i++)
        {
            String str = "lcq:" + (i + 1);
            try {
                queue.put(str);
                System.out.println("put"+str);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class test {
    public static String dosomething(String s) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String str = s + " ------ " + System.currentTimeMillis() / 1000;
        return str;
    }
}
