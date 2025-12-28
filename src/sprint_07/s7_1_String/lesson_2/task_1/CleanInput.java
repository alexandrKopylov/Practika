package sprint_07.s7_1_String.lesson_2.task_1;

public class CleanInput {
   public String fixString(String str){

       if (str.isEmpty()  ||  str.isBlank()) {
           return "Вы ничего не ввели!";
       } else {
          return str.trim();
       }
   }
}

//Он должен возвращать текст "Вы ничего не ввели!",
//если входная строка пустая или состоит из пробельных символов.