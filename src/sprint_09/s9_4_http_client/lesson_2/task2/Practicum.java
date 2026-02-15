package sprint_09.s9_4_http_client.lesson_2.task2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class Practicum {

    public static void main(String[] args) throws IOException, InterruptedException {
        // укажите URL-адрес ресурса
        URI uri = URI.create("https://ya.ru/white");

        // создайте объект, описывающий HTTP-запрос
       // HttpRequest request = ... ;
//        HttpRequest request = HttpRequest.newBuilder() // получаем экземпляр билдера
//                .GET()    // указываем HTTP-метод запроса
//                .uri(uri) // указываем адрес ресурса
//                .version(HttpClient.Version.HTTP_1_1) // указываем версию протокола
//                .header("Accept", "text/html") // указываем заголовок Accept
//                .header("User-Agent", "Mozilla/5.0 (compatible; PracticumBot/1.0; +https://practicum.yandex.ru)") // указываем кто делает запрос
//                .build(); // заканчиваем настройку и создаём ("строим") http-запрос

        HttpRequest request =  HttpRequest.newBuilder().uri(uri).GET().build();


        // создайте HTTP-клиент с настройками по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // получите стандартный обработчик тела запроса
        // с конвертацией содержимого в строку
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        // отправьте запрос
        HttpResponse<String> response = client.send(request, handler);

        // выведите код состояния и тело ответа
        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа : ");
        System.out.println(response.body());
    }
}