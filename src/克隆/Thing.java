package 克隆;

import java.util.ArrayList;
/**
 * 深克隆，其中mList为引用类型，所以clone方法并没有克隆到mList
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
			// 区别就在这里
			thing.mList = (ArrayList)this.mList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
}
