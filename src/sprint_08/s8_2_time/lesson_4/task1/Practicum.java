package sprint_08.s8_2_time.lesson_4.task1;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Practicum {
    public static void main(String[] args) {
        // время начала работы над задачей — 9:00
        LocalTime taskStart = LocalTime.of(9,00);
        // время окончания работы над задачей — 11:30
        LocalTime taskFinish = LocalTime.of(11,30);

        // опишите формат вывода в виде часы:минуты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // найдите продолжительность между двумя единицами времени

        // находим продолжительность между двумя единицами времени
       // Duration ninetyMinutes = Duration.between(start, finish);

        Duration duration = Duration.between(taskStart,taskFinish);

        // taskStart должен быть выведен в указанном формате
        System.out.println("В прошлый раз задача была начата в " +
                formatter.format(taskStart) + ",");
        // taskFinish должен быть выведен в указанном формате
        System.out.println("а закончена в " +
                formatter.format(taskFinish) + ".");

        LocalTime now = LocalTime.now();
        System.out.println("Сейчас " +
                formatter.format(now) + ".");

        // прибавьте к текущему моменту вычисленную продолжительность
        LocalTime finishTime = now.plus(duration);

        // finishTime должен быть выведен в указанном формате
        System.out.println("Значит, задача будет выполнена к " +
                formatter.format(finishTime) + ".");
    }
}