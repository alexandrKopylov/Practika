package sprint_09.s9_4_http_client.lesson_3.task1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practicum {
    public static void main(String[] args) {
        String url = "https://www.ya.ru/";

        // добавьте отлов и обработку исключений вокруг кода ниже
        URI uri = URI.create(url);

        // создаём запрос
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();

        // создаём HTTP-клиент
        HttpClient client = HttpClient.newHttpClient();

        // отправляем запрос
        HttpResponse<String> response = null;
        try {

                response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch  (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте, пожалуйста, URL-адрес и повторите попытку.");
        } catch (IllegalArgumentException e) {
            System.out.println(" Добавьте сообщение для пользователя: Введённый вами адрес не соответствует формату URL. Попробуйте, пожалуйста, снова.");
        }

        // выводим код состояния и тело ответа
        System.out.println("Код состояния: " + response.statusCode());
        System.out.println("Тело ответа: " + response.body());

    }
}