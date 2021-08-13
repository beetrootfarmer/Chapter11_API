package String;
/*
 * .trim() : 앞 뒤 공백제거 
 * 사용자로부터 입력받을때!
 * 중요!
 */

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  02";
		String tel2 = "123  ;";
		String tel3 = "   1234   ";
				
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
