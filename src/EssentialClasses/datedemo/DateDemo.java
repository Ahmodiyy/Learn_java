package EssentialClasses.datedemo;

import java.time.*;

public class DateDemo {
    public static void main(String[] args) {
        System.out.println("----------local date demo-----------");
        LocalDate expDate = LocalDate.of(2020, 04, 1);
        System.out.println(expDate);
        LocalDate addToExpDate;
        addToExpDate = expDate.plusMonths(5);
        System.out.println(expDate.plusMonths(5));
        Period period = Period.between(expDate, addToExpDate);
        System.out.println(period);

        System.out.println("----------local time demo-----------");
        LocalTime startTime = LocalTime.of(10, 10, 12);
        System.out.println(startTime);
        LocalTime endTime  = LocalTime.of(10, 12,12);
        System.out.println(endTime);
        Duration durationOfTime = Duration.between(startTime, endTime);
        System.out.println(durationOfTime);

        System.out.println("----------local date time demo-----------");
        LocalDateTime localDateTime = LocalDateTime.of(expDate, startTime);
        System.out.println(localDateTime);

        System.out.println("----------zoned date time demo-----------");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(expDate, startTime, ZoneId.of("Europe/London"));
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(expDate, startTime, ZoneId.of("Indian/Maldives"));
        System.out.println(zonedDateTime2);

        System.out.println("----------partial class or enum-----------");
        System.out.println(MonthDay.of(Month.JULY, 21));

       // System.out.println("--------------------------all available ids------------------------------");
       // System.out.println(ZoneId.getAvailableZoneIds());
    }
}
