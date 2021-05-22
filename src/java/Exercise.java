import java.util.Comparator;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        List<String> list = List.of("Spring","Spring Boot","Java");
        List<Integer> listNum = List.of(1,4,3,7,87,54,23,87,24,54,76);
        list.stream().filter(name->name.contains("Spring")).forEach(System.out::println);
        list.stream().filter(course->course.length()>4).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        // Max number in a list
        Integer maxNum = listNum.stream().reduce(0,(x,y)->x>y?x:y);
        System.out.println("List is : "+ listNum + " and max number is : " +maxNum);
        squareOfEvenNumber(listNum);
    }

    private static void squareOfEvenNumber(List<Integer> listNum) {
        listNum.stream().filter(num->num%2==0).map(map->map*map).forEach(System.out::println);
    }


}
