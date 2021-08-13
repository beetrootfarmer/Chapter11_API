package wrapper;

/*
 *  객체 관리... 저장, 검색
 *  
 *  모두 클래스화해서 object로 타입변환해서 쓰고싶은 것...
 *  기본타입을 클래스화...클래스형으로 감싸면 WRAPPER CLASS ...Byte, Ahar, Short, Integer, Long Float,Doubla,Boolean
 * 
 * 컬렉션 프로임워크에서 기존타입을 갱성, 관리할때..
 * 
 * 기본타입을 집어넣었을때 
 * 
 */

public class 중요한wrapper {
	public static void main(String[] args) {
		//박싱
		Integer obj1 = new Integer(100); // 100으로 할당되면 끝임 . 값변환 불가능~!?!?
		Integer obj2 = new Integer("200"); //문자열을 넣으면 자동으로 Parsing 
		Integer obj3 = Integer.valueOf("300"); //
		
		//언박싱 
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		System.out.println(value1);
		
		
		System.out.println(Integer.MAX_VALUE);
	}
}
