package object;

class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개값이 Member 타입인지 확인 
		if(obj instanceof Member) {
			Member member = (Member) obj; //obj를 Member로 강제 형변환 
			// id 필드값이 동일한지 검사 // id가 String이어서 equals로 비교 
			if(id.equals(member.id)) {
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나 id필드값이 다른경우 
		return false;
	}

}

public class MemberExample {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}