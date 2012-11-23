package ¼¯ºÏ;

import java.util.ArrayList;

public class SystemArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ori = new ArrayList<String>();
		ArrayList<String> dest = new ArrayList<String>();
		ori.add("a");
		ori.add("b");
		System.arraycopy(ori, 0, dest, 0, ori.size());
	}

}
