package 强制类型转换;

public class TypeChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int i = 785;
		float f = (float) 1.5678;
		double d =1.5;		
		System.out.println(f==(int)(float)i);
		System.out.println( f==((d+f) -f) );
		
	}

}
/**
int i = 785;
float f = 1.5678;
double d = 1.5;
f=(int)(float)I居然是正确的？？？
 是错误的？
*/