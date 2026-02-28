package sprint_10.s10_4_annotation.lesson_3.task1;

@interface ObjectInfo {
    Class<?> type() default Object.class;
    Class<?>[] args() default  {};
    boolean required ()  default false;
}

// Класс для аннотирования   @ObjectInfo
@ObjectInfo(type = MyClass.class)
public class MyClass {

    // Элементы класса
    @ObjectInfo(type = String.class)
    private String myField;

    // Конструктор
    @ObjectInfo(type = MyClass.class, args = {int.class}, required = true)
    public MyClass(int initialValue) {
        // Код конструктора
    }

    // Метод
    @ObjectInfo(
            type = void.class,
            args = {int.class, String.class},
            required = true
    )    public void myMethod(int number, String text) {
        // Код метода
    }

    /*
      public @interface Author {
      String name();
      String title();
  }

  public @interface TaskInfo {
      String description();
      Author[] authors() default {};
  }

*****************************************
   public @interface Permission {
      // название разрешения — по умолчанию пусто
      String value() default "";
      // уровень разрешения — по умолчанию 1
      int level() default 1;
      // описание разрешения — по умолчанию пусто
      String description() default "";
  }


     */


}