package String;


// [ toLower toUpper 모두 소문자로/대문자로 ]

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 대소문자 무시하고 같냐~~
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String upperStr1 = str1.toUpperCase();
		System.out.println(upperStr1);


	}

}
