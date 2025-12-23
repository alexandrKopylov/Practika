package sprint_07.String.lesson_5.task1;

public class Practicum {
    public static void main(String[] args) {
        String rules = "На зелёный цвет — стой на месте;\n" +
                "на зелёный цвет — приготовься;\n" +
                "на зелёный — осмотрись, а затем смело шагай.";

        String replaced = rules.replaceFirst("зелёный", "красный")
                .replaceFirst("зелёный","жёлтый").replace("цвет","свет");
        System.out.println(replaced);
    }
}


/*
На красный свет — стой на месте;
на жёлтый свет — приготовься;
на зелёный — осмотрись, а затем смело шагай.



 */