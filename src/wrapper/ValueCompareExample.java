package wrapper;
/*  [ obj1 == obj2 ?? ]
 *  Integer obj1 = 300;
 *  Integer obj2 = 300;
 *   AutoBoxing 이 일어나면 new한 객체가 만들어지는 것이기 때문에 
 *   [obj1 != obj2 ]임! 
 *   
 *   어떤 값 범위 안에 들어가면 ... 나가면... 결과가 다르다..??????????????????????????????????
 * 
 * 
 */

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(" ==결과: " + (obj1 == obj2));
												// 언박싱
		System.out.println("언박싱 후 == 결과: " +(obj1.intValue() == obj2.intValue()));
												// Object 클래스의 equals를 Integer클래스에서 받아서 재정의한거임...왜지???? 
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
												// 얘는 왜 true가 나올까?
		System.out.println(" ==결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 == 결과: " +(obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
