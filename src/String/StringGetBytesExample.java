package String;

import java.io.UnsupportedEncodingException;

// [getBytes 인코딩 / byte -> String 디코딩]

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		
byte[] bytes1 = str.getBytes();
System.out.println("bytes1.length: " + bytes1.length);
String str1 = new String(bytes1);
System.out.println("bytes1->String: " + str1);

try {
	// EUC-KR로 인코딩한건 EUC-KR로 디코딩해야함 
	byte[] bytes2 = str.getBytes("EUC-KR");
	System.out.println("bytes2.length: " + bytes2.length);
	String str2 = new String(bytes2, "EUC-KR");
	System.out.println("bytes2->String: " + str2);
	
	// UTF-8로 인코딩한건 UTF-8로 디코딩해야함 
	byte[] bytes3 = str.getBytes("UTF-8");
	System.out.println("bytes3.length: " + bytes3.length);
	String str3 = new String(bytes3, "UTF-8");
	System.out.println("bytes3->String: " + str3);
	
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
  }
}
