package topic_4.topic_4_3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class BirthDate {
    public static void main(String[] args) {
        LocalDate dateBirth = LocalDate.of(1998, Month.FEBRUARY, 10);
        LocalDate dateENow = LocalDate.of(2025, Month.FEBRUARY, 16);
        Period period = Period.between(dateBirth, dateENow);

        System.out.println("З дня народження пройшло " + period.getYears() + " років " + period.getMonths() +
                " місяців "+ period.getDays() + " днів ");

    }
}
