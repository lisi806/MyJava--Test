package ∂‡œﬂ≥Ã.À≥–Ú;

public class OrderClass {
	boolean pendingUpdate;
	UpdateThread updateThread;
	static OrderClass sOutClass;
	public void update(int i)  {
		
		synchronized (this) {
			sOutClass = this;
			System.out.println("OrderClass:update:"+i);
			pendingUpdate = true;
			if (updateThread == null) {	
				System.out.println("OrderClass:newThread");
				updateThread = new UpdateThread(i);
				updateThread.start();
			}
		}
	}

	class UpdateThread extends Thread {
		int num;
		OrderClass inClass;
		public UpdateThread(int i){
			this.num = i;
		}
		
		@Override
		public void run() {
			for (;;) {
				synchronized(OrderClass.this){
					inClass = OrderClass.this;
					System.out.println("OrderClass:run:"+num+"!!!!!!!!!!!!!!!"+(inClass==sOutClass));					
					if(!pendingUpdate){
						updateThread = null;
						try {
							sleep(15L);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
System.out.println("done with something");						
						return ;
					}
					pendingUpdate = false;
					
				}
				System.out.println("do something"+Thread.currentThread().getPriority());
				try {
					sleep(5L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
