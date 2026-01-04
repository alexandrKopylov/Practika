package sprint_07.s7_2_Exception.lesson_7.task1;

import java.net.MalformedURLException;
        import java.net.URL;

class Practicum {

    public static void main(String[] args) throws Exception {
        System.out.println(convertStringToUrl("http://ya.ru"));
    }

    public static URL convertStringToUrl(final String input) throws MalformedURLException {
        return new URL(input);
    }
}