package sprint_04.static_const_enum.lesson_3;

import java.util.ArrayList;
import java.util.List;

class Song {

    private final String artist;
    private final String title;
    private final String genre;

    public Song(String artist, String title, String genre) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }
}


public class Practicum{
    public static void main(String[] args) {
        List<Song> goldenHitsCollection = new ArrayList<>();
        goldenHitsCollection.add(new Song("Северный русский народный хор",
                "Белым снегом", "Народная музыка")); // добавление нового хита
    }
}
