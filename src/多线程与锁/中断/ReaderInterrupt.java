
package ���߳�����.�ж�;

public class ReaderInterrupt extends Thread {

    private BufferInterruptibly buff;

    public ReaderInterrupt(BufferInterruptibly buff) {
        this.buff = buff;
    }

    @Override
    public void run() {
        try {
            buff.read();// �����յ��жϵ��쳣���Ӷ���Ч�˳�
        } catch (InterruptedException e) {
            System.out.println("�Ҳ�����");
        }
        System.out.println("������");
    }

}
