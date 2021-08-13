package object;

class A {
	char ch;
	public A(char ch) {
		this.ch = ch; // initialized
	}
}

public class StringOrg {
	public static void main(String[] args) {
		
		A type1 = new A('^');
		A type2 = new A('^');
		
		//type1과 type2 값이 같아? 
		System.out.println(type1.toString());
		System.out.println(type2.toString());
		System.out.println(type1);
		System.out.println(type2);
		
		// 16진수...
		System.out.printf("%X\n", type1.hashCode());
		System.out.printf("%X\n", type2.hashCode());
		
		String str = "korea^^";
		System.out.println(str.toString());
		System.out.printf("%X\n", str.hashCode());

		
		


		
	}

}
