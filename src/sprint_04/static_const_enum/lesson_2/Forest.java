package sprint_04.static_const_enum.lesson_2;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;
    static private String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }


// объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    static void setSeason(String newSeason) {
        season = newSeason;
        if (newSeason.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }

    }


    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}