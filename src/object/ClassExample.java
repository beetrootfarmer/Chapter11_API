package object;

class Car{
	
}

public class ClassExample {
	public static void main(String[] args) {
		// clazz는 국룰 
		// 첫 번째 방법 
//		Class clazz = Car.class;
		
//		//두 번째 방법 
//		 Class clazz = Class.forName("java.lang.String");
//		 String str = "마반장";
//		 
//		 //세 번째 방법
		 Car car = new Car();
		 Class clazz = car.getClass();
		 
		 System.out.println(clazz.getName());
		 System.out.println(clazz.getSimpleName());
		 System.out.println(clazz.getPackage().getName());
	}

}
