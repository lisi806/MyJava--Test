package 访问控制;
import static 访问控制.ProtectedTest.PROJECTION;

public class PackageTest {
//	public void test() {
//		PrivateTest demo = new PrivateTest();
//		demo.proStr = "aa";
//	}
	ProtectedTest pa = new ProtectedTest();
	public void aa(){
		pa.test();
	}
}
