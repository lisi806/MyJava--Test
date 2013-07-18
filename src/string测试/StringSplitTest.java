package string测试;

public class StringSplitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "http://test.htw.cc:9000/FS/upload/store/app/images/2012/07/13430982700802869.png|http://test.htw.cc:9000/FS/upload/store/app/images/2012/07/13430982702857615.jpg";
		for(String temp : str.split("\\|"))
			System.out.println(temp);
	}

}
