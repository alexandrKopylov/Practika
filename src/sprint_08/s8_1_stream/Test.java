package sprint_08.s8_1_stream;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3);
//        List<Integer> result = numbers.stream()
//                .peek(x -> System.out.println("Processing: " + x))  // выводит: Processing: 1, Processing: 2, ...
//                .peek(xr -> System.out.println(xr * 2))
//                .map(x -> x * 2)
//                .peek(x -> System.out.println("After map: " + x))     // выводит: After map: 2, After map: 4, ...
//                .peek(x -> System.out.println("--------------------"))     // выводит: After map: 2, After map: 4, ...
//                .collect(Collectors.toList());
// result: [2, 4, 6]

        List<Person> numbers = List.of(new Person("aaaa"));
        List<Person> result = numbers.stream()
                .peek(x->x.Name="dddd")
                .toList();

        System.out.println(result.get(0));
    }
}
class Person {
    String Name;

    public Person(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
