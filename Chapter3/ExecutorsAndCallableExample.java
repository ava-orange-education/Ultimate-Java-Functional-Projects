import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsAndCallableExample {

    public static void main(String[] args) throws Exception {

        // ----- Executors framework: fixed thread pool with Runnable tasks -----
        ExecutorService pool = Executors.newFixedThreadPool(2);

        List<Runnable> tasks = Arrays.asList(
                () -> System.out.println("Task 1"),
                () -> System.out.println("Task 2")
        );

        for (Runnable task : tasks) {
            pool.submit(task);
        }

        // ----- Future and Callable: task that returns a result -----
        ExecutorService single = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> 10 + 20;
        Future<Integer> future = single.submit(task);

        System.out.println("Result: " + future.get()); // 30

        // shutdown both executors
        pool.shutdown();
        single.shutdown();
    }
}
