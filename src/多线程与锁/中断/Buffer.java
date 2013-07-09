package 多线程与锁.中断;

public class Buffer {

    private Object lock;

    public Buffer() {
        lock = this;
    }

    public void write() {
        synchronized (lock) {
            long startTime = System.currentTimeMillis();
            System.out.println("开始写");
            for (;;)// 
            {
                if (System.currentTimeMillis()
                        - startTime > Integer.MAX_VALUE)
                    break;
            }
            System.out.println("完成写");
        }
    }

    public void read() {
        synchronized (lock) {
            System.out.println("开始读");
        }
    }
}
