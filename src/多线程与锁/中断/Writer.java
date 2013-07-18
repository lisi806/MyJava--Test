package 多线程与锁.中断;

public class Writer extends Thread {    
    
    private Buffer buff;    
     
    public Writer(Buffer buff) {    
        this.buff = buff;    
    }    
     
    @Override    
    public void run() {    
        buff.write();    
    }    
     
} 