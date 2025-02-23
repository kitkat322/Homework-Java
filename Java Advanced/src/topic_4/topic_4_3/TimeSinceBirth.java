package topic_4.topic_4_3;

//Спроектуйте та розробте метод, який визначає, скільки часу пройшло із заданої дати.
//За допомогою цього методи виведіть у консоль, скільки часу пройшло з вашого дня народження у зручному
// для сприйняття вигляді, наприклад: «Вам виповнилося 20 років, 3 місяці, 18 днів, 4 години, 5 хвилин та 10 секунд».

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class TimeSinceBirth {
    public static void main(String[] args) {
            // моя дата дня народження
            LocalDateTime birthDate = LocalDateTime.of(1998, 1, 10, 13, 10, 0);
            printTimeDiff(birthDate);
        }

        public static void printTimeDiff(LocalDateTime birthDate) {
            LocalDateTime now = LocalDateTime.now(); // поточна дата та час

            // обчислення різниці за основними одиницями часу
            long years = ChronoUnit.YEARS.between(birthDate, now); // розраховує кількість років між роком народження та поточним роком
            birthDate = birthDate.plusYears(years); // додає розраховану к-сть років до дати народження, щоб далі розрахувати не всю к-сть місяців з дати народження, а лише ту, що <12

            long months = ChronoUnit.MONTHS.between(birthDate, now); // розраховує кількість місяців між місяцем народження та поточним місяцем
            birthDate = birthDate.plusMonths(months); // додає к-сть місяців до дати народження, щоб порахувати не загальну к-сть днів, а лише ту, що <30

            long days = ChronoUnit.DAYS.between(birthDate, now); // розраховує кількість днів між датою народження та поточною датою
            birthDate = birthDate.plusDays(days); // так само додає розраховану к-сть днів

            long hours = ChronoUnit.HOURS.between(birthDate, now); // розраховує кількість годин між часом народження та поточним часом
            birthDate = birthDate.plusHours(hours);

            long minutes = ChronoUnit.MINUTES.between(birthDate, now);
            birthDate = birthDate.plusMinutes(minutes);

            long seconds = ChronoUnit.SECONDS.between(birthDate, now);

            // вивід результату
            System.out.printf("Вам виповнилося %d років, %d місяців, %d днів, %d годин, %d хвилин та %d секунд.%n",
                    years, months, days, hours, minutes, seconds);
        }


}
