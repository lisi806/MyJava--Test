package 访问控制1;

import 访问控制.AbstractProtectedTest;
import 访问控制.PrivateTest;

public class ProtectedPackageTest extends PrivateTest {
	public void test() {
		PrivateTest demo1 = new PrivateTest();
		//		demo1.proStr = "PrivateTest";
	}

	public static void main(String[] args) {
		ProtectedPackageTest pro = new ProtectedPackageTest();
		pro.proStr = "aa";
		System.out.println(pro.proStr);
		pro.test();
		PrivateTest demo1 = new PrivateTest();

		AbstractProtectedTest test = new AbstractProtectedTest() {

			@Override
			protected void success() {

			}
		};
	}
}
