package sprint_07.s7_2_Exception.lesson_4.task3;



import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exception) {
            System.out.println("Введена пустая строка.");
        } catch (StringNotNumberException exception) {
            System.out.println("Вы ввели нецелое число.");
        } catch (StringIsTooBigNumberException exception) {
            System.out.println("Введённое число слишком большое.");
        } catch (StringIsTooSmallNumberException exception) {
            System.out.println("Введённое число слишком маленькое.");
        }
    }
}

class NullStringException extends RuntimeException {
}

class EmptyStringException extends RuntimeException {
}

class StringIsTooSmallNumberException extends RuntimeException {
}

class StringIsTooBigNumberException extends RuntimeException {
}

class StringNotNumberException extends RuntimeException {
}
