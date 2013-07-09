package 多线程与锁.中断;

public class WriterInterrupt extends Thread {    
    
   private BufferInterruptibly buff;    
    
   public WriterInterrupt(BufferInterruptibly buff) {    
       this.buff = buff;    
   }    
    
   @Override    
   public void run() {    
       buff.write();    
   }    

}
