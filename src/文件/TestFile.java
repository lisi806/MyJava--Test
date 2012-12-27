package нд╪Ч;

import java.io.File;
import java.io.IOException;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFile("d:/test/aa/a.txt");
		new File("d:/test1/aa/a.txt").mkdirs();
		try {
			new File("d:/test", ".nomedia").createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static File createFile(String s)
	{
		File file = new File(s);
		File file1 = new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(File.separator)));
		System.out.println(file1);
		if (!file1.exists())
		{
			createFile(file1.getPath());
			file1.mkdirs();
		}
		return file;
	}
}
