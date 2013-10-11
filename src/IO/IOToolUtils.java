package IO;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class IOToolUtils {
	static File file = new File("d:/num.txt");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		writeFile();
		readFile();

	}

	public static int readFile() {
		int result = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String count = reader.readLine();
			if(count != null){
				result = Integer.parseInt(count);
				System.out.println("lcq:" + result);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void writeFile() {
		int current = readFile();
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(current);
		out.print(++current);
		out.close();
		readFile();
	}
}
