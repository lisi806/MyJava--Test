package 随机数;
/**
 * 功能：
 * @author： 传秋
 * @date：2011-7-19
 */

public class GenRandom {
	public static int genRand(int begin, int end){
		return (int)(Math.random()*(end-begin+1)+begin);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println(genRand(3,7));		
	}

}
