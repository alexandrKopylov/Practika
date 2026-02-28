package sprint_10.s10_4_annotation.lesson_7.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Arrays;


@Retention(RetentionPolicy.RUNTIME) // указывает, что аннотация будет доступна во время выполнения программы
@Target(ElementType.METHOD) // указывает,что аннотация будет использоваться для пометки методов, подлежащих проверке

        @interface CorrectImplementation {
        // ожидаемый возвращаемый тип метода
        Class<?> expectedReturnType() ... void.class;

// ожидаемые типы параметров метода
  ...
          }

class AnnotationValidator {

    // метод для валидации
    public static void validateMethods(Object instance) {
        // получаем класс объекта
        Class<?> clazz = instance. ...();

        // итерируем по методам класса
        for (.... .... : ....getMethods()) {
            // проверяем наличие аннотации
            if (method.isAnnotationPresent(.....class)) {
                // получаем аннотацию
        ... annotation = method.getAnnotation(....class);

                // получаем ожидаемый возвращаемый тип и типы параметров из аннотации
        ... expectedReturnType = annotation....();
        ...[] expectedParameterTypes = annotation....();

                // проверяем, соответствует ли фактический возвращаемый тип ожидаемому
                if (!method.getReturnType().equals(expectedReturnType)) {
                    // выводим сообщение об ошибке
                    System.out.println(
                            "Ошибка: Метод " + method.getName()
                                    + " имеет неправильный тип возвращаемого значения (" + method.getReturnType() + ")." +
                                    " Ожидаемый: " + expectedReturnType.getSimpleName());
                    // ничего не возвращаем, так как мы не ожидаем результата валидации
                    return;
                }

                // получаем фактические типы параметров
                Class<?>[] actualParameterTypes = method....();

                // проверяем, соответствуют ли фактические типы параметров ожидаемым
                if (!Arrays.equals(expectedParameterTypes, actualParameterTypes)) {
                    // выводим сообщение об ошибке
                    System.out.println(
                            "Ошибка: Метод "
                                    + method.getName()
                                    + " имеет неправильные типы параметров. Ожидаемые:"
                                    + Arrays.toString(expectedParameterTypes));
                    // ничего не возвращаем, так как мы не ожидаем результата валидации
                    return;
                }
            }
        }

        // выводим сообщение об успешной валидации
        System.out.println("Все методы реализованы корректно.");
        // ничего не возвращаем, так как мы не ожидаем результата валидации
    }
}

public class MathOperations {
    // метод для сложения
    @...(
            ... = int...,
            ... = {int.class, ...})
    public int add(int a, int b) {
        return a + b;
    }

    // метод для деления
  ...(
          ... = ...,
          ... = {..., ...})
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Невозможно разделить на ноль");
        }
        return a / b;
    }

    // метод для умножения
  ...(
          ... = ...,
          .... = {..., ...})
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        // вызываем метод валидации аннотаций
        AnnotationValidator.validateMethods(...);
    }
}