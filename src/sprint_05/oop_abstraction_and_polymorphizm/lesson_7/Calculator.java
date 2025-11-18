package sprint_05.oop_abstraction_and_polymorphizm.lesson_7;

import java.util.List;

public class Calculator {
    private Calculator() {
    }



    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double countMin = 0;
        for(Object mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                countMin = countMin + ((Movie) mediaItem).getRuntime();
            } else if (mediaItem instanceof Series) {
                countMin = countMin + (((Series) mediaItem).getSeriesCount() * ((Series) mediaItem).getRuntime());
            }
        }

        return countMin /(60*24);
    }
}

