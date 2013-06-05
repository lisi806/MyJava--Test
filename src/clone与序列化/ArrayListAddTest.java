package clone”Î–Ú¡–ªØ;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ºÃ≥–.inner.Super;

public class ArrayListAddTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ArrayList <A> aList = new ArrayList <A>();
		ArrayList <A> bList = new ArrayList <A>();
		A a = new A("aa");
		aList.add(a);
		
		//copy(aList,bList);
		
		try {
			bList = (ArrayList<A>) deepList(aList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A b = bList.get(0);
		b.name = "bb";
		
		for(A aa : bList){
			System.out.println("bList:"+aa.name);
		}
		
		for(A aa : aList){
			System.out.println("aList:"+aa.name);
		}
		
	}
	
	private static void copy(List<A> src,List<A> dest){
        for (int i = 0 ;i < src.size() ; i++) {
            try {
				A obj = (A)src.get(i).clone();
				dest.add(obj);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}            
            
        }
	}
	
	public static <T> List<T> deepList(List<T> srcList) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
		objectOutputStream.writeObject(srcList);
		
		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOutputStream.toByteArray());
		ObjectInputStream objInputStream = new ObjectInputStream(byteIn);
		List<T> readObject = (List<T>)objInputStream.readObject();
		return readObject;
	}
}

class A implements Serializable{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public A(String str){
		this.name = str;
	}
	public A(){
	}
	public String name;
}
