package wrapper;
/* 
 *  인스턴스의 객체주소를 new로 생성하고 넣어주지 않고 이렇게 값 대입이 된다고~?
 *  Integer obj = 100 ;					// 자동 박싱
 *  
 *  Integer obj1 = new Integer(200);
 *  int value1 = obj; 					// 자동 언박싱
 *  int value2 = obj + 100;				// 자동 언박싱
 * 
 *  -> Integer 가  Wrapper Class라서 된다~
 */

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		
		
		// 자동 박싱 AutoBoxing이 일어났네?
		Integer obj = 100; // 100을 감싼 주소(obj)가 클래스에 담겼네?
		System.out.println("value: " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj; // 클래스에 담겨진 값(obj)을 value에 대입~
		System.out.println("value: " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100 -400 + 1 *3 ;
		System.out.println("result: " +result);		
	}
}
