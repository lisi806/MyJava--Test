
import test.json.JSONException;
import test.json.JSONObject;



public class TestJson {
	/*content:5ouJ55qE55av54uC6Z2i56ev5YiG5Y+v;mid:NjQ2MzYyOTU=;url:aHR0cDovL3Rlc3QuaHR3LmNjOjkwMDAvU2VydmVySW50ZXJmYWNlcy9hZEFwcC5kbz91PTExNCZ1\naWQ9NzE2NWMzY2RlN2YxZmQwM2FlNDJiZDRhYzA2NGRlYzcmY3Q9MDAwMV8zODI3JnNvdXJjZUlk\nPTUzNDA=;*/
	static String msg1 = "{\"body\":\"W3sidWlkIj \",\"networkType\":0,\"hasSim\":0,\"uopen\":0,msgType:10000}";
	static String msg2 = "{\"body\":W3sidWlkIj;\"networkType\":0;\"hasSim\":0;\"uopen\":0;msgType:10000}";
	
	/**/	/**
	 * @param args
	 * @throws JSONException
	 * @throws org.json.JSONException 
	 */
	public static void main(String[] args) throws JSONException, org.json.JSONException {
		String destMsg = string2Json(msg1);

		test.json.JSONObject jObject = new JSONObject(msg1);
		String body = jObject.getString("body");
		System.out.println("1cq:"+body);
		
		org.json.JSONObject jObject2 = new org.json.JSONObject(msg2);
		String body2 = jObject2.getString("body");
		System.out.println("2cq:"+body2);
	}
	
	static String string2Json(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
//			case '\"':
//				sb.append("\\\"");
//				break;
			case '\\':
				sb.append("\\\\");
				break;
			case '/':
				sb.append("\\/");
				break;
			case '\b':
				sb.append("\\b");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			default:
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
