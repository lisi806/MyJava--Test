package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class NetworkTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getBitmap("http://www.google.com.hk");
	}

	private static void  getBitmap(String url) 
    {
        //from web
            URL imageUrl;
			try {
				imageUrl = new URL(url);
				HttpURLConnection conn;
				conn = (HttpURLConnection)imageUrl.openConnection();
				conn.setConnectTimeout(30);
	            conn.setReadTimeout(30);
	            conn.setInstanceFollowRedirects(true);
	            InputStream is=conn.getInputStream();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
	
}
