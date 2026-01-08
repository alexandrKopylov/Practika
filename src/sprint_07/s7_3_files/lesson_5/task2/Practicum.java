package sprint_07.s7_3_files.lesson_5.task2;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Practicum {

    public static void main(String[] args) {
       // try (Writer out = new OutputStreamWriter()
        try (Writer out = new OutputStreamWriter(System.out, "UTF-8" )) {
            out.write(decodeText(
                    "Съешь ещё этих мягких французских булок да выпей же чаю"));

        } catch (IOException e) {
            // игнорируем
        }
    }

    static String decodeText(String input) throws IOException {
        return new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(
                        input.getBytes("UTF-8")
                ), "UTF-8")
        ).readLine();
    }
}