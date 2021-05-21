import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondLargestNumberUsingLambda {

    public static void main(String[] args) {
        List lst = Arrays.asList(1,2,4,7,5,8,3,2);
       Optional num = lst.stream().sorted(Comparator.naturalOrder().reversed()).limit(2).skip(1).findFirst();
       System.out.println(num.get());

        List<Integer> lstInt = Arrays.asList(1,2,4,7,5,8,3,2);
        Optional<Integer> numInt = lstInt.stream().sorted((i1,i2)->i2.compareTo(i1)).limit(2).skip(1).findFirst();
        System.out.println(numInt.get());
    }
}
