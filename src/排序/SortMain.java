package ÅÅÐò;

import ½Ó¿Ú.inner.AInterface;

public class SortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {2,6,3,9,23,53,76,12,4,21};
		shellSort(test);
	}
	
	public static void shellSort(int [] src){
		int step = src.length/2;
		while(step > 0){
			for(int i = 0; (i+step) < src.length; i++){
				if(src[i] > src[i+step]){
					int temp = src[i];
					src[i] = src[i+step];
					src[i+step] = temp;
				}
			}
			step = step/2;
		}
		for(int a : src){
			System.out.print(a+" ");
		}
	}
}

