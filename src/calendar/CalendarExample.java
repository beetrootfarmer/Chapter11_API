package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		// getInstance 로 유일한 Calendar객체 생성
		// Calendar 클래스는 추상클래스이므로 new연산자로 인스턴스를 생성할 수 없다.
		Calendar now = Calendar.getInstance(); 
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minu = now.get(Calendar.MINUTE);
		int sec  = now.get(Calendar.SECOND);
		
		//왜 반복이 안되는거지?? 초랑 분이랑 시간이 바뀔때마다 출력을 해야하나?
		int i;
		for(i=0; i<1000000; i++) {
			System.out.println(hour + "시" + minu + "분"+ sec + "초");				
			if (hour == 2) {
				System.out.println(hour + "시" + minu + "분" + sec + "초");
			} else if (hour == 3 && minu == 10) {
				System.out.println(hour + "시" + minu + "분"+ sec + "초" );
				System.out.println("수업시간입니다.");
			} 
			
				break;
	}
	}
}
