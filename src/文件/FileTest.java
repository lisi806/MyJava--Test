package нд╪Ч;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:/xiaoq/a.txt");
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(file);
			OutputStreamWriter osWriter= new OutputStreamWriter(os);
			osWriter.write("I love you!");
			System.out.println(file.getAbsoluteFile());
			System.out.println(file.getPath());
			osWriter.flush();
			osWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
