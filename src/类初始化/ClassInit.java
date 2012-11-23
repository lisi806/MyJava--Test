package ¿‡≥ı ºªØ;

import java.util.HashSet;

public class ClassInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cache.getInstance());
	}

	private static class Cache {
	    private static Cache sInstance = new Cache();
	    static Cache getInstance() {System.out.println("ok"); return sInstance; }
	    private final HashSet<Object> mCache;
	    private Cache() {
	        mCache = new HashSet<Object>(10);
	    }
	}
	
	
}

