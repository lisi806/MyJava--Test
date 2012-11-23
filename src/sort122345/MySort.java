package sort122345;

import java.util.Set;
import java.util.TreeSet;

public class MySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] number = new char[] { '1', '2', '2', '3', '4', '5' };
		
	}
	public static Set <String> result = new TreeSet<String>();
	
	public static void perm(char [] number, int swap) {
		for (int i = 0; i < number.length; i++) {
			if(i==number.length-1) {
				out(result);
			} else {
				
				perm(number,i+1);
			}
				
		}
			
	}
	
	public static void out(Set<String> set) {
		
	}
}
