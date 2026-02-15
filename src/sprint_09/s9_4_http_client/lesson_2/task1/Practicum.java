package sprint_09.s9_4_http_client.lesson_2.task1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {

    public static void main(String[] args) throws IOException, InterruptedException {
        // создаём экземпляр URI, содержащий адрес нужного ресурса
        URI uri = URI.create("https://ru.wikipedia.org/wiki/Список_кодов_состояния_HTTP");

        // создаём объект, описывающий HTTP-запрос
        HttpRequest request = HttpRequest.newBuilder() // получаем экземпляр билдера
                .GET()    // указываем HTTP-метод запроса
                .uri(uri) // указываем адрес ресурса
                .version(HttpClient.Version.HTTP_1_1) // указываем версию протокола
                .header("Accept", "text/html") // указываем заголовок Accept
                .header("User-Agent", "Mozilla/5.0 (compatible; PracticumBot/1.0; +https://practicum.yandex.ru)") // указываем кто делает запрос
                .build(); // заканчиваем настройку и создаём ("строим") http-запрос

        // HTTP-клиент с настройками по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // получаем стандартный обработчик тела запроса с конвертацией содержимого в строку
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        // отправляем запрос и получаем ответ от сервера
        HttpResponse<String> response = client.send(request, handler);

        // выводим код состояния и первые 500 символов тела ответа, чтобы не засорять консоль
        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа (фрагмент): ");
        System.out.println(response.body().substring(0, Math.min(500, response.body().length())) + "...");
    }
}
