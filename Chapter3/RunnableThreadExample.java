public class RunnableThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable is running...");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableThreadExample());
        thread.start(); // Starts the thread, calling run()
    }
}
