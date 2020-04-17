import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String [] args){
		
		int day,month,year;
		int hour,minute,second;
		
		GregorianCalendar obj = new GregorianCalendar();
		
		day = obj.get(Calendar.DAY_OF_MONTH);
		month = obj.get(Calendar.MONTH) +1; // Its giving month less than 1 of current month  
		year = obj.get(Calendar.YEAR);
		
		hour = obj.get(Calendar.HOUR);
		minute = obj.get(Calendar.MINUTE);
		second = obj.get(Calendar.SECOND);
		
		System.out.println(hour + " : " +minute+ " : " +second);
		System.out.println(day + " / " +month+ " / " +year);
		
		
	}
}
