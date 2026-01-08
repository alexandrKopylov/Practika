package sprint_07.s7_3_files.lesson_4.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practicum {

    public static void main(String[] args) {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader("input.txt"));
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}