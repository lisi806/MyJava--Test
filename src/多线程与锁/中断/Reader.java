
package ���߳�����.�ж�;

public class Reader extends Thread {

    private Buffer buff;

    public Reader(Buffer buff) {
        this.buff = buff;
    }

    @Override
    public void run() {
//        try {
//            sleep(5000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        buff.read();// ������ƻ�һֱ����
        System.out.println("������");
    }

}
