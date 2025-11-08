package sprint_04.Object.lesson_4;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }


}