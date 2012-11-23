package 多线程;
/**
 * 功能：
 * @author： 传秋
 * @date：2011-7-19
 */

public class ThreadAdd implements Runnable{
	private int i;
	int result[] = new int [5];
	
	public void run(){
		int temp = i+i;
		System.out.println(Thread.currentThread().getName()+":"+i+"+"+i);
		result[i] = temp;
		i++;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadAdd threadA = new ThreadAdd();
		for(int k = 0; k < 5; k++){
			
			new Thread(threadA).start();
		}
	}

}
