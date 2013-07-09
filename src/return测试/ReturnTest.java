package return测试;
public  class ReturnTest {

	/**
	 * @param args add by zxx ,Dec 9, 2008
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ReturnTest().test());;
		ReturnTest t1 = new ReturnTest();
		int a = t1.test();
		System.out.println(a);
	}

	static int test()
	{
		int x = 1;
		try
		{
			return x;
		}
		finally
		{
			++x;
			System.out.println(x);
		}
	}
	
}

