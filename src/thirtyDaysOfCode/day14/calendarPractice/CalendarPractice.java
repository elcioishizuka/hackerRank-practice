package thirtyDaysOfCode.day14.calendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime());

        SimpleDateFormat brazilianFormat = new SimpleDateFormat("dd/MM/yyyy");
        String brazilianFormatted = brazilianFormat.format(calendar.getTime());
        System.out.println(brazilianFormatted);

    }

}
