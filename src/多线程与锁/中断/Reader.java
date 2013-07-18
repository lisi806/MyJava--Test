
package 多线程与锁.中断;

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
        buff.read();// 这里估计会一直阻塞
        System.out.println("读结束");
    }

}
