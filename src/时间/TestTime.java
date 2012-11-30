package 时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 功能：
 * @author： 传秋
 * @date：2011-5-2
 */

public class TestTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		String a = "1970-1-1 "+"23:59:59";
		SimpleDateFormat format = new SimpleDateFormat("1970-1-1 HHmmss");
		//System.out.println(format.format(date));
		try {
			SimpleDateFormat format1 = new SimpleDateFormat("1970-1-1 HH:mm:ss");
			
			Date date = new Date();
			Date currentDate = format1.parse(format1.format(date));
			
			Date startDate = format1.parse(a);
			
			System.out.println(currentDate.compareTo(startDate));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
