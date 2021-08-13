package String;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		
		char sex = ssn.charAt(7);
		
		switch(sex) { //switch에 올 수 있는 것 : 정수, 문자
		
		case '2' :
		case '4' : 
			System.out.println("여자");
			break;
		case '1' :
		case '3' :
			System.out.println("남자");
			break; 
		}
	}

}
