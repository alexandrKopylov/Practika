package sprint_07.s7_1_String.lesson_7.task3;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
			 // реализуйте метод здесь
       // System.out.println("fff");

        StringBuilder sb = new StringBuilder();
         String[] strings = grades.split(";");
         for (String str : strings){
              String[] splitStr = str.split(",");
             sb.append(capitalize(splitStr[0]));
             sb.append(" ");
             sb.append(capitalize(splitStr[1]));
             sb.append(" ");
             sb.append(splitStr[2].toLowerCase());
             sb.append(" — ");
             sb.append(gradeToString(splitStr[3]));

              sb.append(System.lineSeparator());
         }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        Grades gr = new Grades();
        gr.gradeBeautifier("вероника,чехова,ФИЗИКА,5;анна,строкова,МАТЕМАТИКА,4;иван,петров,ГЕОМЕТРИЯ,5");



    }

}