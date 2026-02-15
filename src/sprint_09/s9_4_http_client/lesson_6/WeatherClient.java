package sprint_09.s9_4_http_client.lesson_6;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherClient {
    // Скрытое неизменяемое поле client типа HttpClient
    private final HttpClient client;

    // Публичный конструктор по умолчанию для инициализации поля client
    public WeatherClient() {
        this.client = HttpClient.newHttpClient();
    }

    public String getWeatherData(String cod) {
        // укажите URL запроса, включая его параметры
        URI url = URI.create("https://functions.yandexcloud.net/d4eo3a1nvqedpic89160" +
                "?scale=C" +
                "&city=" + cod);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .header("Accept", "application/json") // Указываем, что хотим получить ответ в формате JSON
                .GET() // Метод GET
                .build();

        String city = null;
        String conditions = null;
        String temperature = null;
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            // проверяем, успешно ли обработан запрос
            if (response.statusCode() == 200) {
                JsonElement jsonElement = JsonParser.parseString(response.body());
                if (!jsonElement.isJsonObject()) { // проверяем, точно ли мы получили JSON-объект
                    System.out.println("Ответ от сервера не соответствует ожидаемому.");
                    return null;
                }
                // получите курс доллара и евро и запишите в переменные rateUSD и rateEUR
                JsonObject jsonObject = jsonElement.getAsJsonObject();

                // извлекаем объект cities
                JsonObject cities = jsonObject.getAsJsonObject("cities");
//                JsonObject cityData = cities.getAsJsonObject(cod);
//                 city = cityData.get("city").getAsString();
//                 conditions = cityData.get("conditions").getAsString();
//                 temperature = cityData.get("temperature").getAsString();

// извлекаем объект citiesCod
                JsonObject citiesCod = cities.getAsJsonObject( cod );

// получаем курсы валют и сохраняем в переменные
                city = citiesCod.get("city").getAsString();
                conditions = citiesCod.get("conditions").getAsString();
                temperature = citiesCod.get("temperature").getAsString();


            } else {
                System.out.println("Что-то пошло не так. Сервер вернул код состояния: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
        return String.format("Город: %s. %s, %s", city, conditions, temperature);
    }
}
