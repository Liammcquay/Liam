package liam.util;

import java.util.Base64;

/**
 * This class uses double Base64 encryption to encrypt/decrypt
 * Strings.
 * @author Liam
 */
public final class Encryptor {
	
	/**
	 * Class shouldn't be instantiated.
	 */
	private Encryptor() {		
	}
	
	/**
	 * This method will encrypt a String.
	 * @param s The String to be encrypted.
	 * @return The encrypted String
	 */
	public static String encrypt(String s) {	
		String str = Base64.getEncoder().encodeToString(s.getBytes());	
		char[] chArray = new char[str.length()];
		
		for(int i = 0; i < chArray.length; i++)			
			chArray[i] = (char) (str.charAt(i) + (i+1));
		
		str = Base64.getEncoder().encodeToString(new String(chArray).getBytes());	
		return str;
	}
	
	/**
	 * This method will decrypt a String.
	 * @param s The String to be decrypted.
	 * @return The decrypted String
	 */
	public static String decrypt(String s) {		
		String str = new String(Base64.getDecoder().decode(s.getBytes()));		
		char[] chArray = new char[str.length()];
		
		for(int i = 0; i < chArray.length; i++)			
			chArray[i] = (char) (str.charAt(i) - (i+1));
		
		str = new String(Base64.getDecoder().decode(new String(chArray).getBytes()));
		return str;		
	}

}
