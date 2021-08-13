package system;

class Car{
	
}

public class ClassExample {
	public static void main(String[] args)  throws ClassNotFoundException{
//		첫 번째 방법
//		Class clazz = Car.class;
		
//		두 번째 방법
//		Class clazz = Class.forName("object.Member");
		
//		세 번째 방법
		Car c1 = new Car();
		Class clazz = c1.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage() .getName());

	
	}

}
