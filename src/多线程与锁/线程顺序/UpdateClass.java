package 多线程与锁.线程顺序;


public class UpdateClass extends Thread{
    UpdateThread updateThread;
    boolean mPendingUpdate;
    
    public void test(){
        for (int i = 0; i < 6; i++) {
            notifyUpdate(i);
        }
    }
    
    public void notifyUpdate(int i) {
        synchronized (this) {
            mPendingUpdate = true;
            if (updateThread == null) {
                updateThread = new UpdateThread(i);
                updateThread.start();
            }
        }
    }
    class UpdateThread extends Thread {
        int mPercent;

        public UpdateThread(int percent) {
            this.mPercent = percent;
        }
        @Override
        public void run() {
            for (;;) {
                synchronized (UpdateClass.this) {
                    if (updateThread != this) {
                        throw new IllegalStateException(
                                "multiple UpdateThreads in DownloadService");
                    }
                    if (!mPendingUpdate) {
                        updateThread = null;
                        return;
                    }
                    mPendingUpdate = false;
                }

                super.run();
                System.out.println("before print " + "id:" + getName() + ":"
                        + mPercent);
                for (int i = 0;i<500;i++)
                    System.out.print(i);
                
                // System.out.println("after print "+"id:"+getId());

            }

        }
    }
    
    

    

}
