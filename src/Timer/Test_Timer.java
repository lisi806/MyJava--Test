package Timer;

import java.util.Timer;
import java.util.TimerTask;


public class Test_Timer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer time = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("oh no");
//				time.cancel();
			}
		};
		time.schedule(task, 5*1000);
	}

}
