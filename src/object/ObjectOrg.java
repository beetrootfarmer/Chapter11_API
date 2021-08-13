package object;

class Value {
	int value;
	
	@Override
	public boolean equals(Object obj) {
		if (this.value == ((Value)obj).value) { // obj를 Value로 형변환해서 필드 value와 타입이 같은지 확인하는 것. 
			return true;
		} else {
			return false;
		}
	}
	
	public Value(int value) {
		this.value = value;
	}
}

public class ObjectOrg {
	public static void main(String[] args) {
		Value v1 = new Value(701021);
		Value v2 = new Value(701021);
		
		System.out.println(v1 instanceof Value);
		System.out.println(v2 instanceof Value);
		
		System.out.println(v1.toString()); // v1.toString() == v1 // 참조값(주소값)을 가지고있음  //object.Value@15db9742
		System.out.println(v2); //object.Value@6d06d69c
		
		System.out.println(v1 == v2); // 참조값(주소값)이 같으냐 //false
		
		System.out.println(System.identityHashCode(v1)); // 고유한 식별자.. 일종의 주소 //366712642
		System.out.println(System.identityHashCode(v2)); // 1829164700

		System.out.println(v1.hashCode()); // 식별자. 개체들이 중첩되는지 확인함!
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); //이걸 어떻게 true로 만들지?? 주소값이 아니라 입력값이 같은지 비교하게 하려면 equals를 재정의(6~11줄 처리).



		
	}

}
