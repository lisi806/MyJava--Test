import java.io.IOException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class OutTest implements Cloneable {
    String aa;
    Object ojb;

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {
        final SynchronousQueue workQueue = new SynchronousQueue<String>();
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + "offer:"
                                + workQueue.offer("a" + System.currentTimeMillis(), 5L, TimeUnit.MILLISECONDS));
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + "pull"
                                + workQueue.poll());
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}
