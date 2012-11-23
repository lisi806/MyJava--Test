package Ö¸Õë;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	List listCache  = new ArrayList<String>();
	int i = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTest listTest = new ListTest();
		List temp = listTest.getData();
		
		listTest.test(temp);
		System.out.println("temp:"+temp.get(0));
		System.out.println("size:"+listTest.listCache.size());
		
		temp = listTest.getData();
		listTest.test(temp);
		System.out.println("temp:"+temp.get(0));
		System.out.println("size:"+listTest.listCache.size());
	}

	public  void test(List list){
System.out.println("listCache:"+i+listCache);
		if(listCache == null){
			listCache = list;
System.out.println("listCache:"+i+listCache);			
			return;
		}
		listCache.addAll(list);
	}
	
	public  List getData(){
		if(i>0) {
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("22");
			i--;
			return arr;
		}else {
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("11");	
			i++;
			return arr;
		}
	}
}
