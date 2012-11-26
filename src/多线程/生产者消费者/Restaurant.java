package 多线程.生产者消费者;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 功能：
 * 
 * @author： 传秋
 * @date：2012-2-21
 */
class Meal {
	private final int orderNum;

	public Meal(int orderNum) {
		this.orderNum = orderNum;
	}

	public String toString() {
		return "Meal " + orderNum;
	}
}
/**
 * 
 * @author xiaoQLu
 *
 */
class WaitPerson implements Runnable {
	Restaurant restaurant;

	public WaitPerson(Restaurant r) {
		this.restaurant = r;
	}

	public void run() {
		while (!Thread.interrupted()) {
			synchronized (this) {
				try {
					while (restaurant.meal == null)
						wait();
					System.out.println("wait persion got " + restaurant.meal);
					synchronized (restaurant.chef) {
						restaurant.meal = null;
						restaurant.chef.notifyAll();
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}

class Chef implements Runnable {
	private Restaurant restaurant;
	private int count = 0;
	public Chef(Restaurant r) {
		this.restaurant = r;
	}
	public void run () {
		while (!Thread.interrupted()) {
			synchronized (this) {
				try {
					while (restaurant.meal != null)
						wait();
					if ( ++count==10 ) {
						System.out.println("out of food" + restaurant.meal);
						restaurant.exec.shutdownNow();
					}
					System.out.println("Order up! ");
					synchronized (restaurant.res) {
						restaurant.meal = null;
						restaurant.res.notifyAll();
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	
		
	}
}

public class Restaurant {
	Meal meal;
	Restaurant res;
	Chef chef;
	ExecutorService exec = Executors.newCachedThreadPool();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
