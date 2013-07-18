package innerClass;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;

/**
 * 功能：
 * @author： 传秋
 * @date：2012-3-30
 */

public class InTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Out out = new Out();
	}

}

class Out{
	public Out () {
		JButton jbtn = new JButton();
		jbtn.setAction(new Action() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void setEnabled(boolean b) {
				// TODO Auto-generated method stub
				
			}
			
			public void removePropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			public void putValue(String key, Object value) {
				// TODO Auto-generated method stub
				
			}
			
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Object getValue(String key) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public void addPropertyChangeListener(PropertyChangeListener listener) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
