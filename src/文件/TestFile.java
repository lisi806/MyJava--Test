package нд╪Ч;

import java.io.File;
import java.io.IOException;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new File("d:/test", ".nomedia").createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
