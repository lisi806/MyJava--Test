package ���߳�����.�ж�;

public class TestInterruptMain {    
    public static void main(String[] args) {    
        BufferInterruptibly buff = new BufferInterruptibly();    
     
        final WriterInterrupt writer = new WriterInterrupt(buff);    
        final ReaderInterrupt reader = new ReaderInterrupt(buff);    
     
        writer.start();    
        reader.start();    
     
        new Thread(new Runnable() {    
     
            @Override    
            public void run() {    
                long start = System.currentTimeMillis();    
                for (;;) {    
                    if (System.currentTimeMillis()    
                            - start > 5000) {    
                        System.out.println("�����ˣ������ж�");    
                        reader.interrupt();    
                        break;    
                    }    
                }    
            }    
        }).start();    
     
    }    
}   
