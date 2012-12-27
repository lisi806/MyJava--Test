package “Ï≤ΩÕ¨≤Ω;

import java.util.Timer;
import java.util.TimerTask;

public class AsyncToSync {
	static Object object ;
	static boolean isFinished = false;
	static String result;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AsyncToSync asyncToSync = new AsyncToSync();
		asyncToSync.doInBack();
//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			@Override
//			public void run() {
//				synchronized (object) {
//					System.out.println("time is out");
//					isFinished = true;
//					object.notifyAll();
//				}
//			}
//		}, 3000);
		asyncToSync.getResult();
	}
	private void doInBack(){
		new Thread(){
			@Override
			public void run() {
				//synchronized (object) {
					System.out.println("do in back");
					try {
						sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("do complete");
					isFinished = true;
					synchronized (object) {
						result = "ok";
						object.notifyAll();
					}
				//	object.notifyAll();
				//}
			}
		}.start();
	}
	private void getResult(){
		if(result == null ) {
			synchronized (object) {
				if(!isFinished) {
					System.out.println("wait...");
					try {
						object.wait(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("ok");
			}
		}
		System.out.println("result:" + result);
		
	}
//	private void mNotify(){
//		synchronized (object) {
//			object.notifyAll();
//		}
//	}
	
}
