package 泛型;

import java.util.List;

/**
 * 功能：
 * @author： 传秋
 * @date：2012-2-27
 */

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? extends Fruit> list = null;
		//报错
//		list.add(new Apple());
	}
}
