package sprint_08.s8_1_stream.lesson_8.task3;

import java.util.Optional;

public class Practicum {
    public static void main(String[] args) {
        // Доработайте данный метод, чтобы на экран выводилось
        // сообщение в соответствии с заданием

        SearchService searchService = new SearchService();

       Optional<Candy> candy = searchService.search("Африка");
        if(candy.isPresent()) { // проверяем, что объект класса Optional содержит значение
            // вызываем метод get, чтобы получить значение, содержащееся в Optional
            Candy candy1 = candy.get();
            System.out.println( String.format("Товар \"%s\" доступен в количестве %d кг по цене %f руб за кг",
                    candy1.name,candy1.amount,candy1.price));
        }else {
            System.out.println(" Данный товар не найден");
        }
    }
}