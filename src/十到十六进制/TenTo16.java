package ʮ��ʮ������;
/**
 * ���ܣ�
 * @author�� ����
 * @date��2011-8-7
 */

public class TenTo16 {
	public static void main(String []arg) {
		int a = 17;
		String str = Integer.toString(a,16);
		char [] ch=str.toCharArray();
		for(int i = 0; i<ch.length ;i++){
			if('1'==ch[i])
				System.out.println((int)ch[i]);
		}
//		System.out.println(str);
	}
}
