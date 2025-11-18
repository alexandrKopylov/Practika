package sprint_05.oop_abstraction_and_polymorphizm.lesson_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        List<MediaItem> mediaItems = new ArrayList<>();
        Movie mov1 = new Movie("Avatar", 180);
        Movie mov2 = new Movie("pobeg", 120);
        Movie mov3 = new Movie("godzilla", 150);
        mediaItems.add(mov1);
        mediaItems.add(mov2);
        mediaItems.add(mov3);

        Series ser1 = new Series("lost", 45, 100);
        Series ser2 = new Series("igra prestolov", 100, 30);
        Series ser3 = new Series("santa barbara", 40, 100);
        mediaItems.add(ser1);
        mediaItems.add(ser2);
        mediaItems.add(ser3);

        printMediaItemsList(mediaItems);
        double tot = Calculator.calculate(mediaItems);
        System.out.println("Всего вы потратили на просмотр фильмов и сериалов, в днях: " + tot);

        System.out.println("**********************************************");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            // Считайте команду, введенную пользователем
            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Введите название фильма:");
                String title = scanner.next();
                System.out.println("Введите длительность фильма в минутах:");
                int runtime = scanner.nextInt();

                // На основе введенных пользователем значений создайте объект класса Movie
                Movie movie = new Movie(title, runtime);
                mediaItems.add(movie);
            } else if (command == 2) {
                System.out.println("Введите название сериала:");
                String title = scanner.next();
                System.out.println("Введите количество серий:");
                int seriesCount = scanner.nextInt();
                System.out.println("Введите среднюю длительность серии в минутах");
                int runtime = scanner.nextInt();

                // Создайте сериал и добавьте его в список просмотренных
                Series series = new Series(title, runtime, seriesCount);
            } else if (command == 0) {
                printMediaItemsList(mediaItems);
                double totalRuntime = Calculator.calculate(mediaItems);
                System.out.println("Всего вы потратили на просмотр фильмов и сериалов, в днях: " + totalRuntime);
                break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1 - Добавить фильм");
        System.out.println("2 - Добавить сериал");
        System.out.println("0 - Посчитать суммарное время и выйти");
    }


    public static void printMediaItemsList(List<MediaItem> mediaItems) {
        System.out.println("Вы посмотрели фильмов и сериалов: " + mediaItems.size());
        // Допишите вывод названий всех просмотренных фильмов и сериалов
        for (MediaItem mov : mediaItems) {
            System.out.println(mov.getTitle());
        }

    }
}
