package ���߳�����;

import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class synchronouQueue_Thread {

    public static void main(String[] args) {
        // ����һ��Semaphore���������൱��һ����һ����
        final Semaphore sema = new Semaphore(1);
        // ����һ�������Ķ��У�������к����⣬������һ�����ݵ�ʱ�򣬱���ȴ�����һ���߳̽��������ݲ�������Ҫȡ���ݵ�ʱ��ҲҪ�ȴ�����һ���̲߳������ݣ�
        // ��ʵ�ֵľ��Ǻ̵ܶ�ʱ�����ڶ����д�����ݣ�ʵ���϶�������û���κ�һ��Ԫ�صĶ
        // ������һ�����ݾͻ�����������һ���߳�ȡ�ߣ����ߵ�ȡ��һ�����ݺ�����һ���߳������������ݡ�
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
