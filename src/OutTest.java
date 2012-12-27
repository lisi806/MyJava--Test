import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.StringTokenizer;



public class OutTest {
	static Map mMap = new LinkedHashMap();
	static String aa = "eyJjb250ZW50IjoiY+a1i+ivleaYryDouqvkuIoiLCJjZWxsTnVtIjoiMTAwNjY2NjY2IiwidGl0\nbGUiOiIiLCJoYXNSZWNlaXB0IjoiMSIsInNob3dUeXBlIjoiMCIsIm1pZCI6IjY4NjMyMDU1Iiwi\ndXJsIjoiaHR0cDovL3Rlc3QuaHR3LmNjOjkwMDAvU2VydmVySW50ZXJmYWNlcy9hZEFwcC5kbz91\nPTE1MCZ1aWQ9Y2I3YWY3NTI4OWNjMDlhMzAwMjRmMjQzZjIyYzc0NjMmY3Q9MDAwMV8zODk0JnNv\ndXJjZUlkPTUyMzQifQ==";
	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("restriction")
	public static void main(String[] args) throws IOException {
		String a = "http://bbx2.sj.91.com/pic.ashx?act=407&resid=286129&resname=%e5%bf%83%e5%bf%83%e7%9b%b8%e6%83%9c&catename=%e5%88%9b%e6%84%8f%e8%ae%be%e8%ae%a1&downloadurl=http%3a%2f%2fimage.91rb.com%2fWallpaper%2f2012%2f11%2f5%2fd041ecd347d14081bb965af2aa04760b.jpg&size=545.00KB&mt=4&sv=3.2.6&pid=2&dst=1&rslt=480*800&osv=4.0.3&cpu=armeabi-v7a,armeabi&imei=866780016277022&imsi=460023185086038&nt=10&dm=HUAWEI+C8812E";
		initUrl(a);
		for(Object object : mMap.entrySet()){
			System.out.println(((Entry)object).getKey() + ":" + ((Entry)object).getValue());
		}
	}
	
	 public static void initUrl(String paramString)
	 {
		StringBuilder mHeaderBuilder;
	    mMap.clear();
	    int i = paramString.indexOf("?");
	    if (i == -1)
	    {
	      mHeaderBuilder = new StringBuilder(paramString);
	      return;
	    }
	    mHeaderBuilder = new StringBuilder(paramString.substring(0, i));
	    StringTokenizer localStringTokenizer = new StringTokenizer(paramString.substring(i + 1), "&", false);
	    while (true)
	    {
	      if (localStringTokenizer.hasMoreElements()){
	    	  String[] arrayOfString;
	    	  arrayOfString = localStringTokenizer.nextToken().split("=");
	    	  if (arrayOfString.length != 2)
	    		  continue;
	    	  mMap.put(arrayOfString[0].toLowerCase(), arrayOfString[1]);
	      }
	    }
	  }
}
