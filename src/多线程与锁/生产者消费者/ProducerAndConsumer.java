package 多线程与锁.生产者消费者;

public class ProducerAndConsumer {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		Producer producer = new Producer(10, store);
		Consumer consumer = new Consumer(3, store);
		Consumer consumer1 = new Consumer(3, store);
		producer.start();
		consumer.start();
		consumer1.start();
	}

}
/**
 * the store class
 * @author xiaoQLu
 *
 */
class Store {
	private int mTotalCount; //the total number of the store
	/*
	 * to add things to the store
	 */
	public Store(){
		this.mTotalCount = 0;
	}
	public void produce(int num) {
		synchronized (this) {
			if (mTotalCount > 100) {
				try {
					System.out.println("it is full*******");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.mTotalCount += num;
			notify();
			System.out.println("生产者开始生产" + num);
		}
	}
	
	public void consume (int num) {
		synchronized (this) {
			if (mTotalCount < 0) {
				try {
					System.out.println("it is empty#############");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.mTotalCount -= num;
			notify();
			System.out.println("消费者开始消费" + num);
		}
	}
	
	/**
	 * the method to return the total number of the store
	 * @return the total count of the store
	 */
	public int getmTotalCount() {
		return mTotalCount;
	}
}

/**
 * the producer class
 */
class Producer extends Thread{
	int needProduce;
	Store store;
	public Producer (int need, Store store){
		this.needProduce = need;
		this.store = store;
	}
	@Override
	public void run() {
		store.produce(needProduce);
	}
}
/**
 * the consumer
 * @author XiaoQLu
 *
 */
class Consumer extends Thread {
	int consumeNum;
	Store store;
	public Consumer(int num, Store store) {
		this.consumeNum = num;
		this.store = store;
	}
	@Override
	public void run() {
		store.consume(consumeNum);
	}
}
