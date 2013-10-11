

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Title: Description: Copyright: Copyright (c) 2013 Company:深圳彩讯科技有限公司
 * 
 * @author licq 2013-7-3
 * @version 1.0
 */
public class Encode {
	private static Encode instance = new Encode();
	private static final String encode = "utf-8";// "ISO-8859-1"
	private SecretKeySpec skeySpec;

	// private String aesKey = "";
	// private SecretKeySpec aeskeySpec = null;
	// private PublicKey publicKey = null;

	private Encode() {

	}

	public static Encode getInstance() {
		return instance;
	}

	public byte[] encryptProgram(String source) throws Exception {
		// LogUtils.println("start encrypt time: "
		// + System.currentTimeMillis() + "\nsource: " + source);
		String aesKey = "134e3265829ff82daf16e7b740a600b5";
		String aesCode = aesencrypt(aesKey, source);// AES对内容加密
		byte[] targetStream = compressToByte(aesCode);
		// LogUtils.println("finish encryp time: "
		// + System.currentTimeMillis());
		return targetStream;
	}

	/*
	 * 字符串压缩为字节数组
	 */
	private byte[] compressToByte(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(str.getBytes(encode));
			gzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out.toByteArray();
	}

	private String aesencrypt(String strKey, String strIn) throws Exception {
		if (skeySpec == null) {
			skeySpec = aesgetKey(strKey);
		}
		// SecretKeySpec skeySpec = aesgetKey(strKey);
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		IvParameterSpec iv = new IvParameterSpec("0102030405060708".getBytes());
		// LogUtils.println("ready aes encrypt:"
		// + System.currentTimeMillis());
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
		byte[] encrypted = cipher.doFinal(strIn.getBytes());

		return new BASE64Encoder().encode(encrypted);
	}

	private SecretKeySpec aesgetKey(String strKey) throws Exception {
		byte[] arrBTmp = strKey.getBytes();
		byte[] arrB = new byte[16]; // 创建一个空的16位字节数组（默认值为0）

		for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
			arrB[i] = arrBTmp[i];
		}

		SecretKeySpec skeySpec = new SecretKeySpec(arrB, "AES");

		return skeySpec;
	}
}
