import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CoreCollectionsExamples {

    public static void main(String[] args) {

        // ----- List<E> example -----
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("List example (fruits.get(1)): " + fruits.get(1)); // Banana

        // ----- Set<E> example -----
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate, will not be added
        System.out.println("Set example (uniqueNames): " + uniqueNames);

        // ----- Queue<E> example -----
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue example (queue.poll()): " + queue.poll()); // 1

        // ----- Map<K,V> example -----
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        System.out.println("Map example (ageMap.get(\"Alice\")): " + ageMap.get("Alice")); // 25
    }
}
