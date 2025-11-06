package sprint_4_inheritance_word_this_lesson_6;

public class SoupBase {
    double water;
    double salt;



    public SoupBase(double water, double salt) {
        this.water = water;
        this.salt = salt;
    }
    // реализуйте конструктор

    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}