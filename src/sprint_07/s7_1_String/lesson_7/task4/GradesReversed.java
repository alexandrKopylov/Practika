package sprint_07.s7_1_String.lesson_7.task4;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        //System.out.println("rrr");
StringBuilder sb = new StringBuilder();
        for (int i = 0; i <grades.length ; i++) {
            String stroka = grades[i].replace(" — ", " ");
             String[] strings = stroka.split(" ");
             sb.append(strings[0].toLowerCase());
             sb.append(",");
            sb.append(strings[1].toLowerCase());
            sb.append(",");
            sb.append(strings[2].toUpperCase());
            sb.append(",");
            sb.append(gradeStringToInt(strings[3]));
            sb.append(";");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

      String[] mas = {
              "Вероника Чехова физика — Безупречно",
              "Анна Строкова математика — Потрясающе",
              "Иван Петров геометрия — Безупречно"
      };

        GradesReversed gr = new GradesReversed();
        System.out.println(gr.serializeGrades(mas));
    }
}