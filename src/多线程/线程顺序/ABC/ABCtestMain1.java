package 多线程.线程顺序.ABC;

public class ABCtestMain1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<3;i++){  
            new PrintThread().start();  
        }  
	}
	private final static String code = "ABC";  
    private static int index = 0;  
      
    private static class PrintThread extends Thread{  
        public void run(){  
            for(;;){  
                synchronized (code) {
                    if(index == 3*10) {
                    	System.out.println();
                    	//index = 0;
                    	return;  
                    }
                    System.out.print(code.charAt(index++ % 3));   
                }
            }  
        }  
    } 
}


   