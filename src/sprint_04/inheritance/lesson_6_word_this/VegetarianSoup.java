package sprint_04.inheritance.lesson_6_word_this;

public class VegetarianSoup extends SoupBase {
    double vegetables;

    // реализуйте необходимые конструкторы

    public VegetarianSoup(double water, double salt, double vegetables) {
        super(water, salt);
        this.vegetables = vegetables;
    }
    public VegetarianSoup( SoupBase soupBase, double vegetables) {
        super(soupBase.water, soupBase.salt);
        this.vegetables = vegetables;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты вегетарианского супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Овощи: " + vegetables + " г.");
    }
}