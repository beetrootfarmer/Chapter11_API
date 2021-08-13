package object;

import common.BizNegativeNumberException;
import common.BizThousandOverException;
import common.Calculator;

class MyClass{
	
}

public class Program {
	public static void main(String[] args) {
		
		Object o1 = new MyClass();
		
		int var = 1; // 값이 저장되는 var 
		Integer i1 = new Integer(1);  // 주소가 저장되는 i1 
		Integer var2 = new Integer(1);
		
		
		try {
			Calculator.add(1002, 3);
		} catch (BizThousandOverException e) {
			System.out.println();
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
		}
	}

}
