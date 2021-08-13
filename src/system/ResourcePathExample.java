package system;

public class ResourcePathExample {
	public static void main(String[] args) {
		Class clazz = Car.class;
		
		// C드라이브 >...> system 폴더 안에 이미지 넣어놓으면 호출 할 수 있다.
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
