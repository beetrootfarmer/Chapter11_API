package object;

import java.util.Arrays;

// [클래스끼리 복사] 

//class Point {
//	int x, y;
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class CloneOrg {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // 초기화 하면서 배열 선언
		int[] arrCopy = arr.clone(); // clone 으로 arr을 복사한 arrCopy
		// enhnaced for문 
		for(int i :arrCopy) { // arr배열에 있는 숫자가 i 에 들어감 
			System.out.print(i + ",");
		}
		System.out.println();
		// Array.toString 하면 배열에 있는거 찍어줌 
		// toString은 앞에것에 맞게 재정의된다~
		System.out.println(Arrays.toString(arrCopy)); 
		
	}

}
