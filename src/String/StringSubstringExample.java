package String;

//substring(0,6)은 인덱스 포함 0~6 사이의 문자열을 추
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880226-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
