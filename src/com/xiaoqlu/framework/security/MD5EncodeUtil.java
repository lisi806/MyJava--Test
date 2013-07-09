package com.xiaoqlu.framework.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Title: Description: Copyright: Copyright (c) 2013 Company:深圳彩讯科技有限公司
 * 
 * @author licq 2013-7-9
 * @version 1.0
 */
public class MD5EncodeUtil {

	public static String encodeMD5(byte[] toencode) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.reset();
			md5.update(toencode);
			return HexEncode(md5.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String HexEncode(byte[] toencode) {
		StringBuilder sb = new StringBuilder(toencode.length * 2);
		for (byte b : toencode) {
			sb.append(Integer.toHexString((b & 0xf0) >>> 4));
			sb.append(Integer.toHexString(b & 0x0f));
		}
		return sb.toString().toUpperCase();
	}
}
