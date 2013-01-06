package string;

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "<td>aa</td>";
		int start = a.indexOf("<td>")+"<td>".length();
		int end = a.indexOf("</td>");
		System.out.println(a.substring(start));
		System.out.println(start + "'" + end);
	}

}
