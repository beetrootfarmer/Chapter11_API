package date;

import java.util.Date;
import java.text.SimpleDateFormat;

//ctrl + shift+ o => import자동으로 된다!!
//근데 잘못찍어줘서 java.sql.Date로 되어있었다..util로 되어있는지 확인해야함 

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		
		// 몇시가 될때까지 출력해라~ 만들 수 있나?
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String strNow2 = sdf.format(now);
		
		System.out.println(strNow2);
	}

}
