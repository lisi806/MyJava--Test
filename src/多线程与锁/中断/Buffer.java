
package ���߳�����.�ж�;

public class Buffer {

    private Object lock;

    public Buffer() {
        lock = this;
    }

    public void write() {
        synchronized (lock) {
            long startTime = System.currentTimeMillis();
            System.out.println("��ʼ�����buffд�����ݡ�");
            for (;;)// ģ��Ҫ����ܳ�ʱ��
            {
                if (System.currentTimeMillis()
                        - startTime > Integer.MAX_VALUE)
                    break;
            }
            System.out.println("����д����");
        }
    }

    public void read() {
        synchronized (lock) {
            System.out.println("�����buff������");
        }
    }
}
