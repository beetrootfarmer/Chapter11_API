package object;

import java.util.HashMap;

class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) { 
				return true;
			}
		}
		return false;
	}
}

public class KeyExample {
	public static void main(String[] args) {
		// key 객체를 식별기로 사용해서 String 값을 저장하는 HashMap
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별기 new Key (1)로 "홍길동"을 저장함
		hashMap.put(new Key(1), "마반장");
		
		// 식별기 new Key (1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
