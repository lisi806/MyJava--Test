
package ���߳�����.�ж�;

public class TestMain {
    public static void main(String[] args) {
        Buffer buff = new Buffer();

        final Writer writer = new Writer(buff);
        final Reader reader = new Reader(buff);

        writer.start();
        reader.start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                long start = System.currentTimeMillis();
                for (;;) {
                    // ��5����ȥ�ж϶�
                    if (System.currentTimeMillis()
                            - start > 2000) {
                        System.out.println("�����ˣ������ж�");
                        reader.interrupt();
                        break;
                    }

                }

            }
        }).start();

    }
}
