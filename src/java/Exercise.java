import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise {

    public static void main(String[] args) throws IOException {
        /*List<String> list = List.of("Spring","Spring Boot","Java");
        List<Integer> listNum = List.of(1,4,3,7,87,54,23,87,24,54,76);
        list.stream().filter(name->name.contains("Spring")).forEach(System.out::println);
        list.stream().filter(course->course.length()>4).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        // Max number in a list
        Integer maxNum = listNum.stream().reduce(0,(x,y)->x>y?x:y);
        System.out.println("List is : "+ listNum + " and max number is : " +maxNum);
        squareOfEvenNumber(listNum);

        System.out.println(listNum.stream().mapToInt(inte->inte.intValue()).sum());
        System.out.println(listNum.stream().reduce(0,Integer::sum));
        System.out.println(listNum.stream().distinct().collect(Collectors.toMap(k->k.intValue(),v->v.intValue())));

        IntStream.rangeClosed(1,10).sum();
        IntStream.range(1,10).sum();*/

        Files.lines(Paths.get("./src/file.txt"))
                .map(file->file.split(" "))
                .flatMap(fl-> Arrays.stream(fl))
                .forEach(System.out::println);
    }

    private static void squareOfEvenNumber(List<Integer> listNum) {
        listNum.stream().filter(num->num%2==0).map(map->map*map).forEach(System.out::println);
    }


}
