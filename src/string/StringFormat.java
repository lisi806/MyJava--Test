package string;

import java.util.regex.Pattern;

public class StringFormat {
	public static void main(String[] arg){
		 String result = String.format(
	                "content://mms-sms/searchSuggest?pattern=%s",
	                "i love ");
		 String result1 = String.format("smile_%02d", 3);
		 System.out.println(result+"\n"+result1);
	}
}
