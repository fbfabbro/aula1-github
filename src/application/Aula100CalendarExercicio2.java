package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula100CalendarExercicio2 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH.mm.ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int minute = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		System.out.println("Minutes = " + minute);
		System.out.println("Month = " + month);
		System.out.println("Year = " + year);
		System.out.println("fim do Programa");
		System.out.println("teste git hub");
	}

}
