package sprint_04.Object.lesson_3;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Song secondSong = (Song) o;
        return Objects.equals(this.title, secondSong.title) &&
                Objects.equals(this.artist, secondSong.artist) &&
                Objects.equals(this.songwriter, secondSong.songwriter);

    }}