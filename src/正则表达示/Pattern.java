package 正则表达示;

public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String ori = "wwwbaiducom";
//		System.out.println(ori.replaceAll("www/.", " www."));
		String ori = "teset||123";
		String [] res = ori.split("\\u007C\\u007C");
		for (int i =0;i < res.length;i++){
			System.out.println(res[i]);
		}
	}

}
