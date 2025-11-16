package sprint_05.oop_abstraction_and_polymorphizm.lesson_3_interface.task2;

public class Square {
    // Длина стороны квадрата
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }
}
