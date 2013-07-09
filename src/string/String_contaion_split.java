package string;

public class String_contaion_split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		String [] res = str.split(";");
		for(int i = 0 ;i<res.length;i++)
			System.out.println(res[i]);
		System.out.println("aa:"+str.contains(";"));
	}

}
