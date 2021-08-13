package String;

/*
 * substring
 * 
 *  0(포함) ~ 6(제외) 추출 
 *  ssn.subtring(0,6)
 *  
 *  7부터 끝까지 추출
 *  ssn.substring(7)
 */


public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "8802269712156";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
