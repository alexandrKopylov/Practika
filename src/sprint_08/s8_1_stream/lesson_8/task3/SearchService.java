package sprint_08.s8_1_stream.lesson_8.task3;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchService {
    // Создаём объект класса, отвечающий за склад магазина
    private final Warehouse warehouse = new Warehouse();
    // Создаём объект класса, отвечающий за работу с поставщиками
    public final SRM srm = new SRM();

    // Основной метод поиска
    // Проверяет наличие товара с указанным именем на складе магазина
    // Если товар отсутствует, то проверяются склады поставщиков,
    // предпочтение отдаётся тому поставщику, у которого наименьшая цена товара.
    // Для поиска товара на складе поставщиков используется метод supplierSearch
    // Если товар нигде не найден, то возвращается пустой Optional
    public Optional<Candy> search(String candyName) {
        // Реализуйте данный метод, с использованием методов Optional
        Optional<Candy> optCandy = warehouse.search(candyName);

        if (optCandy.isPresent()){
            return optCandy;
        } else {
          return supplierSearch(candyName);

        }
    }

    // Ищет товар с указанным именем на складах поставщиков
    // Возвращает Optional с самым дешевым вариантом товара среди всех
    // поставщиков или пустой Optional, если товар не найден
    private Optional<Candy> supplierSearch(String candyName) {
        // Реализуйте данный метод при помощи Stream API и Optional,
        // используйте метод min из Stream API для нахождения товара с наименьшей ценой

        return srm.listSuppliers().stream()
                .map(supplier -> srm.getProduct(supplier, candyName))
                .filter(Objects::nonNull)
                .min(Comparator.comparing(candy -> candy.price));
    }
}