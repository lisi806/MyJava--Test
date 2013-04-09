package ��¡;

import java.util.ArrayList;
/**
 * ���¡������mListΪ�������ͣ�����clone������û�п�¡��mList
 * @author lcq
 */
public class Thing implements Cloneable {
	private String mStr;
	private ArrayList mList;

	@Override
	public Thing clone() {
		Thing thing = null;
		try {
			thing = (Thing) super.clone();
			// �����������
			thing.mList = (ArrayList)this.mList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
}
