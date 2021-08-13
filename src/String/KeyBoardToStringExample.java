package String;

import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) {
		
		byte[] by = new byte[100];
		
		System.out.print("입력: ");
	try {
		// 	배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴 
		int readByteNo = System.in.read(by); //system.in 은 키보드 입력값 
		
		// 배열을 문자열로 변환 
		String str = new String(by, 0, readByteNo-2);
		System.out.println(str);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
