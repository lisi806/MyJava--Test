import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;

/**
 * Title: Description: Copyright: Copyright (c) 2013 Company:深圳彩讯科技有限公司
 * 
 * @author licq 2013-7-3
 * @version 1.0
 */
public class RsaEncode {
	public static void main(String[] args) throws Exception {
		String text = "li5201314";
		String pubKey ;
		String priKey;
//		Map<String, Object> keyMap = initKey();
//		pubKey = getPublicKey(keyMap);
//		System.out.println("get pub key:" + pubKey);
//		priKey = getPrivateKey(keyMap);
//		System.out.println("get pri key:" + priKey);
//		System.out.println("--------------------------");
		
		pubKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCbUmr+cMzLM8VoQmGqVgwAwJw+SzvuY6ZDgdWxYpm2x5DEylLWNMe85ufVK5l6D9iSg7yitYE6iJByz/MtM4ChAOdMrJsoRjVSZRXuZdJjsdNqd2UKZ4kx73m+0BWj3PvUw1TClzKpNrmMGXXyyAiAuz7Lv9+XOJC5spCo6gn2ywIDAQAB";
		priKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJtSav5wzMszxWhCYapWDADAnD5LO+5jpkOB1bFimbbHkMTKUtY0x7zm59UrmXoP2JKDvKK1gTqIkHLP8y0zgKEA50ysmyhGNVJlFe5l0mOx02p3ZQpniTHveb7QFaPc+9TDVMKXMqk2uYwZdfLICIC7Psu/35c4kLmykKjqCfbLAgMBAAECgYBS+mD2tcRy+qGH5Y7PtVCMRloyXXcTEGGOxxomvgpov4zz1TMUBPaAUMuh8rz3nOeSvpZURqtXXgXtkHLVvyIECCGwpR6xH1Yl++0xSHbC7mBtszBk7Ls0STPy+vMLCygXFD2EwWIBgRlAnQ7LbkP0IwvyrzknQ6oHEq5i+VcbYQJBAPUKDH6c4q9+ZNgkb9EX7T+mJ1RqUW+DdJBKOQxci7muP42BeLs+6gLFdwoExr+EmYylvMnXYrgxuGNTiB8LVt8CQQCiRQOHo/g3HG9dA2oCFUAJvXMxRBLOyHWnqIQ49bz84PFWFJ6JoWylFyMVANwI3ucLCGO5qs0E6NsjCSTUv3mVAkAGEnGs0YZsgt1M3dpHfChM43kmBlxuPvusd6piPAjaWQ8KGqM7QJvb5bjFbsjeBhMoARNkjQnNNq4zB+bfnhBRAkBlELrcFmIYYRtzQRcbaQTTjC1ct9tG809kNu7zUwp8LdXiGUGM0v+J61ksUba5x6r7EiSalSjQL/+cWKuZ3g/pAkEA81ClNnHLfKQAnArfdf8mhFg3X20dRJnQvHc6l8Qi1hMYywRXfcdNlbIThw5DUD4yKb1lhOdTxGanHmaQ1Xc4/Q==";
		byte[] enPubKeyBytes = encryptByPublicKey(text.getBytes(),
				pubKey);
		String enPubKeyStr = encryptBASE64(enPubKeyBytes);
		System.out.println("encryptByPublicKey:" + enPubKeyStr);
		System.out.println("--------------------------");
		//请把加密的值放在这里
		enPubKeyStr = "XQKTIti1V6BF6lUx3grvCqw1R5n9fEhfJNndhNilGKsuTWDpo+/koi6mH+5CJUAyfWOPmnyeJoII7rY0Haa3Q5RW/5RCr5mT7BX4xoUFbED9ppy0Xlo/gSiEBOwOTzH9FJOKTNgB8//kETqoNZff07moYrZO4TXON219oPXxsn4=";
		byte[] input = decryptBASE64(enPubKeyStr);
		byte[] dePriKeyBytes = decryptByPrivateKey(input, priKey);
		String dePriKeyStr = new String(dePriKeyBytes);
		System.out.println("decryptByPrivateKey:" + dePriKeyStr);
	}

	public static final String KEY_ALGORTHM = "RSA";//
	public static final String SIGNATURE_ALGORITHM = "MD5withRSA";

	public static final String PUBLIC_KEY = "RSAPublicKey";//公钥
	public static final String PRIVATE_KEY = "RSAPrivateKey";//私钥

	/**
	 * 初始化密钥
	 * @return
	 * @throws Exception
	 */
	public static Map<String, Object> initKey() throws Exception {
		KeyPairGenerator keyPairGenerator = KeyPairGenerator
				.getInstance(KEY_ALGORTHM);
		keyPairGenerator.initialize(1024);
		KeyPair keyPair = keyPairGenerator.generateKeyPair();

		//公钥
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		//私钥
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

		Map<String, Object> keyMap = new HashMap<String, Object>(2);
		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);

		return keyMap;
	}

	/**
	 * 取得公钥，并转化为String类型
	 * @param keyMap
	 * @return
	 * @throws Exception
	 */
	public static String getPublicKey(Map<String, Object> keyMap)
			throws Exception {
		Key key = (Key) keyMap.get(PUBLIC_KEY);
		return encryptBASE64(key.getEncoded());
	}

	/**
	 * 取得私钥，并转化为String类型
	 * @param keyMap
	 * @return
	 * @throws Exception
	 */
	public static String getPrivateKey(Map<String, Object> keyMap)
			throws Exception {
		Key key = (Key) keyMap.get(PRIVATE_KEY);
		return encryptBASE64(key.getEncoded());
	}

	/**
	 * 用私钥加密
	 * @param data	加密数据
	 * @param key	密钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptByPrivateKey(byte[] data, String key)
			throws Exception {
		//解密密钥
		byte[] keyBytes = decryptBASE64(key);
		//取私钥
		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(
				keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
		Key privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);

		//对数据加密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);

		return cipher.doFinal(data);
	}

	/**
	 * 用私钥解密<span style="color:#000000;"></span> * @param data 	加密数据
	 * @param key	密钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptByPrivateKey(byte[] data, String key)
			throws Exception {
		//对私钥解密
		byte[] keyBytes = decryptBASE64(key);

		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(
				keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
		Key privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
		//对数据解密
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);

		return cipher.doFinal(data);
	}

	/**
	 * 用公钥加密
	 * @param data	加密数据
	 * @param key	密钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptByPublicKey(byte[] data, String key)
			throws Exception {
		//对公钥解密
		byte[] keyBytes = decryptBASE64(key);
		//取公钥
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
		Key publicKey = keyFactory.generatePublic(x509EncodedKeySpec);

		//对数据解密
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);

		return cipher.doFinal(data);
	}

	/**
	 * 用公钥解密
	 * @param data	加密数据
	 * @param key	密钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptByPublicKey(byte[] data, String key)
			throws Exception {
		//对私钥解密
		byte[] keyBytes = decryptBASE64(key);
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORTHM);
		Key publicKey = keyFactory.generatePublic(x509EncodedKeySpec);

		//对数据解密
		Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
		cipher.init(Cipher.DECRYPT_MODE, publicKey);

		return cipher.doFinal(data);
	}

	public static byte[] decryptBASE64(String str) {
		return Base64.decode(str, Base64.NO_WRAP);
	}

	public static String encryptBASE64(byte[] bytes) {
		return new String(Base64.encode(bytes, Base64.NO_WRAP));
	}

}
