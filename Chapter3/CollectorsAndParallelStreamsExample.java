import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsAndParallelStreamsExample {

    public static void main(String[] args) {

        // ----- Common Collectors -----
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        // toList()
        List<String> nameList = names.stream()
                .collect(Collectors.toList());
        System.out.println("toList: " + nameList);

        // toSet()
        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());
        System.out.println("toSet: " + uniqueNames);

        // joining()
        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("joining: " + joinedNames);

        // groupingBy()
        Map<Integer, List<String>> namesByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("groupingBy (length): " + namesByLength);

        // ----- Parallel Streams with reduce() -----
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel stream sum: " + sum);
    }
}
