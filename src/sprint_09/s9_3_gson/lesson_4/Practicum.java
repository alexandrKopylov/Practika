package sprint_09.s9_3_gson.lesson_4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


enum SubtitleLanguage {
    ru, en, cn
}


class SubtitleItem {
    private Map<SubtitleLanguage, String> values = new HashMap<>();

    LocalTime begin;

    LocalTime end;

    public SubtitleItem(Map<SubtitleLanguage, String> values, LocalTime begin, LocalTime end) {
        this.values = values;
        this.begin = begin;
        this.end = end;
    }

    public Map<SubtitleLanguage, String> getValues() {
        return values;
    }

    public void setValues(Map<SubtitleLanguage, String> values) {
        this.values = values;
    }

    public LocalTime getBegin() {
        return begin;
    }

    public void setBegin(LocalTime begin) {
        this.begin = begin;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubtitleItem that = (SubtitleItem) o;
        return Objects.equals(values, that.values) && Objects.equals(begin, that.begin) && Objects.equals(end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(values, begin, end);
    }

    //    // геттеры и сеттеры
//
//    @Override
//    public boolean equals(Object o) {
//       ...
//    }
//
//    @Override
//    public int hashCode() {
//       ...
//    }
//
//    public SubtitleItem(...) {
//			...
//    }
}

class SubtitleListTypeToken extends TypeToken<List<SubtitleItem>> {

}

class LocalTimeTypeAdapter extends TypeAdapter<LocalTime> {
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    @Override
    public void write(final JsonWriter jsonWriter, final LocalTime localDTime) throws IOException {
        jsonWriter.value(localDTime.format(timeFormatter));
    }

    @Override
    public LocalTime read(final JsonReader jsonReader) throws IOException {
        return LocalTime.parse(jsonReader.nextString(), timeFormatter);

    }
}

public class Practicum {

    public static void main(String[] args) {
        List<SubtitleItem> subtitles = Arrays.asList(
                new SubtitleItem(Map.of(SubtitleLanguage.ru, "Здравствуйте!",
                        SubtitleLanguage.en, "Hello!",
                        SubtitleLanguage.cn, "Ni hao"),
                        LocalTime.of(0, 0, 15),
                        LocalTime.of(0, 0, 17)
                ),
                new SubtitleItem(Map.of(SubtitleLanguage.ru, "Привет!",
                        SubtitleLanguage.en, "Hi!",
                        SubtitleLanguage.cn, "Ni hao"),
                        LocalTime.of(0, 0, 21),
                        LocalTime.of(0, 0, 24)
                ),
                new SubtitleItem(Map.of(SubtitleLanguage.ru, "Как дела?",
                        SubtitleLanguage.en, "How are you?",
                        SubtitleLanguage.cn, "Ni hao ma"),
                        LocalTime.of(0, 0, 28),
                        LocalTime.of(0, 0, 31)
                ),
                new SubtitleItem(Map.of(SubtitleLanguage.ru, "Всё хорошо, спасибо!",
                        SubtitleLanguage.en, "I'm fine, thank you!",
                        SubtitleLanguage.cn, "Wo hen hao, xie xie"),
                        LocalTime.of(0, 0, 34),
                        LocalTime.of(0, 0, 37)
                )
        );


//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
//                .create();

        // адаптер для преобразования типа LocalTime в String в формате субтитров
        // ???localTimeTypeAdapter = ???

//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder. ???
//        Gson gson = gsonBuilder. ???

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .registerTypeAdapter(LocalTime.class, new LocalTimeTypeAdapter())
                .create();


        String subtitlesJson = gson.toJson(subtitles);
        System.out.println(subtitlesJson);

        List<SubtitleItem> parsed = gson.fromJson(subtitlesJson, new SubtitleListTypeToken().getType());
        if (parsed.equals(subtitles)) {
            System.out.println("Субтитры десериализованы корректно.");
        } else {
            System.out.println("Произошла ошибка при десериализации.");
        }
    }
}