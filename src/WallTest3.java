import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WallTest3 {
	public static String requrl=null;
	public String doPost(String reqUrl,String json) throws Exception{
		String responseContent="";
		try {
			URL url = new URL(reqUrl);
			URLConnection con = url.openConnection();
			con.setDoOutput(true);
			con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            OutputStream out = con.getOutputStream();//new OutputStreamWriter(con.getOutputStream());
            out.write(Encode.getInstance().encryptProgram(json));
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(con
                    .getInputStream()));
            String line = "";
            StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (line != null) {
				tempStr.append(line);
				tempStr.append(crlf);
				line = br.readLine();
			}
			responseContent = tempStr.toString();
			System.out.println(responseContent);
		} catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseContent;
	}
	public void authUser() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:authuser";
		doPost(reqUrl,"{username:'15017914110',password:'caixun111'}");
	}
	public void getAdList() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:walllist&version=2";
//		String reqUrl="http://221.176.9.136:8080/wall/wall?func=wall:walllist";
		doPost(reqUrl,"{appKey:'321456',curPage:1,imei:'866780016277022',mac:'0c:37:dc:66:b2:2f',pid:1}");
	}
	public void getAdDetail() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:addetail&version=2";
		doPost(reqUrl,"{ADID:1,appKey:'321456'}");
	}
	public void credtissave() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:credtissave&version=2";
		doPost(reqUrl,"{ADID:1,appKey:'321456',imei:'123123',mac:'10:12:12:10:01',present:12,sendTime:'20130612121212'}");
	}
	public void actionlog() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:actionlog&version=2";
		doPost(reqUrl,"{ADID:1,imei:'123123',mac:'10:12:12:10:01',appKey:'1231231',action:'1',sdkVersion:'1.0',osVersion:'1.1',dm:'1',screenxy:'320*480',density:'1',pid:'1'}");
	}
	public void mcurrency(String username) throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:mcurrency";
		doPost(reqUrl,"{ADID:'1',appKey:'321456',imei:'123123',mac:'10:12:12:10:01',action:'1',passID:'"+username+"',createTime:'20130612121212'}");
	}
	public void IsBlankList() throws Exception{
		String reqUrl=requrl+"/wall/wall?func=wall:isBlackList&version=2";
		doPost(reqUrl,"{appKey:'321456',packageName:'3234'}");
	}
	private String NullToEmpty(String str){
		if (str==null) {
			return "";
		}else {
			return str;
		}
	}
	/**
	 * @autor Administrator(duanyj)
	 * @date 2013-7-3 下午12:41:25
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		requrl="http://localhost:8080";
		requrl="http://192.168.9.90:22291";
		//生产线
//		requrl="http://221.176.9.136:8080";
		WallTest3 wallTest=new WallTest3();
//		wallTest.mcurrency("8234231");
//		wallTest.authUser();
		wallTest.getAdList();
//		wallTest.adDetail();
//		wallTest.IsBlankList();
//		wallTest.credtissave();
//		wallTest.actionlog();
	}

}
