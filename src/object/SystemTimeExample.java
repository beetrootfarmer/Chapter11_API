package object;

/*
 *  [time stamp] 
 *  중요한 로직의 메소드에넣으면 
 *  얼마나 걸리는지 알 수 있다. 
 */

public class SystemTimeExample {
	public static void main(String[] args) {

		long time1 = System.nanoTime();

		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i + 1;
		}

		long time2 = System.nanoTime();

		long na = (time2 - time1);

		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + "나노초가 소요");
		System.out.println("계산에 " + (na) + "나노초가 소요");
		System.out.println();
	}

}
