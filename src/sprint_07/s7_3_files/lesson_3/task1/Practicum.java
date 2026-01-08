package sprint_07.s7_3_files.lesson_3.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("C:\\Users\\user\\IdeaProjects\\Practika\\src\\sprint_07\\s7_3_files\\lesson_3\\task1\\result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".
        while (br.ready()) {
            String line = br.readLine();
            Integer count = frequencyMap.get(line);
            if (Objects.isNull(count)) {
                frequencyMap.put(line, 1);
            } else {
                frequencyMap.put(line, ++count);
            }
        }
        br.close();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}