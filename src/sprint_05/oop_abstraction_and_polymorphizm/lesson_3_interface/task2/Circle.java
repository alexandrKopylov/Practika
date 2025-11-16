package sprint_05.oop_abstraction_and_polymorphizm.lesson_3_interface.task2;

public class Circle {
    // Радиус круга
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}