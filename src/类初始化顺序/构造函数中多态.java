package ���ʼ��˳��;
/**
 * ���캯���ж�̬ ��������ʼ���쳣����Ϣ����Ϊ��ʱ��̬��ʱ�����Կ��ܻ�δ��ʼ��
 * @author Administrator
 *
 */
public class ���캯���ж�̬ {

	/**
	 * @author lcq
	 * @date 2013-1-7
	 * @param args
	 */
	public static void main(String[] args) {
		new ChildB();

	}

}
class SuperA {
	void draw() {
		System.out.println("SuperA draw");
	}
	SuperA(){
		draw();
	}
}
class ChildB extends SuperA{
	int a = 1;
	ChildB() {
		a = 2;
	}
	void draw() {
		System.out.println("ChildB draw:" + a);
	}
}