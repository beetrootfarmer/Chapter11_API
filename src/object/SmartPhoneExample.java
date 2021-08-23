package object;

import java.util.Date;

class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());		
	}
}

class SmartPhone {
	private String company;
	private String os;
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		System.out.println("권한이 없습니다."); // set을 하지못하도록 
	}
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	}
}

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
