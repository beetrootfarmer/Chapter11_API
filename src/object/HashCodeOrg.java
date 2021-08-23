package object;

public class HashCodeOrg {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		String str3 = "Hello";
		String str4 = "Hello";
		
		// 주소값이 다르다! new 객체~ new 홈~
		System.out.println(str1 == str2);
		System.out.println("abc" == "abc");
		/*
		 * 원래 hashCode는 주소값을 받아서 내놓는 코드인데
		 * String은...
		 * String 클래스는  문자열의 내용이 같으면, 동일한 해시코드를 반환하도록
		 * (해시코드를 ) 오버라이딩 되어있다.
		 * 
		 * str. 으로 오브젝트에 있는 hashCode를 호출한 것이다.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		/*
		 * System클래스의 indentityHashCode()
		 * Object클래스의 hashCode()와 동일
		 * 객체의 주소값으로 hashCode를 생성.
		 * 주소값이 다르다!
		 * 
		 * identityhash코는 그나마 실제주소(?) 고유식별자임. 
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		/*
		 * 주소값이 같다.  
		 */
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
	}

}
