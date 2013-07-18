package 集合;

import java.util.HashMap;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long,String> map = new HashMap<Long, String>();
		String aString = "aa";
		long a = Long.parseLong("122");
		long b = 122L;
		aString = "bb";
		map.put(a, aString);
		HashMap<Long,String> mapDest = new HashMap<Long, String>();
		mapDest.put(22L, "22");
		mapDest.putAll(map);
		for (Long string : mapDest.keySet()) {
			System.out.println(string);
		}
//		System.out.println(map.get(b));
	}

}
